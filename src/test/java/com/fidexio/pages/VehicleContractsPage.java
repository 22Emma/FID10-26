package com.fidexio.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleContractsPage extends BasePage{


    @FindBy (xpath = "//span[normalize-space(.)='Vehicles Contracts']")
    public WebElement VehicleContractsBtn;

    @FindBy (xpath = "(//li[normalize-space(.)='Vehicles Contracts'])[2]")
    public WebElement VehiclesContractsTitle;

    @FindBy (xpath = "//button[normalize-space(.)='Create']")
    public WebElement CreateBtn;

    @FindBy (xpath = "//div[normalize-space(.)='Contract details']")
    public WebElement ContractDetailsTitle;

    @FindBy (xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement VehicleDropDown;

    @FindBy (xpath = "(//a[normalize-space(.)='Bmw/520ES/01adana01'])[1]")
    public WebElement VehicleDropDown1stOption;

    @FindBy (xpath = "(//input[@class='o_field_float o_field_number o_field_widget o_input'])[1]")
    public WebElement ActivationCostInput;

    @FindBy (xpath = "//select[@class='o_input o_field_widget o_required_modifier oe_inline']")
    public WebElement RecurringCostAmountBtn;

    @FindBy (xpath = "//input[@class='o_field_float o_field_number o_field_widget o_input oe_inline']")
    public WebElement RecurringCostAmountInput;

    @FindBy (xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement ContractType;

    @FindBy (xpath = "//button[normalize-space(.)='Save']")
    public WebElement SaveBtn;

    @FindBy (xpath = "//div[@class='o_notification_title']")
    public WebElement InvalidFieldNoti;

    @FindBy (xpath = "//h4[@class='modal-title']")
    public WebElement CreateAVehicle;

    @FindBy (xpath = "(//div[@class='o_horizontal_separator'])[1]")
    public WebElement ContractDetails;

    @FindBy (xpath = "//button[normalize-space(.)='Edit']")
    public WebElement EditBtn;

    @FindBy (xpath = "//button[normalize-space(.)='Discard']")
    public WebElement DiscardBtn;
}
