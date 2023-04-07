package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Day']")
    public WebElement dayButton;

    @FindBy(xpath = "//button[.='Week']")
    public WebElement weekButton;

    @FindBy(xpath = "//button[.='Month']")
    public WebElement monthButton;

    @FindBy(xpath = "//td[@class='fc-widget-content']")
    public WebElement timeBox;

    @FindBy(xpath = "//h4[.='Create']")
    public WebElement createPopUpTitle;

    @FindBy(xpath = "//label[.='Summary:']/following-sibling::input")
    public WebElement summaryInputBox;

    @FindBy(xpath = "//button[.='Create']")
    public WebElement createButton;

    @FindBy(xpath = "//button[.='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//button[.='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//li[.='Meetings (Week 14)']")
    public WebElement weekTitle;

    @FindBy(xpath = "//ol//li")
    public WebElement dayTitle;

    @FindBy(xpath = "//li[.='Meetings (April 2023)']")
    public WebElement monthTitle;


   // @FindBy(xpath = "//div[@class='fc-view-container']/div[1]/table/thead/tr/td/div/table/thead/tr/th[4]")
    //   //div[@class='fc-view-container']/div[1]/table/tbody/tr/td/div[2]/div/div[3]

    @FindBy(xpath = "//td[.='All day']/following-sibling::td[1]")
    public WebElement allSectionFirstDay;

    @FindBy(xpath = "//td[@class='fc-event-container']")
    public WebElement createdEvent;

    @FindBy(xpath = "//button[.='Delete']")
    public WebElement deleteButton;

      @FindBy(xpath = "//button[.='Ok']")
    public WebElement okButton;

      @FindBy(xpath = "//h4")
    public WebElement editPopUpTitle;

    @FindBy(xpath = "//button[.='Close']")
    public WebElement closePopup;

    @FindBy(xpath = "//input[@placeholder=\"e.g. Business Lunch\"]")
    public WebElement changeName;

    @FindBy(xpath = "(//button[.='Save'])[2]")
    public WebElement saveButton;


}
