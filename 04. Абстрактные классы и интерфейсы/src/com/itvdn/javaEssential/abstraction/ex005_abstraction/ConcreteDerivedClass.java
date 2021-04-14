package com.itvdn.javaEssential.abstraction.ex005_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {
    // ≈сли мы не переопределим метод, то будет использован метод из базового класса.

    // public void simpleMethod() {
    //     System.out.println("ConcreteDerivedClass.simpleMethod");
    // }

    // –еализуем абстрактный метод abstractMethod() базового абстрактного класса.
    @Override
    public void abstractMethod() {
        System.out.println("ConcreteDerivedClass.abstractMethod();");
    }
}
