package com.itvdn.javaEssential.anonymous.ex002_anonymous_classes;

/**
 * Анонимные классы.
 */
interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // Объявление анонимного (внутреннего) класса
        Interface instance = new Interface() {
            public double d = 1.3;
            protected String str = "Anonymous class";
            private int num = 10;

            @Override
            public void method() {
                num = 1234;
                System.out.println("instance1: d = " + d + ", str = " + str + ", num = " + num);
            }
        };
        instance.method();

        // Поле не доступно
        // System.out.println(instance.d);
    }
}
