package com.danielkeresztes.weatherandrestaurants.weather.data;


import com.google.gson.annotations.SerializedName;

public class Wind {

    @SerializedName("speed")
    private double speed;

    @SerializedName("deg")
    private double deg;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }
}
