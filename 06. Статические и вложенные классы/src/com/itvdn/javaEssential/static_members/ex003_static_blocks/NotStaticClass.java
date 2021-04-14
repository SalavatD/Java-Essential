package com.itvdn.javaEssential.static_members.ex003_static_blocks;

/**
 * Статические блоки.
 * Статический блок вызывается, когда класс подгружается в память.
 */
public class NotStaticClass {
    public static final int X;

    // Статический блок.
    static {
        X = 10;
        System.out.println("Static block  X = " + X);
    }

    public NotStaticClass() {
        // X = 4; // Ошибка, так как статический блок вызывается раньше, чем конструктор.
        System.out.println("Constructor  X = " + X);
    }
}
