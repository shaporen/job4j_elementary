package ru.job4j.condition;

public class Games {
    public static void permissiom(boolean allowByParents, boolean hasMoney) {
        if (allowByParents && hasMoney) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Games.permissiom(true, true);
        Games.permissiom(true, false);
        Games.permissiom(false, true);
        Games.permissiom(false, false);
    }
}
