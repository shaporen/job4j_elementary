package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] indexes = new int[0];
        int i = 0;
        int j = array.length - 1;
        while (j > i) {
            if (array[i] + array[j] == target) {
                indexes = new int[]{i, j};
                break;
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return indexes;
    }
}
