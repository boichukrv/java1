package ru.progwards.java1.lessons.arrays;


import java.util.Arrays;

public class ArraySort {

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++){
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                a[i] = a[i] + a[j];
                a[j] = a[i] - a[j];
                a[i] = a[i] - a[j];
                }
            }
        }

    }

}