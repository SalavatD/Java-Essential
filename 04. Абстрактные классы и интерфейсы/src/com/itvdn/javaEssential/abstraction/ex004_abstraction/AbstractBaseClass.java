package com.itvdn.javaEssential.abstraction.ex004_abstraction;

public abstract class AbstractBaseClass {
    // 1.
    // Метод передается производному классу как при наследовании от конкретного класса.
    public void simpleMethod() {
        System.out.println("AbstractBaseClass.simpleMethod");
    }

    // 2.
    // Метод передается производному классу как при наследовании от конкретного класса.
    // Перегружен в производном классе
    public void overriddenMethod() {
        System.out.println("AbstractBaseClass.overriddenMethod");
    }

    // 3.
    // Абстрактный метод - реализуется в производном классе.
    abstract public void abstractMethod();
}
