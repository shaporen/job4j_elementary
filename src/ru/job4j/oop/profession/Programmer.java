package ru.job4j.oop.profession;

public class Programmer extends Engineer {
    private String algoritm;
    private String code;

    public String doAlgoritm(Project project) {
        return algoritm;
    }
    public String writeCode(Project project) {
        return code;
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Project project = new Project();
        programmer.setSpecialization("Джавист");
        programmer.doAlgoritm(project);
        programmer.writeCode(project);
    }
}
