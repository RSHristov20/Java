package Animal;

public class Animal {
    protected int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void eat() {
        System.out.println("Eeating...");
    }
}
