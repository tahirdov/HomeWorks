package Homework7;

public class Woman extends Human {
    Woman(String name, String surname, int year, int iq, Human father, Human mother, String[][] schedule, Pet pet) {
        super( name, surname, year, iq, father, mother, schedule, pet );
    }

    Woman(String name, String surname, int year) {
        super( name, surname, year );
    }

    public static void makeUp() {
        System.out.println( "I should use high quality make up to prevent my skin from harm" );
    }
}
