package ru.job4j.oop.profession;

public class Doctor extends Profession {
    private String diagnose;

    public String examine(Patient patient) {
        return diagnose;
    }
    public Diagnosis heal(Patient patient) {
        return null;
    }

}
