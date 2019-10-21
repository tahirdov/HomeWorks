package Homework4;

import java.util.Arrays;

public class Pet {

    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() {
        System.out.print( "Has no pet." );
    }

    void eat() {
        System.out.println( "I am eating." );
    }

    void respond() {
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

