package Class23;

public abstract class Animal {
    String name;
    String breed;
    String color;
    abstract void speak();// use abstract keyword when you don't want to make a implementation details, body for void,
    //leave the details part for the user.(abstract is used when you want to leave the body
    //empty)
    abstract void sleep();
    abstract void eat();

}
class Dog extends Animal{

    @Override
    void speak(){
        System.out.println("Wuff Wuff..");

    }
    @Override
    void sleep(){
        System.out.println("Sleeping for last 10 hours....");
    }
    @Override
    void eat(){
        System.out.println("Eating Bones....");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("Meow Meow....");
    }
    @Override
    void sleep(){
        System.out.println("Cats sleep for 12-16 hours");
    }
    @Override
    void eat(){
        System.out.println("Eating fish..");
    }
}