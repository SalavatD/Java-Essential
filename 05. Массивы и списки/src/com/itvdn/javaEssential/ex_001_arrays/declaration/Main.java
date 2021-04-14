package com.itvdn.javaEssential.ex_001_arrays.declaration;

public class Main {
    public static void main(String[] args) {
        // объявление массива
        int[] arr1;
        int arr2[]; // не рекоммендуется
        arr1 = new int[5]; // объявили размерность в 5 элементов
        int[] arr3 = new int[100];

        int[] arr4 = {12, 25, 33, 41, 13, 98}; // размер массива 6

        System.out.println(arr4.length); //  длинна массива
    }
}
