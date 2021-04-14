package com.itvdn.javaEssential.abstraction.ex002_abstraction;

/**
 * Конкретный класс A.
 */
class ConcreteClassA {
    public void operation() {
        System.out.println("ConcreteClassA.operation");
    }
}

/**
 * Абстрактный класс.
 */
abstract class AbstractClass extends ConcreteClassA {
    public abstract void method();
}

/**
 * Конкретный класс B.
 */
class ConcreteClassB extends AbstractClass {
    @Override
    public void method() {
        System.out.println("ConcreteClassB.method");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClassB();

        instance.method();
        instance.operation();
    }
}
