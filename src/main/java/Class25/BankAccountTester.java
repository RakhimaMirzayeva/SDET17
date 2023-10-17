package Class25;

public class BankAccountTester {
    public static void main(String[] args) {


        BankAccount b = new BankAccount("Rakhima",21224564,160000000,"User123",
                "Pa1215","Checking");
        System.out.println(b.getName());
        System.out.println(b.getBankAccountNumber());
        b.setName("Abdulla");
        System.out.println(b.getName());
    }
}
