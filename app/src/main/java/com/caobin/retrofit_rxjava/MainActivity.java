package com.caobin.retrofit_rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.caobin.retrofit_rxjava.http.WeatherService;
import com.caobin.retrofit_rxjava.http.entity.WeatherEntity;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn_mine);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getWeather();
            }
        });
    }

    //进行网络请求,获取天气信息
    private void getWeather() {
        //base URL
        String url = "http://wthrcdn.etouch.cn/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                //json解析
                .addConverterFactory(GsonConverterFactory.create())
                //添加Rxjava
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        WeatherService weatherService = retrofit.create(WeatherService.class);
        //请求参数 "成都"
        weatherService.getWeatherInfo("成都")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WeatherEntity>() {
                    @Override
                    public void onCompleted() {
                        Toast.makeText(MainActivity.this, "请求完成", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.err.println("错误信息：" + e.getMessage());
                    }

                    @Override
                    public void onNext(WeatherEntity weatherEntity) {
                        System.err.println("温度：" + weatherEntity.getData().getWendu());
                    }
                });
    }
}
