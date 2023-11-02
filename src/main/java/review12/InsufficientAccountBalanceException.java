package review12;
/*
This exception isThrown when user does not have enough balance(mesege from dev)
 */
public class InsufficientAccountBalanceException extends Exception {
    //creating my own Exception.
    public InsufficientAccountBalanceException(String msg){
        super(msg);
    }

}
