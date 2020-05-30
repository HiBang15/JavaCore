package Bank_App;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
    public InsufficientFundsException(double Balance){
        super("Withdraw bigger balance : " +Balance);
    }
}
