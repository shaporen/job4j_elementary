package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] indexes = new int[0];
        int i = 0;
        int j = 0;
        while (j < array.length) {
            if (array[i] + array[j] == target && i < j) {
                indexes = new int[]{i, j};
                break;
            }
            if (j == array.length - 1) {
                i++;
                j = i;
            }
            j++;
        }
        return indexes;
    }
}
