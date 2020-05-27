package ru.job4j.condition;

public class SqArea2 {
    public static int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = k * h;
        int s = w * h;
        return s;
    }
    public static void main(String[] args) {
        int result1 = SqArea2.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real s = " + result1);
    }
}
