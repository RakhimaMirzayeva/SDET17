package review9;

public class Animal {
    void speak(){
        System.out.println("Animal Speak");
    }
    void eat(){
        System.out.println("Animal eat");
    }
}
class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Wuff Wuff");
    }

    @Override
    void speak(){
        System.out.println("Dog likes to sleep 8-12 hours");

    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Cat speaks Meow Meow");
    }

    @Override
    void eat() {
        System.out.println("Cat sleeps 16-20 hours");
    }
}
