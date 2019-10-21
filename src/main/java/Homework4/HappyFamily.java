package Homework4;

import java.util.Arrays;

public class HappyFamily {
    public static void main(String[] args) {

        System.out.println( "Family Grace:" );
        String[][] schedule1 = {
                {"Monday"}, {"Visit library"},
                {"Wednesday"}, {"Visit father's parents"},
                {"Friday"}, {"Visit mother's parents"}
        };

        Pets pet1 = new Pets( "dog", "Gerbert", 3, 89,
                new String[]{"playing", "barking at cars", "sleeping"} );

        Humans grandpa1 = new Humans( "Alexander", "Grace", 1942 );
        Humans grandma1 = new Humans( "Selene", "Grace", 1944 );
        Humans grandpa2 = new Humans( "Geralt", "Hardone", 1943 );
        Humans grandma2 = new Humans( "Lily", "Hardone", 1948 );
        Humans father1 = new Humans( "Mark", "Grace", 1972, 95, grandpa1, grandma1 );
        Humans mother1 = new Humans( "Victoria", "Grace", 1978, 98, grandpa2, grandma2 );

        Humans child1 = new Humans( "Gerrard", "Grace", 1998, 92,
                father1, mother1, schedule1, pet1 );

        child1.greetPet();
        child1.pet.respond();
        child1.pet.eat();

        System.out.println();
        System.out.println( "Family D'Atre:" );

        Pets pet2 = new Pets( "owl", "Hedwig", 4, 94,
                new String[]{"Screeching", "Playing with Grenda", "Sitting on Merloin's shoulder"} );
        Pets pet3 = new Pets( "cat", "Grenda", 2, 91,
                new String[]{"Eating", "Sleeping half of day", "Playing with Hedwig", "Scratching couch"} );

        Humans grandpa3 = new Humans( "Estel", "D'Atre", 1959 );
        Humans grandma3 = new Humans( "Elizabeth", "D'Atre", 1966 );
        Humans grandpa4 = new Humans( "Mark", "Oldhouse", 1960 );
        Humans grandma4 = new Humans( "Melody", "Oldhouse", 1962 );
        Humans father2 = new Humans( "Merloin", "D'atre", 1986, 100, grandpa3, grandma3 );
        Humans mother2 = new Humans( "Esmeralda", "D'Atre", 1988, 88, grandpa4, grandma4 );
        father2.pet = pet2;
        mother2.pet = pet3;
        Humans child2 = new Humans( "Elenna", "D'Atre", 2014, 76, father2, mother2 );
        Humans child3 = new Humans( "Martin", "D'Atre", 2017, 62, father2, mother2 );
        child2.pet = child3.pet = pet3;
        mother2.greetPet();
        mother2.pet.respond();
        child1.describePet();

    }
}
