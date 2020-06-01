package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        } else {
        if (second >= first && second >= third) {
            result = second;
        }
        }
        return result;

    }
    public static void main(String[] args) {
        int res = ThreeMax.max(1, 100, 100);
        System.out.println(res);
    }
}
