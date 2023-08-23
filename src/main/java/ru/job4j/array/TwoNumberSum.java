package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] indexes = new int[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == target && i < j) {
                    indexes = new int[]{i, j};
                    break;
                }
            }
        }
        return indexes;
    }
}
