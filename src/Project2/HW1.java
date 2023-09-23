package Project2;

public class HW1 {
    public static void main(String[] args) {
        String name="Rakhima";
        String lastName="Mirzayeva";

        name=name+lastName;
        lastName=name.substring(0,name.length()-lastName.length());
        name=name.substring(lastName.length());
        System.out.println("This is a swapping result: ");
        System.out.println(name);
        System.out.println(lastName);
    }
}


