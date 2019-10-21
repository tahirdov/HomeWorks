package Homework4;

public class Human {

    String name;
    String surname;
    int year;
    int iq;
    Human father;
    Human mother;
    String[][] schedule;
    Pet pet;

    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    Human(String name, String surname, int year, int iq, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.father = father;
        this.mother = mother;
    }

    Human(String name, String surname, int year, int iq, Human father,
          Human mother, String[][] schedule, Pet pet) {
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
        return String.format( "Human{name = %s, surname=%s, year = %d, iq = %d, father = %s, mother = %s, pet = %s",
                name, surname, year, iq, father, mother, pet );
    }
}
