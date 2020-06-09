package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4};
        int[] rsl = back(nums);
        for (int sch = 0; sch < nums.length; sch++) {
            System.out.println(rsl[sch]);
        }
    }
}
