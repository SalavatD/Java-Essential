package com.itvdn.javaEssential.ex005_exceptions;

/**
 * Обработка исключений.
 */
class UserException extends Exception {
    public void method() {
        System.out.println("Мое исключение!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            System.out.println("Обработка исключения.");
            e.method();
        }
    }
}
