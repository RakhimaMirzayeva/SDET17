package Class19;

public class Y {
    String name;
    void printName(){
        System.out.println(name);
    }
}
class Z extends Y{
    String age;
    void printAge(){
        System.out.println(age);
    }
}
class X extends Z{
    String color;
    void printColor(){
        System.out.println(color);
    }
}