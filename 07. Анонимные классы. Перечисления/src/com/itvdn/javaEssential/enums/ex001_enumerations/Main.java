package com.itvdn.javaEssential.enums.ex001_enumerations;

/**
 * Перечисляемые типы (enum).
 */
enum Day {
    MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        // Объект со ссылкой на экземпляр перечисляемого типа Day.
        Day today = Day.SATURDAY;
        System.out.println("Today is " + today);

        int number = 4;
        // Нельзя присвоить значение целого типа.
        // today = number;
        // today = 4;
    }
}

