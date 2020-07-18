package ru.job4j.oop.profession;

public class Dentist extends Doctor {
    private boolean plomba;

    public boolean doPlomba(Patient patient) {
        return plomba;
    }

    public static void main(String[] args) {
        Dentist dentist = new Dentist();
        Patient patient = new Patient();
        dentist.examine(patient);
        dentist.doPlomba(patient);
        dentist.plomba = true;
        dentist.setName("Бормашина");
        dentist.getName();
    }
}
