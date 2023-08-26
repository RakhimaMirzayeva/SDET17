package Class13;

public class E1StringMethods {
    public static void main(String[] args) {

        String str="Batch 17 is great.";
        System.out.println(str.charAt(0));
        int length=str.length();
        System.out.println(str.charAt(17));
        //System.out.println(lastIndex);//will give the total number of indexs
        System.out.println(str.charAt(str.length()-1));//on the bottom is the same thing of this line
        //just this top one line is the shortcut for the all bottom line.
        System.out.println("******************");
        int lastIndex=str.length()-1;//you can put any number here
        //System.out.println(lastIndex);
        char c=str.charAt(lastIndex);
        System.out.println(c);
    }
}

