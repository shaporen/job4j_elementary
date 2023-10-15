package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int forth) {
        return max(first, max(second, third, forth));
    }

    public static void main(String[] args) {
        int resultOne = Max.max(-1, 3);
        System.out.println(resultOne);
        int resultTwo = max(2, -1, 5);
        System.out.println(resultTwo);
    }
}
