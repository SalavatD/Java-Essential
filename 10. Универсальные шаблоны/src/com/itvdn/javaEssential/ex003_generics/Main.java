package com.itvdn.javaEssential.ex003_generics;

/**
 * Универсальные шаблоны. (Универсальный метод)
 */
class MyClass {
    public <T> void method(T argument) {
        T variable = argument;

        System.out.println(variable);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass instance = new MyClass();

        instance.method("Hello world!");
    }
}
