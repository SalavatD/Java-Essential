package com.itvdn.javaEssential.ex006_inheritance;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.method();

        // UpCast
        BaseClass instanceUp = instance;
        instanceUp.method();

        // DownCast
        DerivedClass instanceDown = (DerivedClass) instanceUp;
        instanceDown.method();
    }
}
