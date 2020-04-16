package com.coolweather.android.gson;

/**
 * @author xiaoxin    2020/4/14
 * @version $Rev$
 * @des ${空气质量类}
 * @updateAuthor $Author$
 * @updateDes ${T000}
 */

public class AQI {

    public AQICity city;


    public class AQICity {

        public String aqi;
        public String pm25;
    }
}
