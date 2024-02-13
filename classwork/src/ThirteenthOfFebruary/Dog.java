package ThirteenthOfFebruary;

public class Dog extends Animal{
    public String breed;

    public Dog(String breed, int age){
        super(age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return this.breed + " " + super.age;
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
}