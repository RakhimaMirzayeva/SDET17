package Class20;

public class Furniture {
    String color="Black";
}
class Chair extends Furniture{
    String color="Brown";
    void printInfo(){
        String color="Blue";
        System.out.println(color);
        //System.out.println(super.color);this is will print color Black(to print the field from parent)
    }
}
//Java will print the closest color to the printing statement
class FurnitureTester{
    public static void main(String[] args) {
        Chair c=new Chair();
        c.printInfo();
    }
}