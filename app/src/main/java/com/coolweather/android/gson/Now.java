package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author xiaoxin    2020/4/14
 * @version $Rev$
 * @des ${天气}
 * @updateAuthor $Author$
 * @updateDes ${T000}
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
