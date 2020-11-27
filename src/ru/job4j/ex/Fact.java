package ru.job4j.ex;

public class Fact {
    public static int calc(int n) {
        int rsl = 1;
        if (n < 0) {
            throw new IllegalArgumentException("The value must be greater than or equal to 0");
        }
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
    public static void main(String[] args) {
        int n = -5;
        System.out.println("The Factorial of " + n + " is " + Fact.calc(n));
    }


}
