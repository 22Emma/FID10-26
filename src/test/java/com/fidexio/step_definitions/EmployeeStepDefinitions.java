package com.fidexio.step_definitions;

import com.fidexio.pages.EmployeePage;
import com.fidexio.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.io.File;

public class EmployeeStepDefinitions {

    EmployeePage employeePage = new EmployeePage();

    @When("user clicks more button")
    public void user_clicks_more_button() {
        BrowserUtils.sleep(2);
        employeePage.moreButton.click();
    }

    @When("user clicks Employees button")
    public void user_clicks_employees_button() {
        BrowserUtils.sleep(3);
        employeePage.EmployeeButton.click();
    }

    @Then("user should land on employees page")
    public void user_should_land_on_employees_page() {
        BrowserUtils.sleep(3);
        boolean checkEmployeesWriting = employeePage.EmployeesWriting.getText().contains("Employees");
        Assert.assertTrue(checkEmployeesWriting);
    }

    @When("user clicks Create button on employee page")
    public void user_clicks_create_button_on_employee_page() {
        BrowserUtils.sleep(1);
        employeePage.CreateButton.click();
    }

    @Then("user should land on Create page")
    public void user_should_land_on_create_page() {
        BrowserUtils.sleep(4);
        boolean nameWritingCheck = employeePage.nameWriting.getText().contains("Name");
        Assert.assertTrue(nameWritingCheck);
    }

    @When("user clicks Import button")
    public void user_clicks_import_button() {
        BrowserUtils.sleep(4);
        employeePage.ImportButton.click();
    }

    @Then("user should land on Import page")
    public void user_should_land_on_import_page() {
        BrowserUtils.sleep(1);
        boolean importPage = employeePage.ImportAFile_Writing.getText().contains("Import a File");
        Assert.assertTrue(importPage);
    }

    @When("user clicks go forward button")
    public void user_clicks_go_forward_button() {
        BrowserUtils.sleep(3);
        employeePage.goForwardButton.click();
    }

    @Then("user should see next Employee page")
    public void user_should_see_next_employee_page() {
        BrowserUtils.sleep(1);
        boolean pageValue = !employeePage.getPageValue.getText().contains("1-80");
        Assert.assertTrue(pageValue);
    }

    @When("user clicks go back button")
    public void user_clicks_go_back_button() {
        BrowserUtils.sleep(2);
        employeePage.goBackButton.click();
    }

    @Then("user should see the previous Employee page")
    public void user_should_see_the_previous_employee_page() {
        BrowserUtils.sleep(2);
        boolean pageValue = !employeePage.getPageValue.getText().contains("1-80");
        Assert.assertTrue(pageValue);
    }

    @When("user clicks List button")
    public void user_clicks_list_button() {
        BrowserUtils.sleep(2);
        employeePage.ListButton.click();
    }

    @Then("user should see Employee information as a list")
    public void user_should_see_employee_information_as_a_list() {
        BrowserUtils.sleep(1);
        boolean workPhone = employeePage.WorkPhone.getText().contains("Work Phone");
        Assert.assertTrue(workPhone);
    }

    @When("user clicks Kanban button")
    public void user_clicks_kanban_button() {
        BrowserUtils.sleep(3);
        employeePage.KanbanButton.click();
    }

    @Then("user should see Employee information as a Kanban")
    public void user_should_see_employee_information_as_a_kanban() {
        BrowserUtils.sleep(1);
        employeePage.KanbanBox.isDisplayed();
    }

    @When("user should enter {string}")
    public void user_should_enter(String EmployeeName) {
        BrowserUtils.sleep(3);
        employeePage.EmployeeNameBox.sendKeys(EmployeeName);
    }

    @When("user clicks save button on employee page")
    public void user_clicks_save_button_on_employee_page() {
        BrowserUtils.sleep(2);
        employeePage.SaveButton.click();
    }

    @Then("user should see the employee page {string}")
    public void user_should_see_the_employee_page(String EmployeeName) {
        BrowserUtils.sleep(3);
        boolean employeeName = employeePage.CreatedEmployeesName.getText().contains(EmployeeName);
        Assert.assertTrue(employeeName);
    }

    @Then("user should see the {string} message under full profile")
    public void user_should_see_the_message_under_full_profile(String string) {
        BrowserUtils.sleep(2);
        boolean CheckEmployeeCreated = employeePage.EmployeeCreatedWriting.getText().contains(string);
        Assert.assertTrue(CheckEmployeeCreated);

        employeePage.Action.click();
        BrowserUtils.sleep(2);
        employeePage.DeleteButton.click();
        BrowserUtils.sleep(2);
        employeePage.OkButton.click();
    }

    @When("user should upload the employee's picture")
    public void user_should_upload_the_employee_s_picture() {
        BrowserUtils.sleep(5);
        File resourcesDirectory = new File("src/test/resources");
        String picture = resourcesDirectory.getAbsolutePath() + "/employee.jpg";
        employeePage.downloadPicture.sendKeys(picture);
        BrowserUtils.sleep(5);
    }

    @When("user clicks delete button on the employee's picture")
    public void user_clicks_delete_button_on_the_employee_s_picture() {
        BrowserUtils.sleep(5);
        employeePage.DeletePhoto.click();
    }

    @Then("the picture should be deleted")
    public void the_picture_should_be_deleted() {
        BrowserUtils.sleep(5);
        boolean checkPicture = employeePage.imgPhoto.isDisplayed();
        Assert.assertTrue(checkPicture);
    }

    @Then("user should display the edit button instead of save button")
    public void user_should_display_the_edit_button_instead_of_save_button() {
        BrowserUtils.sleep(5);
        boolean editButtonDisplayed = employeePage.EditButton.isDisplayed();
        Assert.assertTrue(editButtonDisplayed);
    }

    @Then("user should display create button instead of discard button")
    public void user_should_display_create_button_instead_of_discard_button() {
        BrowserUtils.sleep(5);
        boolean createButtonDisplayed = employeePage.CreateButton.isDisplayed();
        Assert.assertTrue(createButtonDisplayed);
    }

    @Then("user should see the information of the employee which user entered should be displayed {string}")
    public void user_should_see_the_information_of_the_employee_which_user_entered_should_be_displayed(String EmployeeName) {
        BrowserUtils.sleep(5);
        boolean checkEmployeeName = employeePage.CreatedEmployeesName.getText().contains(EmployeeName);
        Assert.assertTrue(checkEmployeeName);

        employeePage.Action.click();
        BrowserUtils.sleep(2);
        employeePage.DeleteButton.click();
        BrowserUtils.sleep(2);
        employeePage.OkButton.click();
    }

    @When("search by employee's name {string}")
    public void search_by_employee_s_name(String EmployeeName) {
        BrowserUtils.sleep(5);
        employeePage.searchButton.sendKeys(EmployeeName + Keys.ENTER);
    }

    @Then("{string} listed on the list")
    public void listed_on_the_list(String EmployeeName) {
        BrowserUtils.sleep(2);
        boolean displayedEmployeeNameOnTheList = employeePage.ListedOfEmployeeName.getText().contains(EmployeeName);
        Assert.assertTrue(displayedEmployeeNameOnTheList);
        BrowserUtils.sleep(2);
        employeePage.ListedOfEmployeeName.click();
        BrowserUtils.sleep(2);
        employeePage.Action.click();
        BrowserUtils.sleep(2);
        employeePage.DeleteButton.click();
        BrowserUtils.sleep(2);
        employeePage.OkButton.click();
    }

}
