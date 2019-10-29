package Homework5;

public class Human {
    private String name;
    private String surname;
    private int dateOfYear;
    private int iq;
    private String father;
    private String mother;
    private String[][] schedule;
    private Pet pet;

    Human(String name, String surname, int dateOfYear, int iq, String father,
          String mother, String[][] schedule, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.dateOfYear = dateOfYear;
        this.iq = iq;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
        this.pet = pet;
    }

    public Human(String name, String surname, int dateOfYear, int iq) {
        this.name = name;
        this.surname = surname;
        this.dateOfYear = dateOfYear;
        this.iq = iq;
    }

    Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfYear() {
        return dateOfYear;
    }

    public void setDateOfYear(int dateOfYear) {
        this.dateOfYear = dateOfYear;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
