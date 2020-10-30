package ru.job4j.io;

import java.util.Scanner;

public class Dendy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игры");
            System.out.println("1. Танчики");
            System.out.println("2. Супер Марио");
            System.out.println("3. Выйти");
            System.out.print("Введите пункт меню, чтобы начать игру: ");
            int otvet = Integer.valueOf(input.nextLine());
            if (otvet == 1) {
                System.out.println("Танчики загружаются...");
            } else {
                if (otvet == 2) {
                    System.out.println("Супер Марио загружается...");
                } else {
                    if (otvet == 3) {
                        System.out.println("Игра завершена.");
                        run = false;
                    } else {
                        System.out.println("Такой игры нет");
                    }
                }
            }
        }
    }
}
