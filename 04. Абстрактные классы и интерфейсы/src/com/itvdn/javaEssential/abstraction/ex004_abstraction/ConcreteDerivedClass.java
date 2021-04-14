package com.itvdn.javaEssential.abstraction.ex004_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {
    // ѕереопредел€ем метод overriddenMethod() базового абстрактного класса.
    // ≈сли мы не переопределим метод, то будет использован метод из базового класса.

    @Override
    public void overriddenMethod() {
        System.out.println("DerivedClass.overriddenMethod();");
    }

    // –еализуем абстрактный метод abstractMethod() базового абстрактного класса.
    @Override
    public void abstractMethod() {
        System.out.println("DerivedClass.abstractMethod();");
    }
}
