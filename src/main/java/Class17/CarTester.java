package Class17;

public class CarTester {
    public static void main(String[] args) {//inside the paranthesis set the info
        Car c1=new Car("Toyota","Camry","White",35000);
    c1.printInfo();
    c1.setPrice(30000);
    c1.printInfo();
        System.out.println(c1.getPrice());
    }
}
