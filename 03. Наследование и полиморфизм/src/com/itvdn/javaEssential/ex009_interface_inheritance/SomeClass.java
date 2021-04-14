package com.itvdn.javaEssential.ex009_interface_inheritance;

/**
 * Наследование.
 */
public class SomeClass implements SomeInterface1, SomeInterface2, SomeInterface3 {
    public void method1() {
        System.out.println("method1");
    }

    public void method2() {
        System.out.println("method2");
    }

    public void method3() {
        System.out.println("method3");
    }
}
