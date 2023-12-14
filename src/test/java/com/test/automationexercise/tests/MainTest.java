package com.test.automationexercise.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends TestBase{

    @Test
    public void validateHomePage(){
        Assert.assertEquals(driver.getTitle(),"Automation Exercise");
    }
}
