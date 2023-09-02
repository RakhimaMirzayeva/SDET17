package HOMEWORK;

public class replit118 {
    public String spaceOut(String s){
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i)).append(" ");
        }
        result.append(" ");
        return result.toString();
    }
    public static void main(String[]args){
        String s=new String();
        s="hello";



        System.out.println(s.replaceAll("\\s+"," "));
    }

}
