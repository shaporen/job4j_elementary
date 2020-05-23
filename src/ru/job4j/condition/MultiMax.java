package ru.job4j.condition;

public class MultiMax {
    public static int max(int a, int b, int c) {

        if (a > b & a > c) {
            return a;
        } else {
            if (b > a & b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        int result = MultiMax.max(4, 7, 3);
        System.out.println(result);
    }
}