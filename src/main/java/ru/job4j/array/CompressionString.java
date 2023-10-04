package ru.job4j.array;

public class CompressionString {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    System.out.print(str.charAt(i) + "" + count);
                    count = 1;
                }
            } else {
                System.out.println(str.charAt(i) + "" + count);
            }
        }
    }
}
