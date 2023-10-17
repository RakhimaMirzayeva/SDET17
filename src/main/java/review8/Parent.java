package review8;

import java.util.Scanner;

public class Parent {
    Scanner scanner =new Scanner(System.in);
    String name="James";
    void printInfo(){
        System.out.println("Hello World");

    }
    Parent() {
        System.out.println("Parent class constructor");
    }
    Parent(String n){
            System.out.println("Parent class with parameters");
        }
    }

class Child extends Parent {
    //String name = "John";

    void printHello() {
        System.out.println("Hello Java");
    }

    void test() {
        String name = "White";
        System.out.println(super.name);//use super if you want specifically print the first Parent
        //Class name"James"
        System.out.println(this.name);
        System.out.println(name);
    }

    void methodTest() {
       super.printInfo();
    }
    public Child(){
        super("name");
    }
    //var args( you can use when you don't know how many parameters you are going to use)
    // Can be done with any dataType
void print(int...a){
    System.out.println("pass as many");
}
}
