package Class19;

public class AnimalTester {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.name="Tome";
        c.breed="Russian";
        c.color="White with pink dots";
        c.age=8;
        c.attitude=true;
        c.printInfo();
        Dog d=new Dog();
        d.bark();
        d.name="Jacky";
        d.breed="German";
        d.printInfo();

    }
}
