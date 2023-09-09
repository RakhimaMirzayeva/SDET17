package Class18;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    public Car(String make,String model,int year,String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
        public Car(String make,String model,int year){
            this.make=make;
            this.model=model;
            this.year=year;


    }
    public Car(String make,String model) {
        this.make = make;
        this.model = model;
    }
    public void printRes(){
        System.out.println(make+" "+model+" "+year+" "+color);
    }
}
