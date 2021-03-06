package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * @author xiaoxin       2020/4/12
 * @version $Rev$
 * @des ${数据库建表————市}
 * @updateAuthor $Author$
 * @updateDes ${T000}
 */

public class City extends LitePalSupport{

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
