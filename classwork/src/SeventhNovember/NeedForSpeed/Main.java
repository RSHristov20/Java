package SeventhNovember.NeedForSpeed;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(100,100);
        Car car = new Car(100,100);

        vehicle.drive(100);
        car.drive(300);
    }
}
