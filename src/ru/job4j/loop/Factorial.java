package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int x = 1; x <= n; x++) {
                result = result * x;
            }
        return result;
    }

    public static void main(String[] args) {
        int res = Factorial.calc(0);
        System.out.println(res);
    }
}



