package TwelftOfMarch;

import animal.Dog;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList();
        dogs.add(new Dog("Lucky", "Beagle", 5));
        dogs.add(new Dog("Richo", "Pincher", 7));
        dogs.add(new Dog("Rex", "German Sheppard", 2));
        dogs.add(new Dog("Ares", "German Sheppard", 2));
        DogComparatorByAge dogComparatorByAge = new DogComparatorByAge();
        dogs.sort(dogComparatorByAge);
        dogs.sort(new DogComparatorByName());
        Iterator var3 = dogs.iterator();

        while(var3.hasNext()) {
            Dog dog = (Dog)var3.next();
            PrintStream var10000 = System.out;
            String var10001 = dog.getName();
            var10000.println(var10001 + " " + dog.getBreed() + " " + dog.getAge());
        }

    }
}