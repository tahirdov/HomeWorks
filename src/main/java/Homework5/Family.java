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

    Family(Human dad, Human mom) {
        this.dad = dad;
        this.mom = mom;
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

    Child[] getChildren() {
        return children;
    }

    void setChildren(Child[] children) {
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

    Human getHuman() {
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

    Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
