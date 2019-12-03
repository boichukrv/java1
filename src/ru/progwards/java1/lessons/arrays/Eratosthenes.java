package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private int N;
    private boolean[] sieve;

    public Eratosthenes(int N) {
        this.N = N;
        sieve = new boolean[N];
        Arrays.fill(sieve, true);
        sift();
    }

    private void sift() {
        for (int i = 2; i < N; i++)
            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0) {
                    sieve[i] = false;
                    break;
                }
            }

    }

    public boolean isSimple(int n){
        return sieve[n-1];
    }


    public static void main(String[] args) {
        Eratosthenes E1 = new Eratosthenes(300);
        System.out.println(E1.isSimple(299));

    }
}