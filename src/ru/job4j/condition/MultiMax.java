package ru.job4j.condition;

public class MultiMax {
    public static int max(int a, int b, int c) {
        int d = (a > b) ? a : b;
        int e = (d > c) ? d : c;
        return e;
        }

    public static void main(String[] args) {
        int result = MultiMax.max(4, 7, 10);
        System.out.println(result);
    }
}