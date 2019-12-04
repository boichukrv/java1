package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {

    public int[] set = {};


    DIntArray() {
    }

    public void add(int num) {
        int[] temp = Arrays.copyOf(set, set.length + 1);
        set = temp;
        set[set.length - 1] = num;
    }

    public void atInsert(int pos, int num) {
        int[] temp = new int[set.length + 1];
        System.arraycopy(set, 0, temp, 0, pos - 1);
        temp[pos - 1] = num;
        System.arraycopy(set, pos - 1, temp, pos, (set.length - pos + 1));
        set = temp;
    }

    public void atDelete(int pos) {
        int[] temp = new int[set.length - 1];
        System.arraycopy(set, 0, temp, 0, pos);
        System.arraycopy(set, pos, temp, pos - 1, (set.length - pos));
        set = temp;
    }

    public int at(int pos) {
        return set[pos - 1];
    }
}
