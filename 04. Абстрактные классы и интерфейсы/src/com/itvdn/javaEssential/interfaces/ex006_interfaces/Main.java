package com.itvdn.javaEssential.interfaces.ex006_interfaces;

/**
 * Наследование абстрактных классов от интерфейсов.
 */
interface Interface {
    void method();
}

abstract class AbstractClass implements Interface {
    // Реализация абстрактного метода из интерфейса, в абстрактном классе не обязательна.
    public void method() {
        System.out.println("Method - realizacuya interface v abstraktnom classe.");
    }
}

class ConcreteClass extends AbstractClass {
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }
}
