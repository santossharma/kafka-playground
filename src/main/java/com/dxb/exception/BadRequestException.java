package com.dxb.exception;

/**
 * Created by santoshsharma on 07 May, 2022
 */

public class BadRequestException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BadRequestException(String message) {
        super(message);
    }
}
