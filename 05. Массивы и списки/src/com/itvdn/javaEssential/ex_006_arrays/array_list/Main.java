package com.itvdn.javaEssential.ex_006_arrays.array_list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("name");
        arrayList.add("surname");

        // задаем вместимость листа
        arrayList.ensureCapacity(30);

        // размер листа на текущее время
        System.out.println(arrayList.size());

        // достаем элемент по индексу
        System.out.println(arrayList.get(1));

        // Ошибка IndexOutOfBoundException
        // System.out.println(arrayList.get(2));

        // достаем индекс объекта
        System.out.println(arrayList.indexOf("name"));

        //достаем индекс объекта с конца
        System.out.println(arrayList.lastIndexOf("surname"));
    }
}
