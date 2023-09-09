package Class18;

public class CarTester {

    public static void main(String[] args) {
        /*
        Write a java class that have 4 constructors with 4 different
         access levels of constructors(private,public,default,protected)
          and create 4 objects of this class:
           1 - inside same class;
           2 - from outside the class;
           3 - from different class inside different package  and observe result.
         */


        Car c1 = new Car("Toyota", "Prius", 2015, "Black");
        c1.printRes();
        Car c2 = new Car("Toyota", "Prius", 2015);
        c2.printRes();

        Car c3 = new Car("Toyota", "Prius");
        c3.printRes();
    }
}
