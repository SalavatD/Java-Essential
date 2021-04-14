package com.itvdn.javaEssential.interfaces.ex003_interfaces;

public class DerivedClass extends BaseClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Realizacuya methoda method1() iz Interface1");
    }

    public void method2() {
        System.out.println("Realizacuya methoda method2() iz Interface2");
    }
}
