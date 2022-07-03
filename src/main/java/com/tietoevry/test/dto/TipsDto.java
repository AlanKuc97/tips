package com.tietoevry.test.dto;

import java.util.Arrays;

public class TipsDto {
    private double kcalPerDay;
    private double approximateDaysInTrip;
    private double stopsForSleep;
    private String[] optional;

    public double getKcalPerDay() {
        return this.kcalPerDay;
    }

    public void setKcalPerDay(double kcalPerDay) {
        this.kcalPerDay = kcalPerDay;
    }

    public double getApproximateDaysInTrip() {
        return this.approximateDaysInTrip;
    }

    public void setApproximateDaysInTrip(double approximateDaysInTrip) {
        this.approximateDaysInTrip = approximateDaysInTrip;
    }

    public double getStopsForSleep() {
        return this.stopsForSleep;
    }

    public void setStopsForSleep(double stopsForSleep) {
        this.stopsForSleep = stopsForSleep;
    }

    public String[] getOptional() {
        return this.optional;
    }

    public void setOptional(String[] optional) {
        this.optional = optional;
    }

    @Override
    public String toString() {
        return "TipsDto [approximateDaysInTrip=" + approximateDaysInTrip + ", kcalPerDay=" + kcalPerDay + ", optional="
                + Arrays.toString(optional) + ", stopsForSleep=" + stopsForSleep + "]";
    }

}
