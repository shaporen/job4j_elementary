package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner hod = new Scanner(System.in);
        int vsego = 11;
        boolean nomer = true;
        System.out.println("Начнем игру в СПИЧКИ!");
        System.out.println("Введите число от 1 до 3");
        while (vsego > 0) {
           if (vsego == 1) {
               System.out.println("на столе осталась " + vsego + " спичка");
           } else {
               if (vsego == 2 || vsego == 3 || vsego == 4) {
                   System.out.println("на столе осталось " + vsego + " спички");
               } else {
                   System.out.println("на столе осталось " + vsego + " спичек");
               }
           }
            System.out.println("ход игрока №" + (nomer ? 1 : 2));
           int chislo = Integer.valueOf(hod.nextLine());
           if (chislo > 0 && chislo < 4) {
               if (chislo <= vsego) {
                   vsego -= chislo;
                   nomer = !nomer;
               } else {
                   System.out.println("На столе нет такого количества спичек");
               }
           } else {
               System.out.println("игрок №" + (nomer ? 1 : 2) + " ,введите число от 1 до 3");
           }
        }
        System.out.println("Выиграл игрок №" + (!nomer ? 1 : 2));
    }
}
