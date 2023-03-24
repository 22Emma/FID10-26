package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
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

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/div[1]/table[1]/tbody/tr[1]/td")
    public WebElement vehicleDetail;

    @FindBy(xpath = "//a[.='Search More...']")
    public WebElement seachMore;

    @FindBy(xpath = "//h4[normalize-space()='Create a Vehicle']")
    public WebElement createVehiclePopup;



}
