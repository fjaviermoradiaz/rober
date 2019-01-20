package com.service.rober.service.impl;

import com.service.rober.client.RoberBusCommunicationService;
import com.service.rober.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private RoberBusCommunicationService busCommunicationService;

    @Override
    public void sendMessage(String message) {
        busCommunicationService.sendMessage(message);
    }
}
