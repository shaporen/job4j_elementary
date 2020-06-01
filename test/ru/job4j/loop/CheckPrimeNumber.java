package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        int x;
        boolean prime = true;
        if (num == 1) {
            prime = false;
        } else {
            for (x = 2; x < num; x++) {
                if (num % x == 0) {
                    prime = false;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        boolean otvet = CheckPrimeNumber.check(1);
        System.out.println(otvet);
    }
}
