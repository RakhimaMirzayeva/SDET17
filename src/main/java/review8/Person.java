package review8;


    class Person {
        public static void main(String[] args) {

            Employee employee=new Employee();
            employee.printInfo("Joe","Smith",35,35000);

            Tester tester=new Tester();
            tester.printInfo("Adam","Smith",15,"java");

        }

    }

class Main {
    String firstName;
    String lastName;
    int age;



    public void printInfo(String firstName,String lastName,int age) {
        System.out.println(firstName + " " + lastName + " " + age);
    }}

class Employee extends Person {
    int salary;

    public void printInfo(String firstName,String lastName,int age,int salary) {
        System.out.println(firstName + " " + lastName + " " + age+" "+salary);
    }
}
class Tester extends Employee {
    String programmingLang;

    public  void printInfo(String firstName,String lastName,int age,String programmingLang) {
        System.out.println(firstName + " " + lastName + " " + age+" "+programmingLang);
    }}
