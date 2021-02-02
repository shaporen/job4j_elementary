package ru.job4j.condition;

import com.sun.jdi.connect.Connector;

public class Max {
    public static int max(int first, int second) {
        boolean rst = first > second;
        return rst ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int firth) {
        return max(max(first, second), max(third, firth));
    }

    public static void main(String[] args) {
        int i = Max.max(3, 5);
        int y = Max.max(3, 5, 7);
        int z = Max.max(5, 3, 9, 1);
        System.out.println(i);
        System.out.println(y);
        System.out.println(z);
    }
}
