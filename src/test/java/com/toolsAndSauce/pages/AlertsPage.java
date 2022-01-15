package com.toolsAndSauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage{
    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alerts;
    @FindBy(css = "#timerAlertButton")
    public WebElement timerAlertButton;
    @FindBy(xpath = "//Button[@id='alertButton']")
    public WebElement alertButton;
    @FindBy(xpath = "//Button[@id='confirmButton']")
    public WebElement confirmButton;
    @FindBy(css = "#promtButton")
    public WebElement promtButton;
    @FindBy(css = "#promptResult")
    public WebElement prompResult;



}
