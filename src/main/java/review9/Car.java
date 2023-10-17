package review9;

public class Car implements WashAble{
    public void drive(){
        System.out.println("driving.......");

    }
    @Override
    public void wash(){
        System.out.println("Take a car to the car wash");
    }
}
class Horse implements WashAble{
@Override
    public void wash(){
    System.out.println("Horse can wash themselves");
}
}