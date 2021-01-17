package ru.job4j.examples;

public class PairsCharString {
    public static boolean check(String l, String r) {
        return (l.equals("") && r.equals(l)) || (l.charAt(l.length() - 1) == r.charAt(0)) && (r.charAt(r.length() - 1) == l.charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(PairsCharString.check("", ""));
    }
}
