package Class21;

public class Programming {
    /*
    Create a class named 'Programming'. While creating an object of the class,
     if nothing is passed to it, then the message "I love programming languages"
      should be printed. If some String is passed to it, then in place of "programming
      languages" the value variable should be printed. Example, if we pass "Java",
      then "I love Java" should be printed.
     */

   //constructors returns object of the class
    public void printInfo(){
        System.out.println("I love programming language");
    }
    public void printInfo(String text){
        System.out.println("I love "+text);
    }

    public static void main(String[] args) {
        Programming p1=new Programming();
            p1.printInfo();
        p1.printInfo("Java");

    }
}
