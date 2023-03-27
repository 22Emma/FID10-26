package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.bouncycastle.pqc.crypto.ExchangePair;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostFunctionPage {

    public CostFunctionPage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//span[normalize-space(.)='Vehicle Costs']")
    public WebElement vehicleCost;

    @FindBy(xpath = "//div[@class='o_list_buttons']/button[1]")
    public WebElement createButton;

    @FindBy(xpath = "//div[@class='o_input_dropdown']/input[1]")
    public WebElement vehicleName;

    @FindBy(xpath ="(//div[@class='o_input_dropdown'])[4]//input[1]")
    public WebElement modelName;

    @FindBy(xpath = "(//div[@class='modal-footer'])[2]/button[1]")
    public WebElement createModelSaveButton;

    @FindBy(xpath = "(//li[@class='o_m2o_dropdown_option ui-menu-item'])[1]/a")
    public WebElement createButtonOnVehicle;

    @FindBy(xpath = "(//li[@class='o_m2o_dropdown_option ui-menu-item'])[3]/a")
    public WebElement createVehicleCreateButton;

    @FindBy(xpath = "//input[@id='o_field_input_226']")
    public WebElement licensePlate;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input']")
    public WebElement costDescription;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary'][1]")
    public WebElement createPopupButton;

    @FindBy(xpath = "(//div[@class='o_form_sheet'])[1]")
    public WebElement formSheet;
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[8]")
    public WebElement makeButton;

    @FindBy(xpath = "//li[@class='o_m2o_dropdown_option ui-menu-item']//a[.='Create and Edit...']")
    public WebElement modelCreateButton;

    @FindBy(xpath = "(//a[.='Create and Edit...'])[2]")
    public WebElement createAndEdit2;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement modelName2;


    @FindBy(xpath = "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'])[1]")
    public WebElement acababune;

}
