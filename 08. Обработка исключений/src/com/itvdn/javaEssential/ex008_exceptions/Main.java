package com.itvdn.javaEssential.ex008_exceptions;

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
        } catch (UserException userException) {
            System.out.println("Обработка исключения 1:");
            userException.method();

            try {
                throw userException;
            } catch (UserException exception) {
                System.out.println("Обработка исключения 2:");
                exception.method();
            }
        } finally {
            System.out.println("Блок finally.");
        }

        System.out.println("Конец кода.");
    }
}
