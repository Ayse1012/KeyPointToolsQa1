package com.toolsAndSauce.step_definitions;

import com.toolsAndSauce.pages.WidgetsPage;
import com.toolsAndSauce.utilities.BrowserUtils;
import com.toolsAndSauce.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class WidgetsStepDefinitions {

    WidgetsPage widgetsPage=new WidgetsPage();

    Actions actions=new Actions(Driver.get());


    @And("user hovers over the Hover me to see button and verify message {string}")
    public void userHoversOverTheHoverMeToSeeButtonAndVerifyMessage(String expectedText) {
        actions.moveToElement(widgetsPage.hoverMeButton).perform();
        BrowserUtils.waitFor(3);
        String actualMessage=widgetsPage.hoverMeMassage.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals(expectedText,actualMessage);
    }

    @Then("user hovers over the Hover me to see text field and verify message {string}")
    public void userHoversOverTheHoverMeToSeeTextFieldAndVerifyMessage(String expectedText) {
        actions.moveToElement(widgetsPage.hoverMeText).perform();
        BrowserUtils.waitFor(3);
        String actualMessage=widgetsPage.hoverMeTextMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals(expectedText,actualMessage);
    }
}
