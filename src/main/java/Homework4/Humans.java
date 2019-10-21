package Homework4;

import java.util.Arrays;

public class Humans {

    String name;
    String surname;
    int dateOfYear;
    int iq;
    Humans father;
    Humans mother;
    String[][] schedule;
    Pets pet;

    public Humans(String name, String surname, int dateOfYear) {
        this.name = name;
        this.surname = surname;
        this.dateOfYear = dateOfYear;
    }

    public Humans(String name, String surname, int dateOfYear, int iq, Humans father, Humans mother) {
        this.name = name;
        this.surname = surname;
        this.dateOfYear = dateOfYear;
        this.iq = iq;
        this.father = father;
        this.mother = mother;
    }

    public Humans(String name, String surname, int dateOfYear, int iq, Humans father,
                  Humans mother, String[][] schedule, Pets pet) {
        this.name = name;
        this.surname = surname;
        this.dateOfYear = dateOfYear;
        this.iq = iq;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
        this.pet = pet;
    }

    public Humans() {

    }


    public void greetPet() {
        if (pet.nickname == null) System.out.println( name + " has no pet." );
        else
            System.out.println( "Hello " + pet.nickname + "!" );
    }

    public void describePet() {
        System.out.print( "I have a " + pet.species + ", he is " + pet.age + " years old, he is " );
        if (pet.trickLevel < 50)
            System.out.println( "almost not sly." );
        else System.out.println( "very sly." );
    }


    public String toString() {
        return String.format( "Human{name = %s, surname=%s, year = %d, iq = %d, father = %s, mother = %s, pet = %s",
                name, surname, dateOfYear, iq, father, mother, pet );
    }


}
