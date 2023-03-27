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






}
