package Class21;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard obj = new CreditCard(150, 3.2);
        obj.calculateInterest();
        Visa obj1 = new Visa(450, 2.1);
        obj1.calculateInterest();
        AX obj2 = new AX(10, 2.4);
        obj2.calculateInterest();
    }
}
