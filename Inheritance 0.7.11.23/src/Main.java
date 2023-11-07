public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle(100, 100);
        Car car = new Car(100, 100);

        vehicle.drive(50);
        car.drive(50);
    }
}
