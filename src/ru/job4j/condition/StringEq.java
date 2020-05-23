package ru.job4j.condition;

    public class StringEq {
        public static void main(String[] args) {
            String root = new String("root");
            String login = "login";
            boolean access = login.equals(root);
            System.out.println(access);
        }
    }

