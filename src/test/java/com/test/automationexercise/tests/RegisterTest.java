package com.test.automationexercise.tests;

import com.test.automationexercise.pages.LoginPage;
import com.test.automationexercise.pages.MainPage;
import com.test.automationexercise.pages.SignUpPage;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase{

    @Test
    public void validateRegisterUserFunctionality(){
        MainPage mainPage=new MainPage(driver);
        mainPage.clickSignUpLoginButton();
        LoginPage loginPage=new LoginPage(driver);
        loginPage.newUserSignUp("New User Signup!","Ahmet","ahmet63@gmail.com");
        SignUpPage signUpPage=new SignUpPage(driver);
        signUpPage.provideAccountInformation("ENTER ACCOUNT INFORMATION"
        ,"Mr","Ahmet1234","13","August","1991");




    }
}
