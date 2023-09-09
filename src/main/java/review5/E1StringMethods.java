package review5;

public class E1StringMethods {
    public static void main(String[] args) {


        String str = "I think it should be a review 6";
    str.length();
        System.out.println(str.length());//length here will count the #of characters
        String s=new String("userName");//this bothe are the same thing
        //but String class is special so you dont have to write all of this
        // just the bottom code
        String userName="123Abdh";
        System.out.println(userName.length());
        int len=userName.length();
        if(len<8){
            System.out.println("Too short for a user Name");
        }

    }
}