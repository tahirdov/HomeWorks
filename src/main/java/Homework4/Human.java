package Homework4;

import java.util.Arrays;

public class Human {

    Pet pet;
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String father;
    private String mother;
    private String[][] schedule;

    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    Human(String name, String surname, int year, int iq, String father, String mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.father = father;
        this.mother = mother;
    }

    Human(String name, String surname, int year, int iq, String father,
          String mother, String[][] schedule, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
        this.pet = pet;
    }

    public Human() {

    }


    void greetPet() {
        System.out.println( "Hello " + pet.getNickname() + "!" );
    }

    void describePet() {
        System.out.print( "I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " );
        if (pet.getTrickLevel() < 50)
            System.out.println( "almost not sly." );
        else System.out.println( "very sly." );
    }


    public String toString() {
        return String.format( "Human{name = %s, surname=%s, year = %d, iq = %d, schedule = %s",
                name, surname, year, iq, Arrays.toString( schedule ) );
    }
}
