package com.cucumber.basepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    By alartOkLocator=By.xpath("//a[text()='Alert with OK & Cancel ']");
    By alartDisplayLocator=By.xpath("//button[@onclick='confirmbox()']");

    public void alartclickbox(){
        WebElement alartboxLocator = driver.findElement(alartOkLocator);
        alartboxLocator.click();
    }
    public void alartDisplayclick(){
        WebElement displayelement= driver.findElement(alartDisplayLocator);
        displayelement.click();
    }
    public String alartText(){
        String text= driver.switchTo().alert().getText();
        return text;
    }
    public void alartAccept(){
        driver.switchTo().alert().accept();
    }
}
