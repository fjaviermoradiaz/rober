package com.service.rober.dto;


import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;

@Component
public class MovementDTO {

    @NotEmpty
    private String direction;
    private Float distance;


    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }
}
