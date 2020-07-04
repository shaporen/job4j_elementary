package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String pust = "Пусть бегут неуклюже";
        String spoki = "Спокойной ночи";
        String netu = "Песня не найдена";
        if (position == 1) {
            System.out.println(pust);
        } else if (position == 2) {
            System.out.println(spoki);
        } else {
            System.out.println(netu);
        }
    }


        public static void main(String[]args) {
            Jukebox pesnya = new Jukebox();
            pesnya.music(3);
        }
}


