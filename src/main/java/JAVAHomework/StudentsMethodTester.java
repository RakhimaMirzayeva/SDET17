package JAVAHomework;

public class StudentsMethodTester {

    public static void main(String[] args) {
        StudentsMethod std=new StudentsMethod();
        std.name="Rakhima";
        std.ID=123;
        std.numberOfStudents++;

        std.name="Asghar";
        std.ID=456;
        std.numberOfStudents++;

        std.name="Moazzam";
        std.ID=789;
        std.numberOfStudents++;
        System.out.println("NUmber of Students is "+std.numberOfStudents);
    }

}
