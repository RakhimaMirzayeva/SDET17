package Class21;

public class CreditCard {
    /*
    Create a class CreditCard Create an instance method that will calculate
interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes

1

Message #🎙live-questions

     */
    private double balance;
    private double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest() {
        double totalInterest = balance * interest*100;
        System.out.println(totalInterest);
    }
}
class Visa extends CreditCard{

    // @Override

    Visa(double balance,double interest){
        super(balance,interest);
    }
    public void calculateInterest() {
        super.calculateInterest();
    }
}
class AX extends CreditCard {

    AX(double balance, double interest) {
        super(balance, interest);
    }

    // @Override
    public void calculateInterest() {
        super.calculateInterest();
    }
}