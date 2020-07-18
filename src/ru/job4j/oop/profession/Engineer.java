package ru.job4j.oop.profession;

public class Engineer extends Profession {
    private String specialization;
    public String analyze;

    public String analyzeProject(Project project) {
        return analyze;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
