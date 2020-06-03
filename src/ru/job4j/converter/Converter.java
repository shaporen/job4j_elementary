package ru.job4j.converter;

/**
 * class - конвертор рублей в евро и доллары по фиксированному курсу
 * @author - Shaporenko Sergey
 */
public class Converter {
    /**
     * rubleToEuro - метод перевода рублей в евро
     * @param value - исходное значение
     * @return - возвращает количество евро
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * rubleToDollar - метод перевода рублей в доллары
     * @param value1 - исходное значение
     * @return - возвращает количество долларов
     */
    public static int rubleToDollar(int value1) {
        int rsl1 = value1 / 60;
        return rsl1;
    }

    /**
     * main - метод подсчета и вывода результата
     * @param args
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");
        
    }
}
