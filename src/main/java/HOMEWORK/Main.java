package HOMEWORK;

public class Main {
    String carColor;
    int carYear;
    String carMake;
    public static void main(String[] args) {



    Main bmw=new Main();
    bmw.carColor="Black";
    bmw.carYear=2019;
    bmw.carMake="BMW";

    Main toyota=new Main();
    toyota.carColor="White";
    toyota.carYear=2018;
    toyota.carMake="Toyota";
   System.out.println("Car color is "+bmw.carColor+" and car year is "+bmw.carYear+" and model is "+"bmw.carMake");
   System.out.println("Car color is "+toyota.carColor+" and car color is "+toyota.carYear+" and car model is "+toyota.carMake);
}
}
