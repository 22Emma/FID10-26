package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesServiceLogPage extends BasePage{

    public VehiclesServiceLogPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="(//span[@class='oe_menu_text'])[121]")  // //span[normalize-space(.)='Vehicles Services Logs']
    public WebElement vehiclesServiceLogsButton;


    @FindBy(xpath ="//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;


    @FindBy (xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement vehicleDropdown;

    @FindBy (xpath = "(//a[normalize-space(.)='Bmw/520ES/01adana01'])[1]")
    public WebElement vehicleDropdownOption1;

    @FindBy (xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement serviceTypeDropdown;

    @FindBy (xpath = "(//input[@class='o_field_float o_field_number o_field_widget o_input'])[1]")
    public WebElement totalPriceBox;

    @FindBy (xpath = "//div[@class='o_notification_title']")
    public WebElement invalidFieldNotification;

    @FindBy (xpath = "//h4[normalize-space(.)='Create a Vehicle']")
    public WebElement createAVehiclePopup;

    @FindBy (xpath = "//span[normalize-space(.)='Create']")
    public WebElement createButtonInPopUp;

    @FindBy (xpath = "//h4[@class='modal-title']")
    public WebElement bigCreateVehiclePopUp;

    @FindBy(xpath = "(//div[@class='o_horizontal_separator'])[1]")
    public WebElement serviceDetails;

    @FindBy (xpath = "(//input[@class='o_input ui-autocomplete-input'])[3]")
    public WebElement purchaserDetails;

    @FindBy (xpath = "//a[normalize-space(.)='2700 Des Plaines RD, Des Plaines IL']")
    public WebElement purchaserDetails1;

    @FindBy (xpath = "//input[@class='o_field_char o_field_widget o_input']")
    public WebElement invoiceReference;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editButton;

    @FindBy(xpath = "(//span[@class='o_field_float o_field_number o_field_widget'])[1]")
    public WebElement totalpriceInServiceLogs;






}
