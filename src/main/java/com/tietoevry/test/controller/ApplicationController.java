package com.tietoevry.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tietoevry.test.dto.TipsDto;
import com.tietoevry.test.dto.request.TipsReqDto;
import com.tietoevry.test.service.TipsService;

@RestController
@RequestMapping(path = "api/tietoevry")
public class ApplicationController {

    @Autowired
    TipsService tipsService;

    public ApplicationController(TipsService tipsService) {
        this.tipsService = tipsService;
    }

    @RequestMapping(value = "/get-tips", method = RequestMethod.POST)
    public TipsDto getTips(@RequestBody TipsReqDto requestData) {
        return tipsService.getTips(requestData);
    }
}
