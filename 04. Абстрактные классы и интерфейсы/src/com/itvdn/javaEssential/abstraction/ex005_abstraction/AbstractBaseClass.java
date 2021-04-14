package com.itvdn.javaEssential.abstraction.ex005_abstraction;

public abstract class AbstractBaseClass {
    // 1.
    // ћетод передаетс€ производному классу как при наследовании от конкретного класса.
    public void simpleMethod() {
        System.out.println("AbstractBaseClass.simpleMethod");
    }

    // 2.
    // јбстрактный метод - реализуетс€ в производном классе.
    abstract public void abstractMethod();
}
