package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author xiaoxin    2020/4/14
 * @version $Rev$
 * @des ${城市基本信息类}
 * @updateAuthor $Author$
 * @updateDes ${T000}
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;          //更新时间


    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
