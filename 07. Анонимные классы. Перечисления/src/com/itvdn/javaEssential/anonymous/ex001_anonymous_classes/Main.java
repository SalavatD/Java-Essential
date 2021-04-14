package com.itvdn.javaEssential.anonymous.ex001_anonymous_classes;

/**
 * Анонимные классы.
 */
interface Interface1 {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // Объявление анонимного (внутреннего) класса
        Interface1 instance = new Interface1() {
            @Override
            public void method() {
                System.out.println("Call method() from anonymous class");
            }
        };

        // Вызов метода объекта анонимного класса
        instance.method();
    }
}
