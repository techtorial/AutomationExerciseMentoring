package com.test.automationexercise.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverHelper;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= DriverHelper.getDriver();
        driver.navigate().to("https://automationexercise.com");
    }

    @AfterMethod
    public void tearDown(){
//        driver.quit();
    }
}
