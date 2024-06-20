package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class salesForceLoginPage extends PageObject {
    @FindBy(id = "username")
    WebElement sfUserInput;

    @FindBy(id = "password")
    WebElement sfPwdInput;

    //@FindBy(xpath = "//img[@title='User']")
    @FindBy(xpath = "//a[text()='Home']")
    WebElement userIcon;

    public void launchSFurl(String url) {

        getDriver().get(url);
    }

    public void enterCredentials(String username, String pwd) {
        //  By loginbutton=By.id("Login"); ---- 1st type
        //  WebElement sfLoginbtn=find(By.id("Login")); ---- 2nd type
        WebElement saleforLogin = getDriver().findElement(By.xpath("//button[text()='Login']")); // 3rd type
        sfUserInput.sendKeys(username);
        sfPwdInput.sendKeys(pwd);
        saleforLogin.click();
    }

    public void isOnHomePage() throws Exception {
        Thread.sleep(30000);
        try {
            userIcon.click();

        } catch (Exception e) {
            throw new Exception("Unable to login");
        }

    }
}
