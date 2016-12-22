package com.caobin.retrofit_rxjava.http.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 请求天气参数对象
 * Created by caobin on 2016/12/8.
 */
public class WeatherEntity implements Serializable {

    private static final long serialVersionUID = 8262656362783543503L;
    private String desc;
    private int status;
    private WeatherInfo data;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public WeatherInfo getData() {
        return data;
    }

    public void setData(WeatherInfo data) {
        this.data = data;
    }

    /**
     *
     */
    public static class WeatherInfo {
        /**
         * wendu : 12
         * ganmao : 昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。
         * forecast : [{"fengxiang":"无持续风向","fengli":"微风级","high":"高温 12℃","type":"多云","low":"低温 7℃","date":"13日星期二"},
         * {"fengxiang":"无持续风向","fengli":"微风级","high":"高温 12℃","type":"小雨","low":"低温 7℃","date":"14日星期三"},
         * {"fengxiang":"无持续风向","fengli":"微风级","high":"高温 12℃","type":"小雨","low":"低温 2℃","date":"15日星期四"},
         * {"fengxiang":"南风","fengli":"微风级","high":"高温 13℃","type":"晴","low":"低温 8℃","date":"16日星期五"},
         * {"fengxiang":"南风","fengli":"微风级","high":"高温 13℃","type":"多云","low":"低温 8℃","date":"17日星期六"}]
         * yesterday : {"fl":"微风","fx":"北风","high":"高温 14℃","type":"阴","low":"低温 7℃","date":"12日星期一"}
         * aqi : 130
         * city : 成都
         */

        private String wendu;
        private String ganmao;
        private YesterdayInfo yesterday;
        private String aqi;
        private String city;
        private List<WeatherDetailsInfo> forecast;

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public YesterdayInfo getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayInfo yesterday) {
            this.yesterday = yesterday;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public List<WeatherDetailsInfo> getForecast() {
            return forecast;
        }

        public void setForecast(List<WeatherDetailsInfo> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayInfo {
            /**
             * fl : 微风
             * fx : 北风
             * high : 高温 14℃
             * type : 阴
             * low : 低温 7℃
             * date : 12日星期一
             */

            private String fl;
            private String fx;
            private String high;
            private String type;
            private String low;
            private String date;

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class WeatherDetailsInfo {
            /**
             * fengxiang : 无持续风向
             * fengli : 微风级
             * high : 高温 12℃
             * type : 多云
             * low : 低温 7℃
             * date : 13日星期二
             */

            private String fengxiang;
            private String fengli;
            private String high;
            private String type;
            private String low;
            private String date;

            public String getFengxiang() {
                return fengxiang;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public String getFengli() {
                return fengli;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }
    }
}
