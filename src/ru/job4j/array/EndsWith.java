package ru.job4j.array;

public class EndsWith {
    public static boolean endWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (post[post.length - 1 - index] != word[word.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] max = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] min = new char[] {'l', 'l', 'o'};
        boolean rst = endWith(max, min);
        System.out.println(rst);
    }
}
