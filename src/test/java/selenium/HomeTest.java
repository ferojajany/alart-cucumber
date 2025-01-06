package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest {
    WebDriver driver;

    @BeforeMethod

    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }

}

