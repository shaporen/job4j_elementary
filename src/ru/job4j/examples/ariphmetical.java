package ru.job4j.examples;

public class ariphmetical {
    public static String selectAction(int left, int right, int rsl) {
        if (left + right == rsl) {
            return "added";
        } else {
            if (left - right == rsl) {
                return "substracted";
            } else {
                if (left * right == rsl) {
                    return "multiplied";
                } else {
                    if (left / right == rsl) {
                        return "divided";
                    } else {
                        return "none";
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(ariphmetical.selectAction(100, 20, 80));
    }
}
