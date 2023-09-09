package Class20;

public class Car {
    String make;
    String model;
    double price;
    String color;


    public Car(String make, String model, double price, String color) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
    }
        void printInfo() {
            System.out.println(make + " " + model + " " + price + " " + color);
        }

}

    class BMW extends Car {
        public BMW(String make, String model, double price, String color) {
            //calling the constructor from the parent class.
            super(make, model, price, color);


        }
    }


    class Audi extends Car {
    boolean sunRoof;
        public Audi(String make, String model, double price, String color,boolean sunRoof) {
            super(make, model, price, color);
            this.sunRoof=sunRoof;
        }
    }

