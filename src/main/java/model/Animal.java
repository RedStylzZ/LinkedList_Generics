package model;

public class Animal extends Generic{

    public Animal(String name) {
        super(name);
    }

    public String getName() {
        return super.getName() + "Animal";
    }
}
