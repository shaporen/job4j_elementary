package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int zarad) {
        this.load = zarad;
    }

    public  void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(20);
        System.out.println("первая батарея: " + first.load + ". вторая батарея: " + second.load);
        first.exchange(second);
        System.out.println("первая батарея: " + first.load + ". вторая батарея: " + second.load);
    }
}
