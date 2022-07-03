package com.tietoevry.test.dto.request;

public class TipsReqDto {
    private int km;
    private int weightKg;
    private int yearsOld;
    private int avgSpeed;
    private String weather;
    private int heightCm;

    public TipsReqDto(int km, int weightKg, int yearsOld, int avgSpeed, String weather, int heightCm) {
        this.km = km;
        this.weightKg = weightKg;
        this.yearsOld = yearsOld;
        this.avgSpeed = avgSpeed;
        this.weather = weather;
        this.heightCm = heightCm;
    }

    public int getKm() {
        return this.km;
    }

    public int getWeightKg() {
        return this.weightKg;
    }

    public int getYearsOld() {
        return this.yearsOld;
    }

    public int getAvgSpeed() {
        return avgSpeed;
    }

    public String getWeather() {
        return this.weather;
    }

    public int getHeightCm() {
        return this.heightCm;
    }

    @Override
    public String toString() {
        return "TipsReqDto [avgSpeed=" + avgSpeed + ", heightCm=" + heightCm + ", km=" + km + ", weather=" + weather
                + ", weightKg=" + weightKg + ", yearsOld=" + yearsOld + "]";
    }

}
