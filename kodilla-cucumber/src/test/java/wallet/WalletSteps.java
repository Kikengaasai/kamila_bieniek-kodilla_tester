package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;

public class WalletSteps {
    private  Wallet wallet = new Wallet();
    private  CashSlot cashSlot = new CashSlot();
    private  Cashier cashier = new Cashier(cashSlot);

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assertions.assertEquals(200, wallet.getBalance(),"Incorrect wallet balance");
    }



    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }
    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assertions.assertEquals(30, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
        Assertions.assertEquals(170,  wallet.getBalance(),"Incorrect wallet balance");
    }




    
    @When("I request $201")
    public void i_request_$201() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 201);
    }
    @Then("I should see an error message saying 'Insufficient funds'")
    public void i_should_see_an_error_message_saying_insufficient_funds() {
        cashSlot.setErrorMessage("Insufficient funds");
        Assertions.assertEquals("Insufficient funds", cashSlot.getErrorMessage());
    }


    @When("I request $0")
    public void i_request_$0() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 0);
    }


    @Then("I should see an error message saying 'Invalid amount'")
    public void i_should_see_an_error_message_saying_invalid_amount() {
        cashSlot.setErrorMessage("Invalid amount");
        Assertions.assertEquals("Invalid amount", cashSlot.getErrorMessage());
    }




    @Given("I have deposited a negative amount in my wallet")
    public void i_have_deposited_a_negative_amount_in_my_wallet() {
        wallet.deposit(-100);
    }
    @Then("My wallet balance should remain unchanged")
    public void my_wallet_balance_should_remain_unchanged() {
        Assertions.assertEquals(200, wallet.getBalance());
    }




    @Given("I have deposited $100 in my wallet")
    public void i_have_deposited_$100_in_my_wallet() {
        wallet.deposit(100);
        Assertions.assertEquals(100, wallet.getBalance());
    }

    @When("I withdraw $200")
    public void i_withdraw_$200() {
        cashier.withdraw(wallet, 200);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_dont_have_enough_money_in_my_wallet() {
        Assertions.assertEquals("Insufficient funds", cashSlot.getErrorMessage());
    }

    @Given("I have deposited $10 in my wallet")
    public void i_have_deposited_$10_in_my_wallet() {
        wallet.deposit(10);
        Assertions.assertEquals(10, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request $1000")
    public void i_request_$1000() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 1000);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed2() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_dont_have_enough_money_in_my_wallet2() {
        Assertions.assertEquals("Insufficient funds", cashSlot.getErrorMessage());
    }

}