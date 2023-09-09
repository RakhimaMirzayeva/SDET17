package Class18;

public class Person {
    private String name;//These are Instance Variables
    private int age;
    private double weight;
    private char gender;
    private int salary;
    private String hairColor;

    public Person(String name, int age, double weight, char gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public Person(String name, int age, double weight){
         this.name=name;
         this.age=age;
         this.weight=weight;
}
     public Person(String name,int age,double weight,char gender,int salary,String hairColor){//These are Parameters
         this.name=name;//this is a Local Variable
         this.age=age;
         this.weight=weight;
         this.gender=gender;//if comment out this gender then it will run Null
//Use This keyword when there is a duplication or confusion.
         this.salary=salary;
         this.hairColor=hairColor;
     }
     public void printInfo(){
         //String name="Giu";//this will be printed because local variables have more priority
         System.out.println(name+" "+age+" "+weight+" "+gender);//if i put this inside of print out
          //then I will see my name because i specifically tell java what to print.
     }
}
