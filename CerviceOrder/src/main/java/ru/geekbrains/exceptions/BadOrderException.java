package ru.geekbrains.exceptions;

public class BadOrderException  extends OrderException {

    @Override
    public String getMessage() {
        return "Неверный UUID заказа";
    }
}
