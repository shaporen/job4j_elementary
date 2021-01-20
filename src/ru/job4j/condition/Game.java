package ru.job4j.condition;

public class Game {
    public static double checkGame(double percent, int prize, int pay) {
        if ((percent * prize) > pay) {
            double rsl = (prize * percent) - pay;
            return (int)rsl;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        int rsl = (int) checkGame(0.9, 1, 2);
        System.out.println(rsl);
    }
}
