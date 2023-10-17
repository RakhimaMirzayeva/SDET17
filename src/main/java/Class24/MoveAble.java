package Class24;

public interface MoveAble {
    public abstract void move();

}
interface  WashAble {

    void wash();
}
class Dog implements MoveAble,WashAble{

    @Override
    public void move() {
        System.out.println("Dogs can jump run and can move");
    }

    @Override
    public void wash() {
        System.out.println("You can safely wash the dog");
    }
}
class Car implements MoveAble,WashAble{

    @Override
    public void move() {
        System.out.println("Car can move forwards and can go n circle");
    }

    @Override
    public void wash() {
        System.out.println("We can wash a car");
    }
}