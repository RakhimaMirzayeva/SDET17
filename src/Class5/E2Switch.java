package Class5;

public class E2Switch {
    public static void main(String[] args) {
        int day=3;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
            //if not apply break then java will execute everything after the last break
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");

            System.out.println("Wrong day");
        } else {
            System.out.println("Wrong day");
        }
    }
}