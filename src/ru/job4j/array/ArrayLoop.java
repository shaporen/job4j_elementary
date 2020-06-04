package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] massiv = new int[4];
        for (int index = 0; index < massiv.length; index++) {
            massiv[index] = index * 2 + 3;
            System.out.println(massiv[index]);
        }
    }
}
