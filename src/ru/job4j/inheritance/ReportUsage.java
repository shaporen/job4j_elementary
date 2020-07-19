package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report name", "Report body");
        System.out.println(text);
        HtmlReport html = new HtmlReport();
        String text2 = html.generate("Report name", "Report body");
        System.out.println(text2);
    }
}
