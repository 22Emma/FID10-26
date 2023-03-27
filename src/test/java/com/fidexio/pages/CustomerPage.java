package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
    public CustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//a[@data-menu='447']")
    public WebElement customersButton;

    @FindBy (xpath = "(//li[normalize-space(.)='Customers'])[4]")
    public  WebElement customerTitle;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy(xpath = "//button[@aria-label='kanban']")
    public WebElement kanbanButton;

    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listButton;

    @FindBy(xpath = "//h1/input[starts-with(@id,'o_field_input_')]")
    public WebElement nameInput;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement create2;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement contactPage;

    @FindBy(xpath = "(//td/input[starts-with(@id,'o_field_input_')])[8]")
    public WebElement contactName;

    @FindBy(xpath = "(//div//button//span)[45]")
    public WebElement saveCloseButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton2;

}
