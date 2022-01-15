package com.toolsAndSauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WidgetsPage extends BasePage{

    @FindBy(css = "#toolTipButton")
    public WebElement hoverMeButton;

    @FindBy(css = "#buttonToolTip")
    public WebElement hoverMeMassage;

    @FindBy(css = "#toolTipTextField")
    public WebElement hoverMeText;

    @FindBy(css = ".fade.show.tooltip.bs-tooltip-bottom")
    public WebElement hoverMeTextMessage;






}
