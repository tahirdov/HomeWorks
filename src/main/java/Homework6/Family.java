package Homework6;

import java.util.ArrayList;

public class Family {

    private Human mother;
    private Human father;
    private ArrayList<Human> children;
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

    ArrayList<Human> getChildren() {
        return children;
    }

    void setChildren(ArrayList<Human> children) {
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


    void familyCount(Family family) {
        System.out.printf( "There are %d members in family %s.\n", count( family ), family.getFather().getSurname() );
    }

    private int count(Family family) {
        return 2 + family.getChildren().size();
    }

    void deleteChild(Human child, ArrayList<Human> children) {
        System.out.println( child.getName() + " has left the family." );
        children.remove( child );
    }

    public ArrayList<Human> deleteChild(int index, ArrayList<Human> children) {
        System.out.println( children.get( index ).getName() + " has left the family." );
        children.remove( index );
        return children;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println( "Finalize worked in Family class" );
    }

}
