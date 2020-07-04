package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's nick and food.");
        Cat gav = new Cat();
        gav.giveNick("Barsik");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's nick and food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Chernish");
        black.show();
    }
}
