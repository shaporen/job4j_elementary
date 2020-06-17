package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int temp = min;
            data[index] = data[i];
            data[i] = temp;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] massiv = new int[] {6, 5, 9, 7, 2, 3, 4};
        int[] qaz = sort(massiv);
        for (int abc = 0; abc < qaz.length; abc++) {
            System.out.println(qaz[abc]);
        }
    }
}
