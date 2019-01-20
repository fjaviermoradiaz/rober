package com.service.rober.controller;

import com.service.rober.service.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/communication")
public class CommunicationController {

    @Autowired
    private MessageServiceImpl messageService;

    @PostMapping(value = "/")
    @ResponseBody
    public void sendMessage(String message) {
        messageService.sendMessage(message);
    }
}
