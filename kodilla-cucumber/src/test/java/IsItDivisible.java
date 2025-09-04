import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class IsItDivisible {

    private int number;
    private String answer;

    @Given("Value of 3")
    public void value_of_3() {
        this.number = 3;
    }

    @Given("Value of 5")
    public void value_of_5() {
        this.number = 5;
    }

    @Given("Value of 15")
    public void value_of_15() {
        this.number = 15;
    }

    @Given("Value of 7")
    public void value_of_7() {
        this.number = 7;
    }

    @When("I ask whether number is divisible")
    public void i_ask_whether_number_is_divisible() {
        if (number % 3 == 0 && number % 5 == 0) {
            this.answer = "FizzBuzz";
        } else if (number % 3 == 0) {
            this.answer = "Fizz";
        } else if (number % 5 == 0) {
            this.answer = "Buzz";
        } else {
            this.answer = "None";
        }
    }

    @Then("I should be told divisible {string}")
    public void i_should_be_told(String expected) {
        assertEquals(expected, this.answer);
    }
}
