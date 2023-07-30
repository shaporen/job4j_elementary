package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float in = 140;
        float expected = 2;
        float out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2.0 euro. Test result : " + passed);
        float dollar = rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
        float in2 = 180;
        float expected2 = 3;
        float out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("180 rubles are 3.0 dollar. Test result : " + passed2);
    }
}
