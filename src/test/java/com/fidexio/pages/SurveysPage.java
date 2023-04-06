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
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement ClickCreateBtn;

    @FindBy(xpath = "//span[@name='title']")
    public WebElement FirstSurvey;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[1]/button[2]")
    public WebElement DisplayCreateBtn;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    public WebElement AttachmentsBtnDisplayed;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]  ")
    public WebElement ActionBtnIsDisplayed;

    @FindBy(xpath = "//button[@class= 'btn btn-sm btn-default'][1]")
    public WebElement TestSurveyDisplayed;

    @FindBy(xpath = "//button[@class= 'btn btn-sm btn-default'][2]")
    public WebElement PrintSurveyBtn;

    @FindBy(xpath = "//button[@class= 'btn btn-sm btn-default oe_highlight'][2]")
    public WebElement ShareAndInviteByEmailBtn;

    @FindBy(xpath = "//button[@class= 'btn btn-sm btn-default'][3]")
    public WebElement ViewResultBtn;

    @FindBy(id = "add-item")
    public WebElement AddAnItem;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div/p")
    public WebElement Message;

    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement accessList;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr/th[2]")
    public WebElement TitleList;

}