package com.base.exception;

public class AggregateNotFoundException  extends RuntimeException{
    public AggregateNotFoundException(String message) {
        super(message);
    }
}
