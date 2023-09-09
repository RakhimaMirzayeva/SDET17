package Class18;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private double price;
    private char gender;

    public Cat(String name, String breed, int age, double price){

     this.name=name;
        this.breed=breed;
        this.age=age;
        this.price=price;
}

    public Cat(String name,String breed,int age,double price,char gender){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.price=price;
        this.gender = gender;

    }
    public void printInfo(){
        System.out.println(name+" "+breed+" "+age+" "+price+" "+gender);
    }
}
