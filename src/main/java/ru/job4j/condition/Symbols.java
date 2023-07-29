package ru.job4j.condition;

public class Symbols {
    public static void main(String[] args) {
        System.out.println("\u0031\u0032\u0033");
        char a = 'A';
        char b = 'B';
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("A + B: " + (a + b));
        System.out.println(++a);
        char d = 'D';
        System.out.println(--d);
    }
}
