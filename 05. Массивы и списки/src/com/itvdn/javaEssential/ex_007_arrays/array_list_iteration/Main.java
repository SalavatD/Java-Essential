package com.itvdn.javaEssential.ex_007_arrays.array_list_iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);

        // с помощью итератора можем бегать по нашему списку
        Iterator<Integer> iterator = arrayList.iterator();

        // спрашиваем есть ли следующий элемент в списке, если true, то будет реализовано тело while
        while (iterator.hasNext()) {
            // переходим к следующему элементу в списке и его выводим
            Integer integer = iterator.next();
            System.out.println(integer);
        }
        // то же самое действие, но через оптимизированный итератор под cписки
        ListIterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            System.out.println(integer);
        }
    }
}
