package com.example.listycitylab3;

import java.io.Serializable;

public class City implements Serializable {
    private String name;
    private String province;
    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }
    public String getName() {
        return name;
    }

    public void setCityName(String new_name){
        name = new_name;
    }

    public void setProvince(String new_province){
        province = new_province;
    }

    public String getProvince() {
        return province;
    }
}
