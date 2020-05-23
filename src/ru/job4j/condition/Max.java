package ru.job4j.condition;

import com.sun.jdi.connect.Connector;

public class Max {
    public static int max(int first, int second) {
        boolean rst = first > second;
        int r = rst ? first : second;
        return r;
    }

    public static void main(String[] args) {
        int i = Max.max(2, 2);
        System.out.println(i);
    }
}
