package Class24;

public interface Vehicle {
    void drive();

}
interface Bike extends Vehicle{
    void applyBreaks();

}
class HondaBike implements Bike{

    @Override
    public void drive() {
        System.out.println("All Vehicles can drive");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Needs to apply breaks");
    }
}