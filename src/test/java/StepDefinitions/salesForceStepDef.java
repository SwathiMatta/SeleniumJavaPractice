package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.*;
import org.junit.Assert;

public class salesForceStepDef {

    salesForceLoginPage sflogin;

    @When("user login with {string}")
    public void userLoginWith(String username) {
        sflogin.enterCredentials(username,"SuperSecretPassword!");

    }

    @Given("User launch Salesforce website Url {string}")
    public void userLaunchSalesforceWebsiteUrl(String url) {
        sflogin.launchSFurl(url);

    }

    @Then("user should be on home page")
    public void userShouldBeOnHomePage() throws Exception {
        sflogin.isOnHomePage();

    }
}
