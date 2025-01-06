package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FacebookPage extends BasePage {
    public FacebookPage(WebDriver driver) {
        super(driver);
    }
   @FindBy
    private WebElement phoneNumberInput;
   // private final By phoneNumberLocator= By.xpath("//input[@name='email']");
    private final By passwordLocator = By.xpath("//input[@name='pass']");
    private final  By loginLocator = By.xpath("//button[@name='login']");

    public  void enterPhonebook(String phoneNumber){
        //WebElement phoneNumberInput = driver.findElement(phoneNumberLocator);
        sendkeys(phoneNumberInput,phoneNumber);
    }

    public void enterPassword(String password){
        WebElement enterPassword = driver.findElement(passwordLocator);
        sendkeys(enterPassword,password);
    }

    public  void clickButton(){
        WebElement clickon = driver.findElement(loginLocator);
    }
}
