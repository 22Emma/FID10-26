package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.CustomerPage;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Customer_StepDefinitions extends BasePage {

 CustomerPage customerPage =new CustomerPage();



    @Given("user is on the fidexio home page and clicks to the sales option.")
    public void user_is_on_the_fidexio_home_page_and_clicks_to_the_sales_option() {
          sectionSales.click();

    }

    @Given("user clicks to customers from order section and land on the customer page.")
    public void user_clicks_to_customers_from_order_section_and_land_on_the_customer_page() {
       BrowserUtils.sleep(5);
     customerPage.customersButton.click();
     BrowserUtils.sleep(5);
        Assert.assertTrue(customerPage.customerTitle.getText().equalsIgnoreCase("Customers"));
    }

    @Then("user clicks to create button.")
    public void user_clicks_to_create_button() {
     customerPage.createButton.click();
    }

    @Then("user enters the name into the input box and clicks the create button.")
    public void user_enters_the_name_into_the_input_box_and_clicks_the_create_button() {
       BrowserUtils.sleep(3);
    customerPage.nameInput.sendKeys("Aabbuuw");
    BrowserUtils.sleep(3);
    customerPage.create2.click();
    BrowserUtils.sleep(3);

    }

    @Then("create contacts should be display.")
    public void create_contacts_should_be_display() {
      customerPage.contactPage.isDisplayed();
    }

    @Then("user enters the contact name into the contact name box.")
    public void user_enters_the_contact_name_into_the_contact_name_box() {
       BrowserUtils.sleep(3);
       customerPage.contactName.sendKeys("Aaaa");
       BrowserUtils.sleep(3);
    }

    @Then("user clicks to the save&close button on the pop up")
    public void user_clicks_to_the_save_close_button_on_the_pop_up() {
       BrowserUtils.sleep(2);
       customerPage.saveCloseButton.click();

    }

    @Then("user clicks the save button on the top left side.")
    public void user_clicks_the_save_button_on_the_top_left_side() {
       BrowserUtils.sleep(3);
       customerPage.saveButton2.click();

    }

    @Then("{string} message appears under full profile and customer's name is displayed on the page title.")
    public void message_appears_under_full_profile_and_customer_s_name_is_displayed_on_the_page_title(String string) {
       BrowserUtils.sleep(3);
       customerPage.contactCreated.isDisplayed();
    }


    @Then("user sees the created customer on the list.")
    public void userSeesTheCreatedCustomerOnTheList() {
       customerPage.customerIsOnThePage.isDisplayed();
    }

    @Then("information of the customer is displayed.")
    public void informationOfTheCustomerIsDisplayed() {
       BrowserUtils.sleep(3);
       customerPage.customerInfo.isDisplayed();
    }

    @And("create button is displayed instead of discard button.")
    public void createButtonIsDisplayedInsteadOfDiscardButton() {
       BrowserUtils.sleep(3);
        customerPage.createButtonInsteadOfDiscard.isDisplayed();
    }

    @Then("edit button is displayed instead of save button")
    public void editButtonIsDisplayedInsteadOfSaveButton() {
       BrowserUtils.sleep(3);
       customerPage.editButton.isDisplayed();
    }

    @Then("user hover overs on the profile picture and clicks to bin icon.")
    public void userHoverOversOnTheProfilePictureAndClicksToBinIcon() {
        BrowserUtils.sleep(5);
        customerPage.clearButton.click();
    }

    @And("user uploads a profile picture.")
    public void userUploadsAProfilePicture()  {

       customerPage.editPencilOnPicture.click();

       String filePath = "C:\\Users\\nilyc\\OneDrive\\Desktop\\resim1.png";

       WebElement upload = Driver.getDriver().findElement(By.xpath("(//input[@name='ufile'])[2]"));

       upload.sendKeys(filePath);

       BrowserUtils.sleep(3);


    }


    @Then("user clicks to edit button.")
    public void userClicksToEditButton() {
        BrowserUtils.sleep(3);
    customerPage.editButton.click();
    }

    @And("user selects one of the customer from the customer page and clicks to it.")
    public void userSelectsOneOfTheCustomerFromTheCustomerPageAndClicksToIt() {

       customerPage.customer1.click();
    }

    @Then("create,import,kanban and list buttons are displayed and user is able click to them.")
    public void createImportKanbanAndListButtonsAreDisplayedAndUserIsAbleClickToThem() {
       BrowserUtils.sleep(3);
       customerPage.createButton.click();
       Driver.getDriver().navigate().back();
       BrowserUtils.sleep(3);
       customerPage.importButton.click();
       Driver.getDriver().navigate().back();
       BrowserUtils.sleep(3);
       customerPage.kanbanButton.click();
       Driver.getDriver().navigate().back();
       BrowserUtils.sleep(3);
       customerPage.listButton.click();
       Driver.getDriver().navigate().back();

       customerPage.createButton.isDisplayed();
       customerPage.importButton.isDisplayed();
       customerPage.kanbanButton.isDisplayed();
       customerPage.listButton.isDisplayed();

    }

    @And("user hover overs on the profile picture and clicks to pencil or edit icon.")
    public void userHoverOversOnTheProfilePictureAndClicksToPencilEditIcon() {
       customerPage.editPencilOnPicture.click();
    }

    @Then("user clicks to  save button for uploaded picture .")
    public void userClicksToSaveButtonForUploadedPicture() {
       //BrowserUtils.sleep(3);
        //customerPage.saveButton.click();
    }
}
