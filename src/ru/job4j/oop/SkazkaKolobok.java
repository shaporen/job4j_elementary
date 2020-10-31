package ru.job4j.oop;

public class SkazkaKolobok {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Fox lisa = new Fox();
        Hare zayats = new Hare();
        Volk volk = new Volk();
        ball.run();
        lisa.tryEat(ball);
        zayats.tryEat(ball);
        volk.tryEat(ball);
        volk.tryEat(lisa);
    }
}
