package Pages;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {
    public void launchUrl(String URL){
       getDriver().get(URL);
    //OpenUrl(URL);
        System.out.println("Launching the Url");
    }



}
