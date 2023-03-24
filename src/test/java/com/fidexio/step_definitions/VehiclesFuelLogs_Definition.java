package com.fidexio.step_definitions;

import com.fidexio.pages.VehiclesFuelLogs_Pages;
import com.fidexio.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class VehiclesFuelLogs_Definition {

    VehiclesFuelLogs_Pages vehiclesFuelLogs_pages=new VehiclesFuelLogs_Pages();

    @Given("user is on the Vehicles page")
    public void userIsOnTheVehiclesPage() {
     vehiclesFuelLogs_pages.moreButton.click();
     vehiclesFuelLogs_pages.fleetButton.click();
     vehiclesFuelLogs_pages.vehiclesPage.isDisplayed();
    }

    @When("user  click the Vehicles Fuel Log button for a specific vehicle")
    public void userClickTheVehiclesFuelLogButtonForASpecificVehicle() {
        vehiclesFuelLogs_pages.vehicleFuelLogs.click();
    }

    @And("user click to Create button")
    public void userClickToCreateButton() {
        BrowserUtils.sleep(5);
        vehiclesFuelLogs_pages.createButton.click();
    }
    @And("user enters Vehicle box {string}")
    public void userEntersVehicleBox(String arg0) {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.vehicleBox.sendKeys("Bmw/520ES/01adana01");

    }
    @And("user click the Save button")
    public void userClickTheSaveButton() {
       vehiclesFuelLogs_pages.saveButton.click();
    }
    @Then("the new fuel log should be saved successfully")
    public void the_new_fuel_log_should_be_saved_successfully() {
        vehiclesFuelLogs_pages.vehicleDetail.isDisplayed();
    }


    @When("user click Vehicle box and click Search More button")
    public void userClickVehicleBoxAndClickSearchMoreButton() {
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.vehicleBox.click();
        BrowserUtils.sleep(2);
        vehiclesFuelLogs_pages.seachMore.click();
    }

    @Then("Create a Vehicle popup should be displayed.")
    public void createAVehiclePopupShouldBeDisplayed() {
        vehiclesFuelLogs_pages.createVehiclePopup.isDisplayed();
    }




    }




