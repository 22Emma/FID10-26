package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexioPage {

    public FidexioPage(){
        PageFactory.initElements(Driver.getDriver(),this);
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




}
