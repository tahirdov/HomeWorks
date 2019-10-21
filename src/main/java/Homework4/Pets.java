package Homework4;

import java.util.Arrays;

public class Pets {

    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    public Pets(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pets(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pets() {
        System.out.print( "Has no pet." );
    }

    public void eat() {
        System.out.println( "I am eating." );
    }

    public void respond() {
        System.out.println( "Hello owner! I am " + this.nickname + ". I miss you!" );
    }

    public void foul() {
        System.out.println( "I need to cover it up." );
    }

    public String toString() {
        return species + "{nickname = " + nickname + ", age " + age + ", tricklevel =  " + trickLevel + ", " +
                "                                                       habits = " + Arrays.toString( habits ) + "}";

    }


}

