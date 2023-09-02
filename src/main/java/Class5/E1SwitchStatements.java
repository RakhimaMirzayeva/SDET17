package Class5;

public class E1SwitchStatements {
    public static void main(String[] args) {

        int day=4;//easy to use for debugging, switch is capable of ignoring anything that is not
        // useful,and directly take you where is important(with only 1 step) if statement willuse 7 steps

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;//if not apply break then java will execute everything after the last break
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");
/*
Switch limitations; switch do not support all the data types like long, double, boolean
switch can use only(check pdf printed slides)
 */
        }
    }
}
