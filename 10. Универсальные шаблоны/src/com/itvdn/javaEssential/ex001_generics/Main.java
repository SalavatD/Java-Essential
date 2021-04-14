package com.itvdn.javaEssential.ex001_generics;

/**
 * Универсальные шаблоны.
 * На 8-й строке создаем класс с именем MyClass, параметризированный указателем места заполнения типом - T
 */
class MyClass<T> {
    public T field;

    public void method() {
        System.out.println(field.getClass());
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса MyClass и в качестве параметра типа (тип MyClass) передаем тип String.
        MyClass<String> instance1 = new MyClass<String>();
        instance1.field = "ABC";
        instance1.method();

        // В качестве параметра типа передавать примитивные типы (int, long, float, double, и так далее) нельзя.
        //MyClass<int> instance2 = new MyClass<int>();
        //instance2.method();

        // Создаем экземпляр класса MyClass и в качестве параметра типа (тип MyClass) передаем тип Integer.
        MyClass<Integer> instance2 = new MyClass<Integer>();
        instance2.field = 1234;
        instance2.method();
    }
}
