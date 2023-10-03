package ru.job4j.array;

public class CompressionString {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        // for each character present in the string
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            //comparing char to next position character
            if (i < str.length() - 1) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else { //if char doesn't match then print character and total count
                    System.out.print(str.charAt(i) + "" + count);
                    count = 1;
                }
            } else { //this condition for the last character
                System.out.println(str.charAt(i) + "" + count);
            }
        }
    }
}
