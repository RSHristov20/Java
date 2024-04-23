package Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Name", "Beagle", 5);
        dog.eat();
        System.out.println(dog);
        Animal animal = new Animal(10);
        List<Animal> animals = new ArrayList();
        animals.add(animal);
        animals.add(dog);
        MyCustomList myCustomList = new MyCustomList();
        myCustomList.add("asddsa");
        Iterator var5 = animals.iterator();

        while(var5.hasNext()) {
            Animal animal1 = (Animal)var5.next();
            System.out.println(animal1);
        }

    }
}
