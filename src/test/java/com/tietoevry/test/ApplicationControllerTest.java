package com.tietoevry.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tietoevry.test.controller.ApplicationController;
import com.tietoevry.test.dto.TipsDto;
import com.tietoevry.test.dto.request.TipsReqDto;
import com.tietoevry.test.service.TipsService;

public class ApplicationControllerTest {

    @Test
    void controllerTest() {
        TipsReqDto request = new TipsReqDto(0, 0, 0, 0, null, 0);
        ApplicationController controller = new ApplicationController(new TipsService());
        TipsDto response = controller.getTips(request);
        assertEquals("TipsDto [approximateDaysInTrip=" + 0 + ", kcalPerDay=" + 0 + ", optional="
                + null + ", stopsForSleep=" + 0 + "]", response.toString());

        request = new TipsReqDto(100, 80, 25, 5, "HOT", 190);
        response = controller.getTips(request);
        assertEquals("TipsDto [approximateDaysInTrip=" + 4 + ", kcalPerDay=" + 3727 +
                ", optional=["
                + "Sunburn Relief Products, Hat, Water" + "], stopsForSleep=" + 3 + "]",
                response.toString());
    }

}
