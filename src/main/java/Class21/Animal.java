package Class21;

public class Animal {
    int num=10;
    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void printInfo(){
        System.out.print(name+" "+color+" "+age+" ");
    }

}
class Dog extends Animal{
   int num=20;//you can write your own method in child class
    double weight;
    public Dog(String name, String color, int age,double weight) {
        super(name, color, age);
        this.weight=weight;
    }

    public void printInfo(){
        super.printInfo();//super keyword is to call method from parent class
        System.out.println(weight);//modified method that was coming from a parent

    }

}