package Class19;

import Class20.Bike;

public class HondaBike extends Bike{
    void printModel(){
        System.out.println(make);
    }
}
class Tester{
    public static void main(String[] args) {
        Bike b=new Bike();
        System.out.println(b.make);


    }
}