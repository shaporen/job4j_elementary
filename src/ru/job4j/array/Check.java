package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index < data.length - 1; index++) {
            if (data[0] != data[index]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] massiv = new boolean[] {true, false, true};
        boolean rst = mono(massiv);
        for (int a = 1; a < massiv.length - 1; a++) {
            System.out.println(rst);
        }
    }
}
