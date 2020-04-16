package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author xiaoxin   2020/4/14
 * @version $Rev$
 * @des ${总的实例类 引用 各个实例类}
 * @updateAuthor $Author$
 * @updateDes ${T000}
 */

public class Weather {

    public String status;        //成功返回：OK    失败返回：失败原因

    public Basic basic;

    public AQI aqi;

    public  Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
