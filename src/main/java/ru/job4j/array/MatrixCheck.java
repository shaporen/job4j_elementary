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

    public static boolean monoVertical(char[][] array, int column) {
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
