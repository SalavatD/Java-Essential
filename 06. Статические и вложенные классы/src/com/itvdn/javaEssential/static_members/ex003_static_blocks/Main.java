package com.itvdn.javaEssential.static_members.ex003_static_blocks;

/**
 * Статические блоки.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(NotStaticClass.X);

        NotStaticClass instance = new NotStaticClass();
        System.out.println(instance.X);
    }
}
