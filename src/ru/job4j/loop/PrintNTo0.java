package ru.job4j.loop;

public class PrintNTo0 {
    public static void out(int n) {
        for (int i = n - 1; i >= 0; i--) {
            n = n - 1;
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        out(5);
    }
}
