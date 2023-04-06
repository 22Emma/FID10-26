package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesFuelLogs_Pages {

    public VehiclesFuelLogs_Pages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement moreButton;
    @FindBy(xpath = "//span[normalize-space()='Fleet']")
    public WebElement fleetButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li")
    public WebElement vehiclesPage;
    @FindBy(xpath = "//span[normalize-space(.)='Vehicles Fuel Logs']")
    public WebElement vehicleFuelLogs;
    @FindBy(xpath = "//button[normalize-space()='Create']")
    public WebElement createButton;
    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement vehicleBox;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton;
    @FindBy(xpath = "//div[.='Vehicle Details']")
    public WebElement vehicleDetail;
    @FindBy(xpath = "//a[.='Search More...']")
    public WebElement seachMore;
    @FindBy(xpath = "//h4[normalize-space()='Create a Vehicle']")
    public WebElement createVehiclePopup;
    @FindBy(xpath = "//a[@class='o_form_uri o_field_widget o_required_modifier']")
    public WebElement whichUser;
   @FindBy(xpath = "//button[normalize-space()='Edit']")
    public WebElement editButton;
   @FindBy(xpath = "//button[normalize-space()='Discard']")
    public WebElement discardButton;
   @FindBy(xpath = "//div[@class='o_form_view o_form_editable']")
    public WebElement informationPage;
   @FindBy(xpath = "//li[.='New']")
    public WebElement vehiclesFuelLogsNew;
   @FindBy(xpath = "//a[.='Bmw/520ES/01adana01']")
    public WebElement bmwCreateVerify;
   @FindBy(xpath = "//td[.='01adana01']")
    public WebElement selectBmwVehicle;
   @FindBy(xpath = "//a[.='Create and Edit...']")
    public WebElement createAndEditButton;
   @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[4]")
    public WebElement modelDropDownBox;
   @FindBy(xpath = "//a[.='Acura/1234']")
    public WebElement selectAcuraModel;
   @FindBy(xpath = "//input[@name='license_plate']")
    public WebElement licencePlateBox;
   @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement newSaveButton;
   @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement actionButton;
   @FindBy(xpath = "//a[@data-index='0']")
    public WebElement deleteButton;
   @FindBy(xpath = "//input[@name='odometer']")
    public WebElement odometerValueBox;
   @FindBy(xpath = "//span[.='Create']")
    public WebElement createModel;
   @FindBy(xpath = "//span[.='1,234.00']")
    public WebElement odometerValueVerify;
   @FindBy(xpath = "//a[.='Nissan/Micra/64ee124']")
    public WebElement nissanMicraVerify;
   @FindBy(xpath = "//div[@class='o_notification_content']")
    public WebElement theFollowingFieldsAreInvalid;
   @FindBy(xpath = "//span[.='Ok']")
    public WebElement deleteOkButton;
}
