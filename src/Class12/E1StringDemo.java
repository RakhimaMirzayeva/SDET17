package Class12;

public class E1StringDemo {
    public static void main(String[] args) {
        //we have created an object from the String class and have stored  cat inside it.
        String obj=new String("Cat");
        // Shortcut to create obj from String class
        String obj2="My Dog";//you actually doing this String obj2=new String("Dog");
        int len=obj2.length();// will calculate letters and even empty spaces. calling the legth method/function/action
        // /behavior
        System.out.println(len);
    }
}
