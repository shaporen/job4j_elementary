package ru.job4j.condition;

public class BonusCupCoffee {

    public static int countCup(int count, int n) {
        int b;
        if (count >= n) {
        b = count + count / n;
        } else {
            b = count;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(countCup(213,6));
    }
}

