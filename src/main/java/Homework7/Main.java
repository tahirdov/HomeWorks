package Homework7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Throwable {
        DayOfWeek day1 = DayOfWeek.FRIDAY;
        DayOfWeek day2 = DayOfWeek.SATURDAY;

        Species spec1 = Species.DOG;
        Species spec2 = Species.DOMESTICCAT;

        Dog pet1 = new Dog( spec1, "Wolf", 4, 94,
                new String[]{"barking", "playing with children"} );
        DomesticCat pet2 = new DomesticCat( spec2, "Tiger", 2, 83,
                new String[]{"scratching furniture", "chilling on sofa"} );

        Woman grandma1 = new Woman( "Moiraine", "D'Atre", 1976 );
        Man grandpa1 = new Man( "Lan", "D'atre", 1969 );

        Woman grandma2 = new Woman( "Siuan", "Sanche", 1978 );
        Man grandpa2 = new Man( "Gareth", "Sanche", 1971 );

        Man father = new Man( "Merloin", "D'Atre", 1993, 98, grandpa1, grandma1,
                new String[][]{{String.valueOf( day1 )}, {"Reading book for family"}}, pet1 );
        Woman mother = new Woman( "Esmeralda", "D'Atre", 1995, 88, grandpa2, grandma2,
                new String[][]{{String.valueOf( day2 )}, {"Singing for family"}}, pet2 );

        Man child1 = new Man( "Alexandre", "D'atre", 2018, 75, father, mother,
                new String[][]{{"Everyday"}, {"Playing around"}}, pet1 );
        Woman child2 = new Woman( "Alexandra", "D'atre", 2016, 75, father, mother,
                new String[][]{{"Everyday"}, {"Playing around"}}, pet2 );

        ArrayList<Human> children = new ArrayList<Human>();
        children.add( child1 );
        children.add( child2 );

        Family Datre = new Family( father, mother );
        Datre.setChildren( children );
        Datre.familyCount( Datre );

        children.add( new Woman( "Milena", "D'Atre", 2019 ) );
        System.out.println( "After Milena:" );
        Datre.familyCount( Datre );

        System.out.println( "Years passed..." );
        Datre.deleteChild( child1, children );
        Datre.familyCount( Datre );
        Datre.finalize();

    }


}
