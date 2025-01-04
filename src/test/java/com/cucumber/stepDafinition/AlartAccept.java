package com.cucumber.stepDafinition;

import com.cucumber.basepage.BasePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartAccept {
    WebDriver driver;
    BasePage baseTest;
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("User is on the alartbox")
    public void user_is_on_the_alartbox() {
        driver.get("https://demo.automationtesting.in/Alerts.html");
        baseTest = new BasePage(driver);

    }
    @When("User open Alert with OK & Cancel")
    public void user_open_alert_with_ok_cancel() {
        baseTest.alartclickbox();

    }
    @Then("click the button to display a confirm box")
    public void click_the_button_to_display_a_confirm_box() throws InterruptedException {
        baseTest.alartDisplayclick();
        Thread.sleep(2000);

    }
    @Then("User accept alartbox")
    public void user_accept_alartbox() {
       String print= baseTest.alartText();
        System.out.println(print);
        baseTest.alartAccept();

    }
}
