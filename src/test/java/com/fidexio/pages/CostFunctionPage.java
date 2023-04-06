package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostFunctionPage {
    public CostFunctionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[21]/ul[1]/li[3]/a")
    public WebElement vehicleCostBtn;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement vehicleDropDown;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement typeBtn;

    @FindBy(xpath = "//a[.='Calculation Benefit In Kind']")
    public WebElement readyType;

    @FindBy(xpath = "//li[.='Vehicle Costs']")
    public WebElement vehicleCostInfoPage;

    @FindBy(xpath = "//h4[.='Create: Vehicle']")
    public WebElement createVehiclePopup;

    @FindBy(xpath = "//a[.='Search More...']")
    public WebElement searchMoreBtn;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchInputBox;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement searchCreateBtn;

    @FindBy(css = "button.btn.btn-primary.btn-sm.o_list_button_add")
    public WebElement createNewBtn;

    @FindBy(xpath = "//li[.='Create and Edit...']")
    public WebElement createBtn;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement vehicle_input_box;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement vehicle_type;

    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    public WebElement save_button;

    @FindBy(css = ".o_notification.undefined.o_error")
    public WebElement warningMsg;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement edit_button;

    @FindBy(xpath = "//div[.='Cost Details']")
    public WebElement costDetailsEditPage;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discard_button;

    @FindBy(xpath = "//input[@class='o_field_float o_field_number o_field_widget o_input']")
    public WebElement total_price;

    @FindBy(id = "o_field_input_46")
    public WebElement cost_description_input;

    @FindBy(xpath = "//div[@class='modal-footer']/button[1]")
    public WebElement create_button2;

    @FindBy(css = ".btn.btn-primary.btn-sm.o_form_button_edit")
    public WebElement create_and_edit_button;
    @FindBy(xpath = "(//a[.='Bmw/520ES/01adana01'])[1]")
    public WebElement selectFromDropDown;

    @FindBy(xpath = "//button[normalize-space()='Create']")
    public WebElement create2Buttonn;

    @FindBy(xpath = "//span[@name='amount']")
    public WebElement totalPriceInput;



}
