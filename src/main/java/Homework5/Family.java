package Homework5;

import java.util.Arrays;

public class Family {


    private String mother;
    private String father;
    private Human mom;
    private Human dad;
    private Child[] children;
    private Pet pet;
    private Family family;
    private Human human;
    private Child child;

    private Family(Human dad, Human mom) {
        this.dad = dad;
        this.mom = mom;
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet( "dog", "Rex", 4, 85,
                new String[]{"Barking at cars", "Messing the room"} );
        Pet pet2 = new Pet( "cat", "Marshmallow", 2, 72,
                new String[]{"Chilling on sofa", "Scratching table legs"} );

        Human mother = new Human( "Esmeralda", "Tolkien", 1993, 92,
                "Rand Smith", "Egwene Smith",
                new String[][]{{"Monday"}, {"Go to cafe"}}, pet2 );
        Human father = new Human( "Merloin", "Tolkien", 1991, 98,
                "Lan Tolkien", "Moiraine Tolkien",
                new String[][]{{"Sunday"}, {"Play with children"}}, pet1 );

        Child child1 = new Child( "Alexandre", "Tolkien", 2016, 75, father, mother,
                new String[][]{{"Everyday"}, {"Playing with pets"}}, pet1 );
        Child child2 = new Child( "Lily", "Tolkien", 2018, 62, father, mother,
                new String[][]{{"Everyday"}, {"Playing with pets"}}, pet2 );

        Child[] children = {child1, child2};

        Family family = new Family( father, mother );
        family.setChildren( children );

        deleteChild(child1, children);

    }

    public static Human[] addChild(Human newChild, Human[] array) {
        newChild = new Human();
        Human[] newChildren = new Human[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newChildren[i] = array[i];
        }
        newChildren[array.length + 1] = newChild;

        return newChildren;

    }

    public static Child[] deleteChild(Child child, Child[] array) {
        int length = 0;
        Child[] newChildren = new Child[array.length];
        for (int i = 0; i < array.length; i++) {
            if (!child.equals( array[i] )) {
                newChildren[length++] = array[i];
            }
        }
        System.out.printf( "%s has left the family.", child.getName() );
        return Arrays.copyOf( newChildren, length );

    }

    private static int countFamily(Family family, String surname) {
        int count = 0;
        for (int i = 0; i < family.getChildren().length + 2; i++) {
            if (surname.equals( family.getChild().getSurname() ) || surname.equals( family.getHuman().getSurname() ))
                count++;
        }
        return count;
    }

    private static String returnFamilyCount(Family family, String surname) {
        return "There are " + countFamily( family, surname ) +
                "members in family " + surname;
    }

    public boolean equals(Child one) {
        return super.equals( one );
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    private Child[] getChildren() {
        return children;
    }

    private void setChildren(Child[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    private Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Human getMom() {
        return mom;
    }

    public void setMom(Human mom) {
        this.mom = mom;
    }

    public Human getDad() {
        return dad;
    }

    public void setDad(Human dad) {
        this.dad = dad;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
