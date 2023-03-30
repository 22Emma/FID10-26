package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveysPage {
    public SurveysPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "login")
    public WebElement username66;

    @FindBy(id = "password")
    public WebElement password66;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginBtn;


    @FindBy(xpath = "//span[.='POSManager66']")
    public WebElement PosManager66Page;

}