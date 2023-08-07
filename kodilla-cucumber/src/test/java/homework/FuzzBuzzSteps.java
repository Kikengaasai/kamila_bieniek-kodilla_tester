package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FuzzBuzzSteps {

    private int number;
    private String result;

    @Given("I have {int}")
    public void  i_have_number (int number) {
        this.number = number;
    }
    @When("I call the fizzbuzz function")
    public void i_call_the_fizzbuzz_function() {
        this.result = FuzzBuzzSteps.fizzBuzz(number);
    }

    @Then("I should get {string}")
    public void i_should_get(String result) {
        assertEquals(result, this.result);
    }

    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "None";
        }
    }

}
