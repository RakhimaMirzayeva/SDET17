package review9;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.speak();
        animal.eat();
        Dog d=new Dog();
        d.speak();
        d.eat();
        Cat c=new Cat();
        c.speak();
        c.eat();
        //shorter way for calling all the methods
        Animal [] arr={new Animal(),new Dog(),new Cat()};
        for(Animal a:arr){
            a.eat();
            a.speak();
        }




    }
}
