package com.itvdn.javaEssential.ex001_exceptions;

/**
 * Обработка исключений.
 */
public class Main {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            // Попытка деления на ноль.
            a = a / (2 - n);
            System.out.println("a = " + a);
        } catch (Exception e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        }
    }
}
