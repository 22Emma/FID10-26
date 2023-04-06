package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[normalize-space(.)='Discuss']")
    public WebElement sectionDiscuss;

    @FindBy(xpath = "//span[normalize-space(.)='Calendar']")
    public WebElement sectionCalender;

    @FindBy(xpath = "//span[normalize-space(.)='Notes']")
    public WebElement sectionNotes;

    @FindBy(xpath = "(//span[normalize-space(.)='Contacts'])[1]")
    public WebElement sectionContacts;

    @FindBy(xpath = "//span[normalize-space(.)='CRM']")
    public WebElement sectionCRM;

    @FindBy(xpath = "//span[normalize-space(.)='Sales']")
    public WebElement sectionSales;

    @FindBy(xpath = "//span[normalize-space(.)='Website']")
    public WebElement sectionWebSite;

    @FindBy(xpath = "(//span[normalize-space(.)='Point of Sale'])[1]")
    public WebElement sectionPointOfSale;

    @FindBy(xpath = "//span[normalize-space(.)='Purchases']")
    public WebElement sectionPurchases;

    @FindBy(xpath = "//span[normalize-space(.)='Inventory']")
    public WebElement sectionInventory;

    @FindBy(xpath = "//span[normalize-space(.)='Manufacturing']")
    public WebElement sectionManufacturing;

    @FindBy(xpath = "//span[normalize-space(.)='Repairs']")
    public WebElement sectionRepairs;

    @FindBy(xpath = "//span[normalize-space(.)='Project']")
    public WebElement sectionProject;

    @FindBy(xpath = "(//span[normalize-space(.)='Events'])[1]")
    public WebElement sectionEvents;

    @FindBy(xpath = "(//span[normalize-space(.)='Surveys'])[1]")
    public WebElement sectionSurveys;

    @FindBy(xpath = "(//span[normalize-space(.)='Attendances'])[1]")
    public WebElement sectionAttendances;

    @FindBy(xpath = "(//span[normalize-space(.)='Employees'])[1]")
    public WebElement sectionEmployees;

    @FindBy(xpath = "(//span[normalize-space(.)='Leaves'])[1]")
    public WebElement sectionLeaves;



    @FindBy(xpath = "(//span[normalize-space(.)='Events'])[1]")
    public WebElement MoreEvents;


    @FindBy(xpath = "(//span[normalize-space(.)='Surveys'])[1]")
    public WebElement MoreSurveys;

    @FindBy(xpath = "(//span[normalize-space(.)='Employees'])[1]")
    public WebElement MoreEmployees;


    @FindBy(xpath = "(//span[normalize-space(.)='Attendances'])[1]")
    public WebElement MoreAttendances;

    @FindBy(xpath = "(//span[normalize-space(.)='Leaves'])[1]")
    public WebElement MoreLeaves;


    @FindBy(xpath = "//span[normalize-space(.)='Expenses']")
    public WebElement MoreExpenses;


    @FindBy(xpath = "//span[normalize-space(.)='Maintenance']")
    public WebElement MoreMaintenance;


    @FindBy(xpath = "//span[normalize-space(.)='Fleet']")
    public WebElement MoreFleet;


    @FindBy(xpath = "//span[normalize-space(.)='Dashboards']")
    public WebElement MoreDashboard;


    @FindBy(xpath = "//a[.='More ']")
    public WebElement sectionMore;
}
