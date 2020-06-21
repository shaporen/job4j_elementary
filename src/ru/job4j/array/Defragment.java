package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i;
                for (int j = point + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        String temp = array[j];
                        array[j] = array[point];
                        array[point] = temp;
                        point = point + 1;
                    }
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
