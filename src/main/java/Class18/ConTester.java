package Class18;

public class ConTester {
    private ConTester(){
        System.out.println("Private");
    }
    ConTester(String name){
        System.out.println("Default");

    }
    protected ConTester(int age){
        System.out.println("Protected");
    }
    public ConTester(double wight){
        System.out.println("public");
    }

    public static void main(String[] args) {//when you put any access modifier java will execute
        //the correct one
        new ConTester();
        new ConTester("dhgdh");
        new ConTester(22);
        new ConTester(12.54);

    }
}
