package com.toolsAndSauce.step_definitions;

import com.toolsAndSauce.pages.AlertsPage;
import com.toolsAndSauce.utilities.BrowserUtils;
import com.toolsAndSauce.utilities.ConfigurationReader;
import com.toolsAndSauce.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class AlertStepDefinitions {
    AlertsPage alertsPage=new AlertsPage();
    Alert alert;
    @Given("The user goes to tools home page")
    public void the_user_goes_to_tools_home_page() {
        Driver.get().get(ConfigurationReader.get("url_toolsQa"));
        BrowserUtils.waitFor(2);

    }

    @Given("The user navigate to {string}")
    public void the_user_navigate_to(String menu) {
        alertsPage.navigateBaseMenu(menu);

    }

    @Given("The user click to {string}")
    public void the_user_click_to(String menu) {
        BrowserUtils.waitFor(2);
        alertsPage.navigateMenuElements(menu);

    }

    @When("The user sees warning button and passes")
    public void the_user_sees_warning_button_and_passes() {
        BrowserUtils.clickWithJS(alertsPage.alertButton);
        BrowserUtils.waitFor(4) ;
        alert= Driver.get().switchTo().alert();
        BrowserUtils.waitFor(1);
        alert.accept();

    }

    @And("The user waits five seconds and passes")
    public void theUserWaitsFiveSecondsAndPasses() {
        alertsPage.timerAlertButton.click();
        BrowserUtils.waitFor(5);
        alert.accept();

    }

    @When("The user sees verifies {string} and passes")
    public void the_user_sees_verifies_and_passes(String expectedText) {
        alertsPage.confirmButton.click();
        String actualText=alert.getText();
        alert.dismiss();
        Assert.assertEquals(expectedText,actualText);

    }

    @Then("The user enter {string} and verify {string}")
    public void the_user_enter_and_verify(String name, String expectedText) {
        alertsPage.promtButton.click();
        alert.sendKeys(name);
        alert.accept();
        String actualText=alertsPage.prompResult.getText();
        Assert.assertEquals(expectedText,actualText);
    }



}
