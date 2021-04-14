package com.itvdn.javaEssential.nested_classes.ex003_nestedclasses;

/**
 * Вложенные классы.
 */
class MyClass {
    private int field = 0;

    public class Nested {
        MyClass instance = new MyClass();

        public void method(int a) {
            instance.field = a;

            System.out.println(instance.field);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass().new Nested();

        instance.method(1);
    }
}
