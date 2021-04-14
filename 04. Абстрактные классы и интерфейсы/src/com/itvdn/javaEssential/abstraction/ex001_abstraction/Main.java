package com.itvdn.javaEssential.abstraction.ex001_abstraction;

/**
 * Абстрактный класс.
 */
abstract class AbstractClass {
    public abstract void method();
}

/**
 * Конкретный класс.
 */
class ConcreteClass extends AbstractClass {
    public void method() {
        System.out.println("Implementation");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass();

        instance.method();
    }
}
