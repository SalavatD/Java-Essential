package com.itvdn.javaEssential.abstraction.ex006_abstraction;

abstract class AbstractClass {
    // Конструктор (отрабатывает первым).
    public AbstractClass() {
        System.out.println("1 AbstractClass()");

        // Вызывается реализация метода из производного класса - ConcreteClass.
        this.abstractMethod();

        System.out.println("2 AbstractClass()");
    }

    public abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {
    String s = "FIRST";

    // Конструктор (отрабатывает вторым).
    public ConcreteClass() {
        System.out.println("3 ConcreteClass()");
        s = "SECOND";
    }

    @Override
    public void abstractMethod() {
        System.out.println("Realizacuya methoda abstractMethod() v ConcreteClass  " + s);
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass();

        System.out.println("-------------------------------");

        instance.abstractMethod();
    }
}
