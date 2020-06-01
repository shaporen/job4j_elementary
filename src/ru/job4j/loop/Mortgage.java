package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double qaz = amount;
        while (qaz > 0) {
            year++;
            qaz = qaz * (1 + percent / 100) - salary;
        }
        return year;
    }
public static void main(String[] args) {
        double x = Mortgage.year(100, 120, 50);
        System.out.println(x);
}
}
