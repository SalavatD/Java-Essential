package com.itvdn.javaEssential.ex_004_class_object_equals_overriden;

public class Main {
    public static void main(String[] args) {
        // создаем объкты с одинаковыми параметрами

        Car car1 = new Car(2);
        Car car2 = new Car(2);
        Car car3 = car1;

        // метод equals сравнивает уже по инструкции, которую мы описали в перезаписанном методе сравниваемого класса
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
    }
}
