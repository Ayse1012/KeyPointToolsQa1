package com.toolsAndSauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InteractionsPage extends BasePage{

    @FindBy(css = "#draggable")
    public WebElement drag;
    @FindBy(xpath = "(//div[@id='droppable'])[1]")
    public WebElement drop;
    @FindBy(xpath = "//p[text()='Dropped!']")
    public WebElement droppedText;

}
