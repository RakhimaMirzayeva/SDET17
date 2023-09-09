package Class17;

public class T1StringSwap {
    public static void main(String[] args) {
        String str1="Rakhima";
        String str2="MIrzayeva";
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        System.out.println(str2);
    }
}
