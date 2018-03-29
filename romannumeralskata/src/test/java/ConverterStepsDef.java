import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static junit.framework.Assert.assertEquals;

public class ConverterStepsDef {

    private RomanNumeralsConverter converter;

    @Given("^a roman numerals converter$")
    public void aNewBowlingGame() throws Throwable {
        converter = new RomanNumeralsConverter();
    }

    @When("^i input (\\d+)$")
    public void iInputANumber(int input) throws Throwable {
        converter.setInput(input);
    }

    @Then("^my converter should return (\\w+)$")
    public void theResultShouldBe(String expectedResult) throws Throwable {
        assertEquals(expectedResult, converter.getResult());
    }
}
