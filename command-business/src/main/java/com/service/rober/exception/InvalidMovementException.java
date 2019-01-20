package com.service.rober.exception;

public class InvalidMovementException extends Exception {

    public InvalidMovementException() {
        super();
    }

    public InvalidMovementException(String message) {
        super(message);
    }

    public InvalidMovementException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidMovementException(Throwable cause) {
        super(cause);
    }

    protected InvalidMovementException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
