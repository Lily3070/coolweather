package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author xiaoxin   2020/4/14
 * @version $Rev$
 * @des ${未来天气}
 * @updateAuthor $Author$
 * @updateDes ${T000}
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;


    public class Temperature {

        public String max;
        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
