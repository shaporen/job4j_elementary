package ru.job4j.oop.profession;

public class Profession {
    private String name;
    private String surname;
    private String birthday;
    private String education;
    private double experience;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getBirthday() {
        return birthday;
    }
    public String getEducation() {
        return education;
    }
    public double getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }
}
