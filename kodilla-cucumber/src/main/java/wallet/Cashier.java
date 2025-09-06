package wallet;

public class Cashier {
    private final CashSlot cashSlot;
    private String message;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
            message = "Please take your cash";
        } else {
            cashSlot.dispense(0);
            message = "You don't have enough money in your wallet";
        }
    }

    public String getMessage() {
        return message;
    }
}