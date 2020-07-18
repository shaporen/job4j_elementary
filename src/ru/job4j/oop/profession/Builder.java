package ru.job4j.oop.profession;

public class Builder extends Engineer {
    private String plan;
    private String genplan;
    private String object;

    public String doGenPlan(Project project) {
        return genplan;
    }

    public String doStroika(String project) {
        return object;
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        Project project = new Project();
        builder.analyzeProject(project);
        project.setDeadline("21.12.2020");
        builder.genplan = builder.doGenPlan(project);
        builder.doStroika(builder.genplan);
        System.out.println(builder.object);
    }
}
