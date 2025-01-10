package com.cucumber.stepdafinition;

import com.cucumber.baseClass.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginpageDafinition {
    public WebDriver driver;
    public BasePage BestTest;
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
    driver= new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
    BestTest = new BasePage(driver);
    }
    @When("User enters username {string} and password as {string}")
    public void user_enters_username_and_password_as(String string, String string2) {
    BestTest.enteruser(string);
    BestTest.enterpassword(string2);
    BestTest.clickLogin();
    }
    @Then("User should be logged in successfuly")
    public void user_should_be_logged_in_successfuly() {
        WebElement actul = driver.findElement(By.xpath("//span[@class='title']"));
        String actulproduct = actul.getText();
        System.out.println(actulproduct);
        Assert.assertEquals(actulproduct,"Products","user is not successful");

    }
    @After
    public void teardown(){
        driver.quit();
    }
}
