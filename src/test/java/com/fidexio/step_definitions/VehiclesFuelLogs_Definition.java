package com.fidexio.step_definitions;

import com.fidexio.pages.VehiclesFuelLogs_Pages;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VehiclesFuelLogs_Definition {

    VehiclesFuelLogs_Pages vehiclesFuelLogs_pages = new VehiclesFuelLogs_Pages();

    @Given("user is on the Vehicles page")
    public void userIsOnTheVehiclesPage() {
        vehiclesFuelLogs_pages.moreButton.click();
        vehiclesFuelLogs_pages.fleetButton.click();
        Assert.assertTrue(vehiclesFuelLogs_pages.vehiclesPage.isDisplayed());
    }

    @When("user  click the Vehicles Fuel Log button for a specific vehicle")
    public void userClickTheVehiclesFuelLogButtonForASpecificVehicle() {

        vehiclesFuelLogs_pages.vehicleFuelLogs.click();
    }

    @And("user click to Create button")
    public void userClickToCreateButton() {
        BrowserUtils.sleep(4);
        vehiclesFuelLogs_pages.createButton.click();

    }

    @Then("user sees Vehicles Fuel Logs New")
    public void userSeesVehiclesFuelLogsNew() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(vehiclesFuelLogs_pages.vehiclesFuelLogsNew.isDisplayed());
    }

    @When("user click Vehicle box")
    public void userClickVehicleBox() {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.vehicleBox.click();
    }


    @And("user should select a vehicle")
    public void userShouldSelectAVehicle() {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.selectBmwVehicle.click();
    }

    @And("user click the Save button")
    public void userClickTheSaveButton() {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.saveButton.click();
    }


    @Then("Create a Vehicle popup should be displayed in the vehicle fuel logs.")
    public void createAVehiclePopupShouldBeDisplayed() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehiclesFuelLogs_pages.createVehiclePopup.isDisplayed());

    }


    @Then("the new fuel log should be saved successfully")
    public void the_new_fuel_log_should_be_saved_successfully() {
        BrowserUtils.sleep(3);
        //   Assert.assertTrue(vehiclesFuelLogs_pages.vehicleDetail.isDisplayed());

        boolean checkVehicleDetail = vehiclesFuelLogs_pages.vehicleDetail.getText().contains("Vehicle Details");

        //  boolean checkEmployeeName = employeePage.CreatedEmployeesName.getText().contains(EmployeeName);
        BrowserUtils.sleep(3);
        vehiclesFuelLogs_pages.actionButton.click();
        BrowserUtils.sleep(3);
        vehiclesFuelLogs_pages.deleteButton.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.deleteOkButton.click();
    }

    @And("Vehicles Fuel Log Details should be displayed")
    public void vehiclesFuelLogDetailsShouldBeDisplayed() {
        vehiclesFuelLogs_pages.vehicleDetail.isDisplayed();
    }

    @Then("which user entered should be displayed")
    public void whichUserEnteredShouldBeDisplayed() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehiclesFuelLogs_pages.whichUser.isDisplayed());
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.actionButton.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.deleteButton.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.deleteOkButton.click();
    }


    @When("user enter Vehicle box {string}")
    public void userEnterVehicleBox(String arg0) {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.vehicleBox.sendKeys("Toyota");
    }


    @Then("Edit button display instead of Save button")
    public void editButtonDisplayInsteadOfSaveButton() {
        BrowserUtils.sleep(2);
        Assert.assertFalse(vehiclesFuelLogs_pages.saveButton.isDisplayed());
        Assert.assertTrue(vehiclesFuelLogs_pages.editButton.isDisplayed());
    }

    @Then("Create button display instead of Discard button")
    public void createButtonDisplayInsteadOfDiscardButton() {
        BrowserUtils.sleep(2);
        Assert.assertFalse(vehiclesFuelLogs_pages.discardButton.isDisplayed());
        Assert.assertTrue(vehiclesFuelLogs_pages.createButton.isDisplayed());
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.actionButton.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.deleteButton.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.deleteOkButton.click();
    }

    @And("user click the Edit button")
    public void userClickTheEditButton() {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.editButton.click();
    }

    @And("displaying the all the information page")
    public void displayingTheAllTheInformationPage() {
        vehiclesFuelLogs_pages.informationPage.isDisplayed();
    }


    @And("user click Vehicle box and delete")
    public void userClickVehicleBoxAndDelete() {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.vehicleBox.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.vehicleBox.clear();

    }


    @Then("the fuel log should be saved successfully")
    public void theFuelLogShouldBeSavedSuccessfully() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehiclesFuelLogs_pages.bmwCreateVerify.isDisplayed());
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.actionButton.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.deleteButton.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.deleteOkButton.click();
    }

    @When("user click Vehicle box and click Search More button")
    public void userClickVehicleBoxAndClickSearchMoreButton() {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.vehicleBox.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.seachMore.click();

    }


    @When("user click create and edit")
    public void userClickCreateAndEdit() {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.createAndEditButton.click();
    }

    @When("user click License Plate")
    public void userClickLicensePlate() {
        vehiclesFuelLogs_pages.licencePlateBox.click();
    }


    @When("user enter {string}")
    public void userEnter(String arg0) {
        vehiclesFuelLogs_pages.licencePlateBox.sendKeys("ABC 81" + Keys.ENTER);
    }

    @When("user click the new Save button")
    public void userClickTheNewSaveButton() {
        vehiclesFuelLogs_pages.newSaveButton.click();
    }

    @When("user select Acura")
    public void userSelectAcura() {
        BrowserUtils.sleep(3);
        vehiclesFuelLogs_pages.selectAcuraModel.click();
    }


    @When("user enters Vehicle box {string}")
    public void userEntersVehicleBox(String arg0) {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.vehicleBox.sendKeys("Nissan/Micra/64ee124");

    }


    @When("user enter {string} in the Odometer Value input box")
    public void userEnterInTheOdometerValueInputBox(String arg0) {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.odometerValueBox.sendKeys(arg0, Keys.ENTER);

    }

    @When("user click Odometer Value box")
    public void userClickOdometerValueBox() {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.odometerValueBox.click();
    }

    @When("user enter {string} Model dropdown box")
    public void userEnterModelDropdownBox(String arg0) {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.modelDropDownBox.sendKeys(arg0);
        vehiclesFuelLogs_pages.createModel.click();
    }

    @Then("user sees Odometer Value as a float number.")
    public void userSeesOdometerValueAsAFloatNumber() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehiclesFuelLogs_pages.odometerValueVerify.getText().contains("."));
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.actionButton.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.deleteButton.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.deleteOkButton.click();
    }

    @When("user click Odometer Value box and delete")
    public void userClickOdometerValueBoxAndDelete() {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.odometerValueBox.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.odometerValueBox.clear();


    }


    @When("user enter {int}- in the Odometer Value input box.")
    public void userEnterInTheOdometerValueInputBox(int arg0) {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.odometerValueBox.sendKeys("1234");
    }

    @When("user click  Model dropdown box")
    public void userClickModelDropdownBox() {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.modelDropDownBox.click();
    }

    @Then("user sees Vehicle Details")
    public void userSeesVehicleDetails() {
        BrowserUtils.sleep(1);
        Assert.assertTrue(vehiclesFuelLogs_pages.vehicleDetail.isDisplayed());
        BrowserUtils.sleep(3);
    }

    @Then("user sees Nissan as the vehicle")
    public void userSeesNissanAsTheVehicle() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(vehiclesFuelLogs_pages.nissanMicraVerify.isDisplayed());
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.actionButton.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.deleteButton.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.deleteOkButton.click();


    }

    @And("user click Nissan Micra")
    public void userClickNissanMicra() {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.nissanMicraVerify.click();
    }

    @Then("user sees {string} warning message")
    public void userSeesWarningMessage(String odometerValue) {
        BrowserUtils.sleep(2);
        boolean checkWarningMessage = vehiclesFuelLogs_pages.theFollowingFieldsAreInvalid.getText().contains(odometerValue);
        Assert.assertTrue(checkWarningMessage);
        BrowserUtils.sleep(2);


    }


}




