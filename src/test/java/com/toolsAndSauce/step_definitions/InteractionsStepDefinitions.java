package com.toolsAndSauce.step_definitions;

import com.toolsAndSauce.pages.InteractionsPage;
import com.toolsAndSauce.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class InteractionsStepDefinitions {

    InteractionsPage interactionsPage=new InteractionsPage();
    Actions actions=new Actions(Driver.get());

    @When("The user keeps dragging and dropping")
    public void the_user_keeps_dragging_and_dropping() {
     actions.dragAndDrop(interactionsPage.drag,interactionsPage.drop).perform();

    }

    @Then("The user verify the {string}")
    public void the_user_verify_the(String expectedText) {
        Assert.assertEquals(expectedText,interactionsPage.droppedText.getText());

    }
}
