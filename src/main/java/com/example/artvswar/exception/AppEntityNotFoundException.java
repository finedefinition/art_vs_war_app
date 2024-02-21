package com.example.artvswar.exception;

public class AppEntityNotFoundException extends RuntimeException {
    public AppEntityNotFoundException(String message) {
        super(message);
    }

    public AppEntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
