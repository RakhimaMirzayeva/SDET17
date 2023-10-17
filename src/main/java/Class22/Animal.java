package Class22;

public class Animal {
    void speak(){
        System.out.println("Animals can speak");
    }
    void sleep(){
        System.out.println("Animal sleep");

    }
    void eat(){
        System.out.println("Eating seeds");
    }
}
class Dog extends Animal{//ctrl + O will write all overide for me









    void speak(){
        System.out.println("Wuff Wuff");

    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Mew mew mew");
    }

    @Override
    void sleep() {

    }

    @Override
    void eat() {

    }
}