package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
       this.driver = driver;
    }

    public void sendkeys(WebElement element , String input){
        element.sendKeys(input);
    }
    public void clicck(WebElement element){
        element.click();
    }
}
