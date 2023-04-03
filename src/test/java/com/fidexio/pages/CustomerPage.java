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

    @FindBy (xpath = "//ol//li[@class='active']")
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


    @FindBy(xpath = "(//div[@class='oe_kanban_details'])[1]")
    public WebElement customer1;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editButton;

    @FindBy(xpath = "//span[@class='fa fa-pencil fa-lg pull-left o_select_file_button']")
    public WebElement editPencilOnPicture;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//div//span[@class='fa fa-trash-o fa-lg pull-right o_clear_file_button']")
    public WebElement clearButton;

    @FindBy (xpath = "//button[@class='btn btn-default btn-sm o_form_button_create']")
    public WebElement createButtonInsteadOfDiscard;

    @FindBy (xpath = "//h1//span[@class='o_field_char o_field_widget o_required_modifier']")
    public WebElement customerInfo;

    @FindBy (xpath = "(//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record'])[26]")
    public WebElement customerIsOnThePage;

    @FindBy (xpath = "//div[@class='o_thread_message_core o_mail_note']")
    public  WebElement contactCreated;
}
