package StepDefinitions;

import io.cucumber.java.en.Given;
import Pages.LoginPage;

public class MyStepdefs {
    LoginPage logpg;
    @Given("User landed on home page")
    public void userLandedOnHomePage() {
        System.out.println("User landed on the home page");
        logpg.launchUrl("https://www.google.com");
    }
}
