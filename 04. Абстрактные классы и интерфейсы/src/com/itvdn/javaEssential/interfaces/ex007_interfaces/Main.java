package com.itvdn.javaEssential.interfaces.ex007_interfaces;

/**
 * Наследование абстрактных классов от интерфейсов.
 */
interface Interface {
    void method();
}

abstract class AbstractClass implements Interface {
    //  Перезапись абстрактного метода из интерфейса, в абстрактном классе не обязательна.
    public abstract void method();
}

class ConcreteClass extends AbstractClass {
    // Реализация абстрактного метода из абстрактного класса, в конкретном классе обязательна.
    public void method() {
        System.out.println("Method - realizacuya interface v abstraktnom classe.");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }
}
