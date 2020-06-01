package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean yt = false;
for (int x = 2; x <= (num - 1); x++) {
    if (num % x == 0) {
        yt = true;
        break;
    }
    return yt;
}

    }

}
