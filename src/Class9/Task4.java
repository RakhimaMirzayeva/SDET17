package Class9;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 0; i <2; i++) {
            System.out.println("Outer Loop");
            for (int j = 0; j < 5; j++) {

                if(j==2){//we ask to be printed 5 times, but we put break point in the second time
                    //so it will print 2 times and loop will break, and go back to outer loop
                    //you can change that number with any number that is less then 5.
                    break;
                }
                System.out.println("Inner loop");
            }

        }
    }
}
