package com.itvdn.javaEssential.ex003_exceptions;

/**
 * Обработка исключений.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Мое исключение");
        } catch (Exception e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        }
    }
}
