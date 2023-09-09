package Class18;

public class ConTesterTester {
    public static void main(String[] args) {//in this class i can access the private constructor
        //but the rest
        new ConTester("");
        new ConTester(90);
        new ConTester(12.12);
        //new ConTester();Private one gives an error


    }
}
