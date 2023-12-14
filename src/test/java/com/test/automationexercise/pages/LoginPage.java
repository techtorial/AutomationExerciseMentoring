package com.test.automationexercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h2[.='New User Signup!']")
    WebElement signUpHeader;
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement signUpUsername;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement signUpEmail;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signUpButton;

    public void newUserSignUp(String expectedHeader,String signUpUsername,String signUpEmail){
        Assert.assertEquals(BrowserUtils.getText(signUpHeader),expectedHeader);
        this.signUpUsername.sendKeys(signUpUsername);
        this.signUpEmail.sendKeys(signUpEmail);
        signUpButton.click();
    }




}
