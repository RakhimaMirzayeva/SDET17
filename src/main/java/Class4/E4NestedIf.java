package Class4;

public class E4NestedIf {
    public static void main(String[] args) {
        boolean userDegree = true;
        double gpa = 3.5;

        if (userDegree == true) {
            System.out.println("Congratulations");
            if (gpa >= 3.5) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should studied harder");
            }
        } else {
            System.out.println("You should get the degree");
        }
    }

}