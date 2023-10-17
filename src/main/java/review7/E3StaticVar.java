package review7;

public class E3StaticVar {
    public static String country="US";
    void printName(){
        System.out.println(country);
    }
    static void printInfo(){
        System.out.println(country);
    }

    public static void main(String[] args) {
        System.out.println(country);
    }
}
class StaticTester{
    public static void main(String[] args) {
        System.out.println(E3StaticVar.country);

    }
}