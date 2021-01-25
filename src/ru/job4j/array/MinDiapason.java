package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] massiv = new int[] {6, 5, 9, 7, 2, 3, 4};
        System.out.println(MinDiapason.findMin(massiv, 2, 3));
    }
}
