package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = a + b + c;
        double rsl = Math.sqrt(p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
