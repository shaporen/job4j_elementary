package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean a = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                a = false;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 2};
        boolean a = Sorted.isSorted(array);
        System.out.println(a);
    }
}
