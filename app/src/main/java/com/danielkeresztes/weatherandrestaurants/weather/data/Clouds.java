package com.danielkeresztes.weatherandrestaurants.weather.data;


import com.google.gson.annotations.SerializedName;

public class Clouds {

    @SerializedName("all")
    private double all;

    public double getAll() {
        return all;
    }

    public void setAll(double all) {
        this.all = all;
    }
}
