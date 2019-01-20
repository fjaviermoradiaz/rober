package com.service.rober.client;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class RoberBusCommunicationService {

    public void connect() {
        System.out.println("Connection stablished with rober");
    }

    public Boolean move(String direction, Float distance) {
        System.out.println("Robers moving to " + direction + " " + distance + " meter(s)");
        return true;
    }

    public void disconnect() {
        System.out.println("Rober disconnected");
    }

    public void charge() {
        System.out.println("Rober is charging");
    }

    public void sendMessage(String message) {
        System.out.println("Sending message to rober: " + message);
    }
}
