package Homework6;

import java.util.Arrays;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private Family family;
    private Human child;

    Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }


    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    Human[] getChildren() {
        return children;
    }

    void setChildren(Human[] children) {
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

    public Human getChild() {
        return child;
    }

    public void setChild(Human child) {
        this.child = child;
    }




    public static Human[] addChild(Human newChild, Human[] array) {
        newChild = new Human();
        Human[] newChildren = new Human[array.length + 1];
        System.arraycopy( array, 0, newChildren, 0, array.length );
        newChildren[array.length + 1] = newChild;

        return newChildren;

    }

    static Human[] deleteChild(Human child, Human[] array) {
        int length = 0;
        Human[] newChildren = new Human[array.length];
        for (Human value : array) {
            if (!child.equals( value )) {
                newChildren[length++] = value;
            }
        }
        System.out.printf( "%s has left the family.", child.getName() );
        return Arrays.copyOf( newChildren, array.length - 1 );
    }

    static int countFamily(Family family) {
        return 2 + family.getChildren().length;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println( "Finalize worked in Family class" );
    }

}
