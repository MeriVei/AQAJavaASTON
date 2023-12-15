package org.example.maven;

public class Main {
    public static void main(String[] args) {
        System.out.println(factprial(3));
    }

    public static int factprial(int k) {
        if (k < 0) {
            throw new IllegalArgumentException();
        }
        int a = 1;
        for (int i = 1; i <= k; i++) {
            a *= i;
        }
        return a;
    }
}