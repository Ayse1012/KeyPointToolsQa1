package com.toolsAndSauce.step_definitions;


import com.toolsAndSauce.pages.LoginPage;
import com.toolsAndSauce.utilities.BrowserUtils;
import com.toolsAndSauce.utilities.ConfigurationReader;
import com.toolsAndSauce.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefns {
    LoginPage loginPage=new LoginPage();
    @Given("The user goes to login page")
    public void the_user_goes_to_login_page() {
        Driver.get().get(ConfigurationReader.get("url_sauce"));

    }

    @When("The user enters {string}")
    public void the_user_enter(String userName) {


    }
    @And("The user contains url {string}")
    public void theUserContainsUrl(String expectedText) {
        String actualText=Driver.get().getCurrentUrl();
        Assert.assertTrue(actualText.contains(expectedText));
        BrowserUtils.waitFor(2);
    }

    @When("The user enters username {string}")
    public void theUserEnterUsername(String userName) {
        loginPage.userInput.sendKeys(userName);
    }

    @Then("The user enters password {string}")
    public void theUserEnterPassword(String password) {
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();
    }

    @When("The user enters username {string} and password {string}")
    public void theUserEnterUsernameAndPassword(String username, String password) {
        loginPage.setLogin(username,password);
    }

    @Then("The user confirms {string}")
    public void theUserConfirms(String expectedText) {
        String actualText=loginPage.epicSadFace.getText();
        System.out.println("actualText = " + actualText);
        Assert.assertTrue(actualText.contains(expectedText));
    }
}
