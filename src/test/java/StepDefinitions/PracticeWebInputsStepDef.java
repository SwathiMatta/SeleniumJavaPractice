package StepDefinitions;

import Pages.WebInputsPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class PracticeWebInputsStepDef {


    WebInputsPage webInputs;


    @Given("User is on Home page")
    public void user_is_on_home_page() {
        webInputs.homePage();
    }

    @When("User clicks on WebInputs tile")
    public void user_clicks_on_web_inputs_tile() {
        webInputs.clickInputTile();
    }

    @Then("User should land on WebInputs page")
    public void user_should_land_on_web_inputs_page() {
        webInputs.onInputsPage();
    }

    @Given("user is at Number field")
    public void userIsAtNumberField() {
        webInputs.numberField();
    }

    @When("user provides some digit")
    public void userProvidesSomeDigit() {
        webInputs.numberInput("2");
    }

    @And("clicks on DisplayInput button")
    public void clicksOnDisplayInputButton() {
        webInputs.clickDisplayInput();
    }

    @Then("User should see provided data")
    public void userShouldSeeProvidedData() {
        webInputs.showOutputNumber();
    }

    @Given("User enters the Url {string}")
    public void userEntersTheUrl(String url) {
        webInputs.launchSFurl(url);
    }

    @When("user login as {string} user")
    public void userLoginAsUser(String username) {
        webInputs.enterCredentials(username, "SuperSecretPassword!");
    }

    @Then("user should login successfully")
    public void userShouldLoginSuccessfully() throws Exception {
        webInputs.isOnHomePage();
    }

    @When("user inputs the following details")
    public void userInputsTheFollowingDetails(DataTable inputData) {
        Map<String,String> inputMap=inputData.asMap(String.class,String.class);
        webInputs.fillNumber(inputMap.get("Number"));
        webInputs.fillText(inputMap.get("Text"));
        webInputs.fillPassword(inputMap.get("Password"));

    }
}
