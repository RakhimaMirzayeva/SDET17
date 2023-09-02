package JAVAHomework;

public class Replit93 {
    public static void main(String[] args) {
        String input = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";

        int position1=input.indexOf("c");
        System.out.println(position1);
        int position2=input.indexOf(" ");
        System.out.println(position2);
        int position3=input.indexOf(target1);
        System.out.println(position3);
        int position4=input.indexOf(target2);
        System.out.println(position4);
    }
}

