package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String qaz = "Неизвестное слово. " + eng;
        return qaz;
    }

    public static void main(String[] args) {
        DummyDic slovo = new DummyDic();
        System.out.println(slovo.engToRus("Java"));
        System.out.println(slovo.engToRus("Python"));
    }
}
