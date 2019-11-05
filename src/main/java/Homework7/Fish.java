package Homework7;

import java.util.Arrays;

public class Fish extends Pet {
    Fish(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super( species, nickname, age, trickLevel, habits );
    }

    @Override
    public void describe() {

        System.out.printf( "Species: %s Name: %s Age: %d\n",
                getSpecies(), getNickname(), getAge() );
    }

}
