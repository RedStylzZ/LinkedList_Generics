import model.Animal;
import model.Generic;
import model.GenericList;

public class Main {

    public static <AnimalList> void main(String[] args) {
        Generic klaus = new Generic("Klaus");
        Generic turtle = new Generic("Turtle");
        Generic dog = new Generic("Dog");
        Generic test = new Generic("test");
        Generic test1 = new Generic("test1");
        Generic test2 = new Generic("test2");
        GenericList<Generic> genericList = new GenericList<>(klaus);

        genericList.add(turtle);
        genericList.add(dog);
        genericList.add(test);
        genericList.add(test1);
        genericList.add(test2);
        genericList.add(dog);
        genericList.remove(klaus);
        System.out.println(genericList);

        Animal aklaus = new Animal("Klaus");
        Animal aturtle = new Animal("Turtle");
        Animal adog = new Animal("Dog");
        Animal atest = new Animal("test");
        Animal atest1 = new Animal("test1");
        Animal atest2 = new Animal("test2");
        GenericList<Animal> animalList = new GenericList<>(aklaus);

//        animalList.add(klaus);
        animalList.add(aturtle);
        animalList.add(adog);
        animalList.add(atest);
        animalList.add(atest1);
        animalList.add(atest2);
        animalList.add(adog);
        animalList.remove(aklaus);
        System.out.println(animalList);
    }

}
