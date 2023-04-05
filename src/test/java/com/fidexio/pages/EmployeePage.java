package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {

    public EmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//b[@class='caret']/..")
    public WebElement moreButton;

    @FindBy (xpath= "(//span[normalize-space()='Employees'])[1]")
    public WebElement EmployeeButton;

    @FindBy (xpath = "//li[.='Employees']")
    public WebElement EmployeesWriting;

    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement CreateButton;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement EmployeeNameBox;

    @FindBy (xpath = "//label[.='Name']")
    public WebElement nameWriting;

    @FindBy (xpath = "//button[normalize-space()='Import']")
    public WebElement ImportButton;

    @FindBy (xpath = "(//li[@class='active'])[2]")
    public WebElement ImportAFile_Writing;

    @FindBy (xpath = "//button[@class='fa fa-chevron-right btn btn-icon o_pager_next']")
    public WebElement goForwardButton;

    @FindBy (xpath = "//span[@class='o_pager_value']")
    public WebElement pageValue;

    @FindBy (xpath = "//button[@aria-label='Previous']")
    public WebElement goBackButton;

    @FindBy (xpath = "//button[@data-view-type='list']")
    public WebElement ListButton;

    @FindBy (xpath = "//th[.='Work Phone']")
    public WebElement WorkPhone;

    @FindBy (xpath = "//button[@data-view-type='kanban']")
    public WebElement KanbanButton;

    @FindBy (xpath = "(//div[@class='oe_kanban_global_click o_kanban_record'])[1]")
    public WebElement KanbanBox;

    @FindBy (xpath = "//input[@id='o_field_input_630']")
    public WebElement EmployeesName;

    @FindBy (xpath = "//button[@accesskey='s']")
    public WebElement SaveButton;

    @FindBy (xpath = "//button[@accesskey='a']")
    public WebElement EditButton;

    @FindBy (xpath = "//p[.='Employee created']")
    public WebElement EmployeeCreatedWriting;

    @FindBy (xpath = "//span[@title='Edit']")
    public WebElement penEdit;

    @FindBy (xpath = "//img[@class='img img-responsive']")
    public WebElement EmployeesPicture;

    @FindBy (xpath = "//span[@title='Clear']")
    public WebElement DeletePhoto;

    @FindBy (xpath = "//span[@name='name']")
    public WebElement CreatedEmployeesName;

    @FindBy (xpath = "//input[@placeholder='Search...']")
    public WebElement searchButton;

    @FindBy (xpath = "//div[@class='o_kanban_record_headings']")
    public WebElement ListedOfEmployeeName;

    @FindBy (xpath = "//span[@class='o_pager_value']")
    public WebElement getPageValue;

    @FindBy (xpath = "//img[@name='image']")
    public WebElement imgPhoto;

    @FindBy (xpath = "(//input[@class='o_input_file'])[2]")
    public WebElement downloadPicture;

    @FindBy (xpath = "//button[normalize-space()='Action']")
    public WebElement Action;

    @FindBy (xpath = "//a[normalize-space()='Delete']")
    public WebElement DeleteButton;

    @FindBy (xpath = "//span[.='Ok']")
    public WebElement OkButton;

}
