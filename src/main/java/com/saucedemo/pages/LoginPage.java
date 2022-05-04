package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {


   // By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By usernameField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@id='login-button']");
    By errorMessage = By.xpath("");


//    public String getWelcomeText(){
//        return getTextFromElement(welcomeText);
//    }

    public void enterusername(String username){
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
