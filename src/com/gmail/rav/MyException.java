package com.gmail.rav;

public class MyException extends Exception {

    @Override
    public String getMessage() {
        return "Лови исключение";
    }
}
