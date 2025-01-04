package com.cucumber.stepDafinition;

import com.cucumber.basepage.BasePageMouesHover;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHoverDafinition {
    WebDriver driver;
    BasePageMouesHover mouseTest;
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mouseTest=new BasePageMouesHover(driver);
    }
    @Given("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);

    }
    @When("User use action mathod for mouse hover")
    public void user_use_action_mothed_for_mouse_hover() throws InterruptedException {
        mouseTest.mouseHoverButton();
        Thread.sleep(2000);


    }
    @Then("User go through and click")
    public void user_go_through_and_click() {
       mouseTest.listMouse();
    }
}
