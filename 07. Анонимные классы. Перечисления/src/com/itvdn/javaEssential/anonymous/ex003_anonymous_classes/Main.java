package com.itvdn.javaEssential.anonymous.ex003_anonymous_classes;

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
            public int publicField = 3;

            @Override
            public void method() {
                publicField = 1234;
                System.out.println("instance1: publicField = " + getPublicField());
            }

            public int getPublicField() {
                return publicField;
            }
        };

        instance.method();

        // Метод не доступен
        // System.out.println(instance.getPublicField());
    }
}
