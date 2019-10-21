package Homework5;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private Family family;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet( "dog", "Rex", 4, 85,
                new String[]{"Barking at cars", "Messing the room"} );
        Pet pet2 = new Pet( "cat", "Marshmallow", 2, 72,
                new String[]{"Chilling on sofa", "Scratching table legs"} );

        Human mother = new Human( "Esmeralda", "D'atre", 1993, 92 );
        Human father = new Human( "Merloin", "D'Atre", 1991, 98 );

        Human child1 = new Human( "Alexandre", "D'Atre", 2016, 75, father, mother,
                new String[][]{{"Everyday"}, {"Playing with pets"}}, pet1 );
        Human child2 = new Human( "Lily", "D'Atre", 2018, 62, father, mother,
                new String[][]{{"Everyday"}, {"Playing with pets"}}, pet2 );

        Human[] children = {child1, child2};

        Family family = new Family( father, mother );
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String toString() {
        return "Mother: " + mother.getName() + mother.getSurname() +
                "\nFather: " + father.getName() + father.getSurname() +
                "\nChildren: " + Arrays.toString( children );
    }
}
