//package Homework4;
//
//public class HappyFamily {
//    public static void main(String[] args) {
//
//        System.out.println( "Family Grace:" );
//        String[][] schedule1 = {
//                {"Monday"}, {"Visit library"},
//                {"Wednesday"}, {"Visit father's parents"},
//                {"Friday"}, {"Visit mother's parents"}
//        };
//
//        Pet pet1 = new Pet( "dog", "Gerbert", 3, 89,
//                new String[]{"playing", "barking at cars", "sleeping"} );
//
//        Human grandpa1 = new Human( "Alexander", "Grace", 1942 );
//        Human grandma1 = new Human( "Selene", "Grace", 1944 );
//
//        Human grandpa2 = new Human( "Geralt", "Hardone", 1943 );
//        Human grandma2 = new Human( "Lily", "Hardone", 1948 );
//
//        Human father1 = new Human( "Mark", "Grace", 1972, 95, grandpa1, grandma1 );
//        Human mother1 = new Human( "Victoria", "Grace", 1978, 98, grandpa2, grandma2 );
//
//        Human child1 = new Human( "Gerrard", "Grace", 1998, 92,
//                father1, mother1, schedule1, pet1 );
//
//        child1.greetPet();
//        child1.pet.respond();
//        child1.pet.eat();
//
//        System.out.println();
//        System.out.println( "Family D'Atre:" );
//
//        Pet pet2 = new Pet( "owl", "Hedwig", 4, 94,
//                new String[]{"Screeching", "Playing with Grenda", "Sitting on Merloin's shoulder"} );
//        Pet pet3 = new Pet( "cat", "Grenda", 2, 91,
//                new String[]{"Eating", "Sleeping half of day", "Playing with Hedwig", "Scratching couch"} );
//
//        Human grandpa3 = new Human( "Estel", "D'Atre", 1959 );
//        Human grandma3 = new Human( "Elizabeth", "D'Atre", 1966 );
//
//        Human grandpa4 = new Human( "Mark", "Oldhouse", 1960 );
//        Human grandma4 = new Human( "Melody", "Oldhouse", 1962 );
//
//        Human father2 = new Human( "Merloin", "D'atre", 1986, 100, grandpa3, grandma3 );
//        Human mother2 = new Human( "Esmeralda", "D'Atre", 1988, 88, grandpa4, grandma4 );
//
//        Human child2 = new Human( "Elenna", "D'Atre", 2014, 76, father2, mother2 );
//        Human child3 = new Human( "Martin", "D'Atre", 2017, 62, father2, mother2 );
//
//        father2.pet = pet2;
//        mother2.pet = pet3;
//
//        child2.pet = child3.pet = pet3;
//        mother2.greetPet();
//        mother2.pet.respond();
//        child1.describePet();
//
//    }
//}
//
