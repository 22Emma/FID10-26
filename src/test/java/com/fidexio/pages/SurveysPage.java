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
    @FindBy(xpath = "/html/head/title")
    public WebElement TitleName;

    @FindBy(xpath="//button[@accesskey='c']")
    public WebElement CreateBtn;
    @FindBy(xpath="//button[@class='btn btn-sm btn-default o_button_import']")
    public  WebElement ImportBtn;

    @FindBy(xpath = "//input[@placeholder='Survey Title']")
    public WebElement SurveyTitle;
    @FindBy(xpath="//button[@accesskey='s']")
    public WebElement SaveBtn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div")
    public WebElement SrvyCreated;

}