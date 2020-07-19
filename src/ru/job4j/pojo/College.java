package ru.job4j.pojo;
import java.util.Calendar;
import java.util.Date;
public class College {
    private String fio;
    private String gruppa;
    private Date data;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGruppa() {
        return gruppa;
    }

    public void setGruppa(String gruppa) {
        this.gruppa = gruppa;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public static void main(String[] args) {
        College student = new College();
        student.setFio("Сергей Валерьевич Шапоренко");
        student.setGruppa("Стажер");
        student.setData(new Date(2020, Calendar.MAY, 16));
        System.out.println("Имя студента: " + student.getFio());
        System.out.println("Группа обучения: " + student.getGruppa());
        System.out.println("Дата поступления на курс: " + student.getData());
    }
}
