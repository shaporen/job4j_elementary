package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = manWeight(height);
        System.out.println(man);
        short height2 = 165;
        double woman = womanWeight(height2);
        System.out.println(woman);
    }

}
