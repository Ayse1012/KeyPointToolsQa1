package com.toolsAndSauce.pages;

import com.toolsAndSauce.utilities.BrowserUtils;
import com.toolsAndSauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(xpath = "//h5[text()='Elements']")
    public WebElement baseMenu;

    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement elementsMenu;

    public void navigateBaseMenu(String menu) {
        WebElement element = Driver.get().findElement(By.xpath("//h5[text()='" + menu + "']"));
        BrowserUtils.clickWithJS(element);

    }
    public void navigateMenuElements(String menu){
        WebElement element= Driver.get().findElement(By.xpath("//span[text()='"+menu+"']"));
        BrowserUtils.clickWithJS(element);

    }




}
