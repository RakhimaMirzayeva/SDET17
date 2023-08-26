package Class13;

public class E11StringMethods {
    public static void main(String[] args) {
        String str="Hi#There#how#are#you.";
        String [] strsArr=str.split("[#]");
        System.out.println(strsArr.length);
        System.out.println(strsArr[1]);//because index starts with 0


    }
}
