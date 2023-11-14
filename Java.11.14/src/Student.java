public class Student extends Human{
    public Student(String name, int age){
        super(name, age);
    }

    public void Test(){
        super.name = "sadsa";
    }
}
