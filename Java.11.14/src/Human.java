import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Human {
    protected String name;
    private int age;
    private List<String> cars;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        this.cars = new ArrayList<>();
    }

    public List<String> getCars(){
        return Collections.unmodifiableList(cars);
    }

    public String getName(){
        return name;
    }

    private void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) throws IllegalAccessException{
        if(age < 0){
            throw new IllegalAccessException();
        }
        this.age = age;
    }
}
