package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveysPage {
    public SurveysPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[.='POSManager66']")
    public WebElement PosManager66Page;

    @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement CreateBtn;
    @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[2]")
    public  WebElement ImportBtn;

}