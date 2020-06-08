package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 3, 5, 7, 15};
        FindLoop find = new FindLoop();
        for (int a = 0; a < array.length; a++) {
            System.out.println(find.indexOf(array, 15));
            break;
        }
    }
}
