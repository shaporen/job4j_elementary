package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] massiv = new int[] {3, 2, 1, 5, 4};
        Min poisk = new Min();
        System.out.println(Min.findMin(massiv));
    }
}
