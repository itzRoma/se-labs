package com.lab111.test;

public class FileIsNotExists extends RuntimeException {
    public FileIsNotExists() {
    }

    public FileIsNotExists(String message) {
        super(message);
    }

    public FileIsNotExists(String message, Throwable cause) {
        super(message, cause);
    }

    public FileIsNotExists(Throwable cause) {
        super(cause);
    }

    public FileIsNotExists(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
