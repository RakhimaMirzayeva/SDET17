package Class17;

public class Car {
    //this area is a Field, so this goes first
    private String make;
    private String model;
   private String color;

    private double price;
    //this is a constructor
    //we can call methods,writing if else statements
public Car(String cMake,String cModel, String cColor, double cPrice){
    //Initializing my instance variables of this class with parameter
    make=cMake;
    model=cModel;
    color=cColor;
    price=cPrice;

}
void printInfo(){
    System.out.println(make+" "+model+" "+color+" "+price);
}
void setPrice(double cPrice){
    price=cPrice;
}
double getPrice(){
    return price;
}
}
