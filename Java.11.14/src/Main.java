import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Dragan", 20);
        //human.setAge(-10);
        System.out.println(human.getCars().size());

        human.getCars().add("Opel");
        human.getCars().add("Mercedes");

        System.out.println(human.getCars().size());
    }
}
