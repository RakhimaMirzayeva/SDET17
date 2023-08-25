package Class12;

public class E7StringDemo {
    public static void main(String[] args) {
        String str="Today is a Java Class";
        System.out.println(str.startsWith("T"));//it will not work with lower letter t because java is sensitive.
        System.out.println(str.startsWith("Today"));//Space is considered as a character.
        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("Class"));



    }
}
