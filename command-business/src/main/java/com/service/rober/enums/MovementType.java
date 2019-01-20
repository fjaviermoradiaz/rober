package com.service.rober.enums;

public enum MovementType {

    LEFT("left"),
    RIGHT("right"),
    FORWARD("forward"),
    BACKWARD("backward");

    private String moveType;

    MovementType(String moveType) {
        this.moveType = moveType;
    }

    public String value() {
        return moveType;
    }

    public static Boolean valid(String move) {
        if(move.equals(LEFT.value()) || move.equals(RIGHT.value())
                || move.equals(FORWARD.value()) || move.equals(BACKWARD.value()))
            return true;
        return false;
    }

}
