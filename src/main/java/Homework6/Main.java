package Homework6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Throwable {
        DayOfWeek day1 = DayOfWeek.FRIDAY;
        DayOfWeek day2 = DayOfWeek.SATURDAY;
        DayOfWeek day3 = DayOfWeek.SUNDAY;

        Species spec1 = Species.DOG;
        Species spec2 = Species.CAT;

        Pet pet1 = new Pet( spec1, "Wolf", 4, 94,
                new String[]{"barking", "playing with children"} );
        Pet pet2 = new Pet( spec2, "Tiger", 2, 83,
                new String[]{"scratching furniture", "chilling on sofa"} );

        Human grandma1 = new Human( "Moiraine", "D'Atre", 1976 );
        Human grandpa1 = new Human( "Lan", "D'atre", 1969 );

        Human grandma2 = new Human( "Siuan", "Sanche", 1978 );
        Human grandpa2 = new Human( "Gareth", "Sanche", 1971 );

        Human father = new Human( "Merloin", "D'Atre", 1993, 98, grandpa1, grandma1,
                new String[][]{{String.valueOf( day1 )}, {"Reading book for family"}}, pet1 );
        Human mother = new Human( "Esmeralda", "D'Atre", 1995, 88, grandpa2, grandma2,
                new String[][]{{String.valueOf( day2 )}, {"Singing for family"}}, pet2 );

        Human child1 = new Human( "Alexandre", "D'atre", 2018, 75, father, mother,
                new String[][]{{"Everyday"}, {"Playing around"}}, pet1 );
        Human child2 = new Human( "Alexandra", "D'atre", 2016, 75, father, mother,
                new String[][]{{"Everyday"}, {"Playing around"}}, pet2 );

        ArrayList<Human> children = new ArrayList<Human>();
        children.add( child1 );
        children.add( child2 );

        Family Datre = new Family( father, mother );
        Datre.setChildren( children );
        Datre.familyCount( Datre );

        children.add( new Human( "Milena", "D'Atre", 2019 ) );
        System.out.println( "After Milena:" );
        Datre.familyCount( Datre );

        System.out.println( "Years passed..." );
        Datre.deleteChild( child1, children );
        Datre.familyCount( Datre );
        Datre.finalize();

    }


}
