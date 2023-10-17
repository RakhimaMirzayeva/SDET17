package Class25;

public class BankAccount {
    private String name;
   final private long bankAccountNumber;
    private double balance;
   final private String userName;
    private String password;
    final private String accountType;
    //Getter method is possible with final type, but not setter method.
    //below is the constructor, it always must be same as class name.

    public BankAccount(String name,long bankAccountNumber, double balance, String userName, String password, String accountType) {
        this.name=name;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
        this.userName = userName;
        this.password = password;
        this.accountType = accountType;
    }
    public BankAccount(long bankAccountNumber, String userName, String password, String accountType, String accountType1) {
        this.bankAccountNumber = bankAccountNumber;
        this.userName = userName;
        this.password = password;
        this.accountType = accountType1;
    }

    public BankAccount(String userName,String accountType,long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
        this.userName = userName;
        this.accountType = accountType;

    }
    //Below are methods
    public String getName(){//Getter Method
        return name;
    }
    public long getBankAccountNumber(){
        return bankAccountNumber;
    }
void setName(String name){//"Setter method"this one is used to change the name
        this.name=name;
}

}
