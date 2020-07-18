package ru.job4j.oop.profession;

public class Surgeon extends Doctor {
    private String operation;

    public String doOperation(Patient patient) {
        return operation;
    }

    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        Patient patient = new Patient();
        surgeon.examine(patient); //вызов метода из родителя
        surgeon.doOperation(patient); //вызов метода из текущего класса
        surgeon.heal(patient);
    }
}
