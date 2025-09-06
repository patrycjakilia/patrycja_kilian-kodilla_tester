package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    @Given("I have deposited ${int} in my wallet")
    public void i_have_deposited_in_my_wallet(Integer amount) {
        wallet.deposit(amount);
        assertEquals(amount, wallet.getBalance());
    }

    @Given("I haven't deposit in my wallet")
    public void i_haven_t_deposit_in_my_wallet() {
        assertEquals(0, wallet.getBalance());
    }

    @When("I request ${int}")
    public void i_request(Integer amount) {
        cashier.withdraw(wallet, amount);
    }

    @Then("${int} should be dispensed")
    public void should_be_dispensed(Integer amount) {
        assertEquals(amount, cashSlot.getContents());
    }

    @Then("${int} shouldn't be dispensed")
    public void should_not_be_dispensed(Integer amount) {
        assertEquals(0, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be ${int}")
    public void the_balance_of_my_wallet_should_be(Integer expectedBalance) {
        assertEquals(expectedBalance, wallet.getBalance());
    }

    @Given("there is ${int} in my wallet")
    public void there_is_in_my_wallet(Integer amount) {
        wallet.deposit(amount);
    }

    @When("I withdraw ${int}")
    public void i_withdraw(Integer amount) {
        cashier.withdraw(wallet, amount);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_dont_have_enough_money_in_my_wallet() {
        assertEquals("You don't have enough money in your wallet", cashier.getMessage());
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        wallet.getBalance();
    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is(Integer expectedBalance) {
        assertEquals(expectedBalance, wallet.getBalance());
    }
}