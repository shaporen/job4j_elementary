package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorisontal(char[][] array, int row) {
        boolean result = true;
        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
