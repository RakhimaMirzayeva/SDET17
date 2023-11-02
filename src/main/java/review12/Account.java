package review12;

public class Account {
    private double accountBalance;
    Account(double accountBalance){
        this.accountBalance=accountBalance;
    }
    void transferFunds(double amount) throws InsufficientAccountBalanceException {
        if(amount>accountBalance){
            //throw keyword is used when you want specifically throw that condition
            throw new InsufficientAccountBalanceException("You don't have enough funds");
        }
    }
   public class AccountTester{
        public static void main(String[] args) throws InsufficientAccountBalanceException {
            Account account=new Account(100);
            account.transferFunds(12000);
        }
    }
}
/*
throw is used to throw the exception
Throws is actually throw the exception
 */