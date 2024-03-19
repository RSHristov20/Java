package Animal;

public class Dog extends Animal implements Comparable<Dog> {
    private String name;
    private String breed;

    public Dog(String name, String breed, int age) {
        super(age);
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public String toString() {
        return this.breed + " " + super.age;
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    public int compareTo(Dog other) {
        if (super.age == other.age) {
            if (this.name.compareTo(other.name) == 0) {
                return 0;
            } else {
                return this.name.compareTo(other.name) > 0 ? 1 : -1;
            }
        } else {
            return this.age > other.age ? 1 : -1;
        }
    }
}