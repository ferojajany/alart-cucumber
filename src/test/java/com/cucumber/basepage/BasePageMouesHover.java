package com.cucumber.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class BasePageMouesHover {
    WebDriver driver;

    public BasePageMouesHover(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//button[text()='Automation Tools']")
          WebElement mouseElement;
    @FindBy(xpath = "//div[@class='dropdown-content']//a")
            List<WebElement> MouseClickLocator;


 public void mouseHoverButton(){
     Actions action = new Actions(driver);
        action.moveToElement(mouseElement).perform();
    }
//

    public void listMouse(){

        for (WebElement listlist: MouseClickLocator){
            String listSize= listlist.getAttribute("text");
            if (listSize.equalsIgnoreCase("TestNG")){
                listlist.click();
                break;
            }
        }
    }
}
