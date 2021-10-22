package com.lab111.test;

public class FileIsClosed extends RuntimeException {
    public FileIsClosed() {
    }

    public FileIsClosed(String message) {
        super(message);
    }

    public FileIsClosed(String message, Throwable cause) {
        super(message, cause);
    }

    public FileIsClosed(Throwable cause) {
        super(cause);
    }

    public FileIsClosed(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
