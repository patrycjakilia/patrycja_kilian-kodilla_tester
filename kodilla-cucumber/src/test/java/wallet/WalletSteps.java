package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance());
    }
    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }
    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        assertEquals(30, cashSlot.getContents());
    }

    @Given("I have deposited $100 in my wallet")
    public void i_have_deposited_$100_in_my_wallet() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance());
    }
    @When("I request $220")
    public void i_request_$220() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 220);
    }
    @Then("$220 shouldn't be dispensed")
    public void $220_shouldn_t_be_dispensed() {
        assertEquals(0, cashSlot.getContents());
    }

    @Given("I haven't deposit in my wallet")
    public void i_haven_t_deposit_in_my_wallet() {
        wallet.deposit(0);
        assertEquals(0, wallet.getBalance());
    }
    @When("I request $20")
    public void i_request_$20() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 20);
    }
    @Then("$20 shouldn't be dispensed")
    public void $20_shouldn_t_be_dispensed() {
        assertEquals(0, cashSlot.getContents());
    }

    @When("I request $100")
    public void i_request_$100() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 100);
    }
    @Then("$100 should be dispensed")
    public void $100_should_be_dispensed() {
        assertEquals(100, cashSlot.getContents());
    }

    @When("I request $0")
    public void i_request_$0() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 0);
    }
    @Then("$0 shouldn't be dispensed")
    public void $0_shouldn_t_be_dispensed() {
        assertEquals(0, cashSlot.getContents());
    }


}