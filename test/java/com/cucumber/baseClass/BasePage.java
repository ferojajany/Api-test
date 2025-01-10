package com.cucumber.baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    private final By userLocator = By.id("user-name");
    private final By passwordLocator= By.id("password");
    private final By loginLocator=By.id("login-button");


    public void enteruser(String input){
        WebElement userelement = driver.findElement(userLocator);
        userelement.sendKeys(input);
    }
    public void enterpassword(String input){
        WebElement passwordelement=driver.findElement(passwordLocator);
        passwordelement.sendKeys(input);
    }
   public void clickLogin(){
        WebElement loginelement= driver.findElement(loginLocator);
        loginelement.click();
   }
}
