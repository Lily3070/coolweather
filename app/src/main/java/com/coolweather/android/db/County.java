package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * @author xiaoxin       2020/4/12
 * @version $Rev$
 * @des ${数据库建表————县}
 * @updateAuthor $Author$
 * @updateDes ${T000}
 */

public class County extends LitePalSupport{

    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
