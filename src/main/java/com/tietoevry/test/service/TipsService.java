package com.tietoevry.test.service;

import org.springframework.stereotype.Service;

import com.tietoevry.test.dto.TipsDto;
import com.tietoevry.test.dto.request.TipsReqDto;

@Service
public class TipsService {
    private final static int WALK_HOURS_PER_DAY = 6;

    public TipsDto getTips(TipsReqDto requestData) {
        TipsDto response = new TipsDto();
        if (requestData.getKm() > 0 && requestData.getAvgSpeed() > 0) {
            response.setApproximateDaysInTrip(Math.ceil(
                    (float) requestData.getKm() / (requestData.getAvgSpeed() * WALK_HOURS_PER_DAY)));
        }

        if (response.getApproximateDaysInTrip() > 0) {
            response.setStopsForSleep(response.getApproximateDaysInTrip() - 1);
        }

        if (requestData.getWeightKg() > 0 && requestData.getHeightCm() > 0 && requestData.getYearsOld() > 0) {
            // Most people burn an average of 100 calories per mile walking.
            double kcalBurnedWalking = Math.round(100 * (requestData.getAvgSpeed() * WALK_HOURS_PER_DAY * 0.62));

            // Mifflin-St Jeor Equation
            // BMR for men = 10 X Weight + 6.25 X Height - 5 X Age + 5
            response.setKcalPerDay(10 * requestData.getWeightKg() +
                    6.25 * requestData.getHeightCm() -
                    5 * requestData.getYearsOld() + 5 + kcalBurnedWalking);

        }

        if (requestData.getWeather() != null) {
            switch (requestData.getWeather()) {
                case "HOT":
                    response.setOptional(new String[] { "Sunburn Relief Products", "Hat", "Water" });
                    break;
                case "COLD":
                    response.setOptional(new String[] { "Warm Clothing", "Umbrella", "Water" });
                    break;
            }
        }
        return response;
    }
}
