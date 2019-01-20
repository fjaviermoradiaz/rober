package com.service.rober.controller;

import com.service.rober.service.impl.EnergyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/energy")
public class EnergyController {

    @Autowired
    private EnergyServiceImpl energyService;

    @PostMapping(value = "/")
    @ResponseBody
    public void charge() {
        energyService.charge();
    }
}
