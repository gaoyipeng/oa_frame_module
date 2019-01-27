package com.sxdx.oa_service.bootTest.exception;

public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("UserNotExistException");
    }
}
