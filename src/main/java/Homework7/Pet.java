package Homework7;

import java.util.Arrays;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        if (species != Species.DOMESTICCAT
                && species != Species.DOG
                && species != Species.FISH
                && species != Species.ROBOCAT) {
            this.species = Species.UNKNOWN;
        } else this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public static void eat() {
        System.out.println( "I am eating *YUMMY*" );
    }

    public abstract void describe();

    Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return getSpecies() + "{name =" + getNickname() + ", age = " + getAge() +
                ", trickLevel = " + getTrickLevel() +
                "habits = " + Arrays.toString( getHabits() );
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println( "Finalize worked in Pet class" );
    }
}
