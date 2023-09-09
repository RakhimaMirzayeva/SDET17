package review6;

public class SuperHeroes {
    String name, power;
    int age;
    char gender;
    SuperHeroes(String name,String power) {//this is constructor
        this.name = name;
        this.power = power;
    }
     SuperHeroes(String name,String power,int age){
         this(name, power);//making a call to the Current class constructor
         this.age=age;//this=>accessing Current class instance variables

        }


    public static void main(String[] args) {
        SuperHeroes s1=new SuperHeroes("Superman","Fly");
        SuperHeroes s2=new SuperHeroes("Batman","Money",27);
        System.out.println(s2);



    }
}
