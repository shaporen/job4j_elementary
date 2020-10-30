package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        input.nextLine();
        int answer = new Random().nextInt(3);
        String otvet;
        switch (answer) {
            case 0:
                otvet = "Да";
                break;

            case 1:
                otvet = "Нет";
                break;

            default:
                otvet = "Может быть";
                break;
        }
        System.out.println(otvet);
    }
}
