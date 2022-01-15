package com.toolsAndSauce.pages;

import com.toolsAndSauce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "#user-name")
    public WebElement userInput;

    @FindBy(css ="#password" )
    public WebElement passwordInput;

    @FindBy(css = "#login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement epicSadFace;

    public void setLogin(String user,String password){

        userInput.sendKeys(user);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}
