package ru.geekbrains.exceptions;

public abstract class OrderException extends RuntimeException{

    public OrderException() {
        super();
    }

    public OrderException(String message) {
        super(message);
    }
}
