package com.itvdn.javaEssential.static_members.ex004_static_blocks;

/**
 * Статические блоки.
 * Статических блоков может быть сколько угодно и вызываться они будут в том же порядке, в котором написаны.
 */
public class NotStaticClass {
    static int x;

    static {
        x = 1;
        System.out.println("Static block  x = " + x);
    }

    static {
        x = 23;
        System.out.println("Static block  x = " + x);
    }

    static {
        x = -99;
        System.out.println("Static block  x = " + x);
    }

    public NotStaticClass(int x) {
        this.x = x;
        System.out.println("Constructor  X = " + x);
    }
}
