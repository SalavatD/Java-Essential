package com.itvdn.javaEssential.ex004_exceptions;

/**
 * Обработка исключений.
 */
class MyClass {
    public void myMethod() throws Exception {
        Exception exception = new Exception("Мое исключение");
        throw exception;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            MyClass instance = new MyClass();
            instance.myMethod();
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
}
