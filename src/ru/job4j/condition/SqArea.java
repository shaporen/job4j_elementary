package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rsl = Math.pow((p / (2 * (k + 1))), 2) * k;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(3, 3);
        System.out.println(" p = 10, k = 2, s = 2, real s = " + result1);
    }
}
