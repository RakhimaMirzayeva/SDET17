package Class30;

public class E5Exceptions {
    public static void main(String[] args) {
        System.out.println("1");

        try{
            //place the code that might throw an exception
           // System.out.println(10/0);
            String name=null;
            name.length();
        }catch(ArithmeticException e){
            System.out.println("Don't divide by zero");
        } catch(NullPointerException e) {
            System.out.println("Check if you stored the null value in the variable");
        }
    }
}
