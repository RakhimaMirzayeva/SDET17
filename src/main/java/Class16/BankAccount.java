package Class16;

public class BankAccount {
    private String name = "Fahim";

    private String userName = "Fahim123";
    private String password = "pass123";
    private double accountBalance = 300;
    private String accountNum = "12345";

    void printInfo(){//we can also make it Private
        System.out.println("I am Fahim from Batch 17");
}

   void printCity(){
       System.out.println("New York");
   }
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.name);
        System.out.println(bankAccount.accountNum);

    }
}




