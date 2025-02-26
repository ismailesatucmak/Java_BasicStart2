public class AccaountManager {

    private double balance;

    public void deposit(double amount){
        balance = getBalance() + amount;
    }
    public void withdraw(double amount) throws BalanceInsufficentException {
        if (balance>=amount){
            balance = getBalance() - amount;
        }else {
            throw new BalanceInsufficentException("Yetersiz bakiye!!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
