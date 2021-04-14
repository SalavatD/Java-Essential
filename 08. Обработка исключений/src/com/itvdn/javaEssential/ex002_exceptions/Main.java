package com.itvdn.javaEssential.ex002_exceptions;

/**
 * Обработка исключений.
 */
public class Main {
    public static void main(String[] args) {
        Exception ex = new Exception("Мое исключение");

        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        }
    }
}
