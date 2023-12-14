package com.test.automationexercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

public class SignUpPage {

    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//b[contains(text(),'Enter Account')]")
    WebElement signUpHeader;
    @FindBy(css = "#id_gender1")
    WebElement mr;
    @FindBy(css = "#id_gender2")
    WebElement mrs;
    @FindBy(css = "#password")
    WebElement password;
    @FindBy(css = "#days")
    WebElement days;
    @FindBy(css = "#months")
    WebElement months;
    @FindBy(css = "#years")
    WebElement years;
    @FindBy(css = "#newsletter")
    WebElement newsLetter;
    @FindBy(css = "#optin")
    WebElement specialOffer;

    public void provideAccountInformation(String expectedHeader, String expectedGender
    ,String password,String days,String months,String years) {
        Assert.assertEquals(BrowserUtils.getText(signUpHeader), expectedHeader);
        if (mr.getAttribute("value").equalsIgnoreCase(expectedGender)) {
            mr.click();
        } else if (mrs.getAttribute("value").equalsIgnoreCase(expectedHeader)) {
            mrs.click();
        } else {
            Assert.fail("Please provide a gender");
        }
        this.password.sendKeys(password);
        BrowserUtils.selectBy(this.days,days,"value");
        BrowserUtils.selectBy(this.months,months,"text");
        BrowserUtils.selectBy(this.years,years,"value");
        Assert.assertTrue(newsLetter.isDisplayed());
        Assert.assertFalse(newsLetter.isSelected());
        newsLetter.click();
        Assert.assertTrue(newsLetter.isSelected());
        Assert.assertTrue(specialOffer.isDisplayed());
        Assert.assertFalse(specialOffer.isSelected());
        specialOffer.click();
        Assert.assertTrue(specialOffer.isSelected());
        }

    }
