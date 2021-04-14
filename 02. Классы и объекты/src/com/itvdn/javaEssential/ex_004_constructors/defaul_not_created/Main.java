package com.itvdn.javaEssential.ex_004_constructors.defaul_not_created;

public class Main {
    public static void main(String[] args) {
        // мы объявили конструтор с параметрами внутри класса Animal, поэтому конструктор по умолчанию создан не был.

        // при создании объекта без параметов - компилятор будет ругаться
         Animal animal = new Animal();
    }
}