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

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if ((board[i][i] == 'X') && MatrixCheck.monoVertical(board, i) || MatrixCheck.monoHorisontal(board, i)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
