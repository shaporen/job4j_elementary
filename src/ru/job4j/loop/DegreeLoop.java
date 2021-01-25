package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (n == 1) {
            return a;
            } else {
                result = result * a;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a = calculate(3, 1);
        System.out.println(a);
    }
}
