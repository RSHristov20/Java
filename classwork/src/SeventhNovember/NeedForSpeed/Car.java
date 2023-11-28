package SeventhNovember.NeedForSpeed;

public class Car extends Vehicle{
    private final static double DEFAULT_FUEL_CONSUMPTION = 3;

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
