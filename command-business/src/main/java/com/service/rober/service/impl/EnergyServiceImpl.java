package com.service.rober.service.impl;

import com.service.rober.client.RoberBusCommunicationService;
import com.service.rober.service.EnergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnergyServiceImpl implements EnergyService {

    @Autowired
    private RoberBusCommunicationService busCommunicationService;

    @Override
    public void charge() {
        busCommunicationService.charge();
    }
}
