package com.orange.exception;

public class EntityAlreadyExistException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public EntityAlreadyExistException(String message) {
        super(message);
    }
}
