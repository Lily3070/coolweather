package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author xiaoxin    2020/4/14
 * @version $Rev$
 * @des ${建议}
 * @updateAuthor $Author$
 * @updateDes ${T000}
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
