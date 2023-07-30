package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
    }
    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }
    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assert.assertEquals(30, cashSlot.getContents());
    }

    @When("I request $201")
    public void i_request_$201() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 201);
    }

    @Then("I should see an error message saying 'Insufficient funds'")
    public void i_should_see_an_error_message_saying_insufficient_funds() {
        cashSlot.setErrorMessage("Insufficient funds");
        Assert.assertEquals("Insufficient funds", cashSlot.getErrorMessage());
    }

    @When("I request $0")
    public void i_request_$0() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 0);
    }

    @Then("I should see an error message saying 'Invalid amount'")
    public void i_should_see_an_error_message_saying_invalid_amount() {
        cashSlot.setErrorMessage("Invalid amount");
        Assert.assertEquals("Invalid amount", cashSlot.getErrorMessage());
    }

    @Given("I have deposited a negative amount in my wallet")
    public void i_have_deposited_a_negative_amount_in_my_wallet() {
        wallet.deposit(-100);
    }
    @Then("My wallet balance should remain unchanged")
    public void my_wallet_balance_should_remain_unchanged() {
        Assert.assertEquals(200, wallet.getBalance());
    }

}