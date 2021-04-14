package com.itvdn.javaEssential.ex006_exceptions;

import java.io.FileInputStream;

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
            System.out.println("Обработка исключения.");
            userException.method();

            try {
                FileInputStream fs = new FileInputStream("C:\\NonExistentFile.log");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
