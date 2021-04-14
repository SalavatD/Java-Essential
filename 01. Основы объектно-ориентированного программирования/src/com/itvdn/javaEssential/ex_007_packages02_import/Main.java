package com.itvdn.javaEssential.ex_007_packages02_import;

import com.itvdn.javaEssential.ex_001_class_declaration.Car;

public class Main {
    public static void main(String[] args) {
        // Если класс (Машина) лежит в другом пакете, то что бы его использовать в Классе Main - его надо импортировать
        Car myCar = new Car();
    }
}
