package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int x = start; x <= finish; x++) {
            sum = sum + x;
        }
        return sum;
    }
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        int a = 0;
        for (int x = start; x <= finish; x++) {
            if ((x % 2) == 0) {
                sum = sum + x;
            }
        }
        return sum + a;
    }
        public static void main(String[] args) {
            System.out.println(Counter.sum(0, 10));
            System.out.println(Counter.sum(3, 8));
            System.out.println(Counter.sum(1, 1));
            System.out.println(Counter.sumByEven(0, 10));
            System.out.println(Counter.sumByEven(3, 8));
            System.out.println(Counter.sumByEven(1, 1));
        }
    }
