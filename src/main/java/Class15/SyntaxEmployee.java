package Class15;

public class SyntaxEmployee {
//static variable for a CEO because it never change
// empID instance
// static values we write all capital letters
    String empID;
    int salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee asghar=new SyntaxEmployee();
        asghar.empID="I123";
        asghar.salary=-20;

        SyntaxEmployee moazzam=new SyntaxEmployee();
        moazzam.empID="d123";
        moazzam.salary=95;

        System.out.println(moazzam.salary);
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(moazzam.CEO);
        System.out.println(asghar.CEO);
    }
}





