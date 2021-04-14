package com.itvdn.javaEssential.static_members.ex002_static;

public class NotStaticClass {
    private int id;

    // Конструктор.
    public NotStaticClass(int id) {
        this.id = id;
    }

    public static void method() {
        //System.out.println("Instance.id = {0}", id);

        System.out.println("Can't invoke non-static field");
    }
}
