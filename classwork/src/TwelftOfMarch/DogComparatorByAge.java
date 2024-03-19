package TwelftOfMarch;

import animal.Dog;
import java.util.Comparator;

public class DogComparatorByAge implements Comparator<Dog> {
    public DogComparatorByAge() {
    }

    public int compare(Dog o1, Dog o2) {
        if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return o1.getAge() > o2.getAge() ? 1 : -1;
        }
    }
}