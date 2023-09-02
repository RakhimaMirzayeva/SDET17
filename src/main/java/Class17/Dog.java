package Class17;

public class Dog {
    private String name;
    private String breed;
    private String color;
    private int age;
    public Dog(String dName,String dBreed,String dColor,int dAge){//This is the Constructor
        name=dName;
        breed=dBreed;
        color=dColor;
        age=dAge;

        //if(dAge<0||dAge>30){
           // System.out.println("Not Allowed");
       // }else{
           // age=dAge;
        }
public Dog(String dName,String dBreed,String dColor){//we can have multiple constructions
    name=dName;
    breed=dBreed;
    color=dColor;
}


    public void bark(){
        System.out.println("wuff wuff...");
        //also can do this
    }
    public void printInfo() {


        System.out.println(name + " " + breed + " " + color);
    }
}
