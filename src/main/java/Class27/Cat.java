package Class27;

import java.util.LinkedList;

public class Cat {
    /*
  Create a Cat class create 3 fields a constructor and printInfo method inside it.
  Create three objects from this class store them inside the Linkedlist and
  call printInfo method using these three objects.
   */
    String name;

    int age;
    String breed;
    public Cat(String name, int age, String breed) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Breed: "+breed);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        LinkedList<Cat> catList = new LinkedList<>();

        Cat cat1 = new Cat("Whiskers", 5, "Persian");
        Cat cat2 = new Cat("Fluffy", 4, "Bengal");
        Cat cat3 = new Cat("Felix", 3, "Tabby");

        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);

       // for (Cat c : catList) {
           // c.printInfo();
            //System.out.println();

        }
    }




