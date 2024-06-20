package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebInputsPage extends PageObject {
    @FindBy(id = "username")
    WebElement practiceUserInput;

    @FindBy(id = "password")
    WebElement practicePwdInput;

    @FindBy(xpath = "//a[text()='Home']")
    WebElement practiceUserIcon;

    @FindBy(xpath = "//input[@id='search-input']")

    WebElement searchBox;

    @FindBy(xpath = "//a[@href='/inputs']")

    WebElement inputTile;

    @FindBy(xpath = "//button[@id='btn-display-inputs']")
    WebElement displayInput;

    @FindBy(id="input-number")
    WebElement inputNmuber;
    @FindBy(id="input-text")
    WebElement inputText;
    @FindBy(id="input-password")
    WebElement inputPassword;

    @FindBy(xpath= "//strong[@id='output-number']")
    WebElement outPutNumber;

    public void launchSFurl(String url) {

        getDriver().get(url);
    }

    public void enterCredentials(String username, String pwd) {
        //  By loginbutton=By.id("Login"); ---- 1st type
        //  WebElement sfLoginbtn=find(By.id("Login")); ---- 2nd type
        WebElement saleforLogin = getDriver().findElement(By.xpath("//button[text()='Login']")); // 3rd type
        practiceUserInput.sendKeys(username);
        practicePwdInput.sendKeys(pwd);
        saleforLogin.click();
    }
    public void isOnHomePage() throws Exception {
        Thread.sleep(10000);
        try {
            practiceUserIcon.click();
            System.out.println("User is on Home page");
            Thread.sleep(10000);
        } catch (Exception e) {
            throw new Exception("Unable to login");
        }

    }


        public void homePage() {
        try {
            Thread.sleep(15000);
            searchBox.click();
            System.out.println("User clicked search box");

        } catch (Exception e) {
            System.out.println("User is not on home page");
        }
    }

    public void clickInputTile() {
        inputTile.click();
        System.out.println("User clicked the WebInputs Tile");
    }

    public void onInputsPage() {
        displayInput.getText();
        System.out.println("User redirected to WebInputs page");
    }

    public void numberField(){
        inputNmuber.isEnabled();
        System.out.println("Input Text is active");

    }
public void numberInput(String number){
        inputNmuber.sendKeys(number);
}
   public void clickDisplayInput(){
        displayInput.click();
       System.out.println("User should able to click the Display Input button");

   }
   public void showOutputNumber(){
        if(outPutNumber.getText().equals(inputNmuber)){
            System.out.println("Both Input and Output Number are matching");
        }
        else{
            System.out.println("Input and Output number is not matching");
        }
   }

    public void fillNumber(String number) {
inputNmuber.sendKeys(number);
    }

    public void fillText(String text) {
        inputText.sendKeys(text);
    }

    public void fillPassword(String password) {
        inputPassword.sendKeys(password);
    }
}


