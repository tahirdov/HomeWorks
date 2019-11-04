package Homework7;

public class Man extends Human {


    Man(String name, String surname, int year, int iq, Human father, Human mother, String[][] schedule, Pet pet) {
        super( name, surname, year, iq, father, mother, schedule, pet );
    }

    Man(String name, String surname, int year) {
        super( name, surname, year );
    }

    public static void repair() {
        System.out.println( "I can repair a car" );
    }
}
