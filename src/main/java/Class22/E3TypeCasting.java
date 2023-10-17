package Class22;

public class E3TypeCasting {
    public static void main(String[] args) {
        Student s1=new Student("Rakhima","A1234");
        Student s2=new Student("Abdulla","A4534");
//new==>creates the Obj of the class
 //(=)===>assigns obj to the class
//("Rakhima","A1234")==>call to the Constructor
    Student [] arr={new Student("Rakhima","A1234"),new Student("Abdulla","A4534")};
    //arr[1].printInfo();//will print s2 because index #1 is s2
//primitive dataTypes can not have methods
        for (int i = 0; i < arr.length; i++) {//length() only in String class
        Student s=arr[i];
        s.printInfo();
        }
        int num=(int)12.5;//Explicit-narrowing(converting double to int)
        System.out.println(num);
        double age=10;//Implicit=widening/automatic
        Animal a=new Dog();//see no error because Animal(Parent class) and its larger then child class


    }
}
