package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.VehiclesServiceLogPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleServiceLogsFunction_StepDefinitions {

    VehiclesServiceLogPage vehiclesServiceLogPage = new VehiclesServiceLogPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @When("user has landed on the fidexio home page and clicks to fleet button")
    public void userHasLandedOnTheFidexioHomePageAndClicksToFleetButton() {

        vehiclesServiceLogPage.MoreFleet.click();

    }

    @And("user clicks to vehicle service logs button on the vehicles section")
    public void userClicksToVehicleServiceLogsButtonOnTheVehiclesSection() {

        wait.until(ExpectedConditions.elementToBeClickable(vehiclesServiceLogPage.vehiclesServiceLogsButton));
        vehiclesServiceLogPage.vehiclesServiceLogsButton.click();
    }

    @Then("user should land on the vehicles services logs page")
    public void userShouldLandOnTheVehiclesServicesLogsPage() {

        wait.until(ExpectedConditions.titleContains("Vehicles Services Logs - Odoo"));
        Assert.assertEquals("Vehicles Services Logs - Odoo",Driver.getDriver().getTitle());

    }

    @When("user is on the fidexio vehicles services logs page")
    public void userIsOnTheFidexioVehiclesServicesLogsPage() {
    }

    @And("user clicks the create button")
    public void userClicksTheCreateButton() {
    }

    @And("user enters vehicle name and clicks the create button")
    public void userEntersVehicleNameAndClicksTheCreateButton() {
    }

    @Then("user selects a vehicle")
    public void userSelectsAVehicle() {
    }

    @And("user enters the total price fee and clicks the save button")
    public void userEntersTheTotalPriceFeeAndClicksTheSaveButton() {
    }

    @Then("user should see their vehicles service log")
    public void userShouldSeeTheirVehiclesServiceLog() {
    }

    @Then("user enters a vehicle not on the dropdown list")
    public void userEntersAVehicleNotOnTheDropdownList() {
    }

    @And("user clicks the save button")
    public void userClicksTheSaveButton() {
    }


    @Then("create a vehicle popup should be displayed")
    public void createAVehiclePopupShouldBeDisplayed() {
    }

    @Then("user should see the edit button")
    public void userShouldSeeTheEditButton() {
    }

    @And("user clicks the edit button")
    public void userClicksTheEditButton() {
    }

    @Then("user should be able to see all the information and be able to edit it")
    public void userShouldBeAbleToSeeAllTheInformationAndBeAbleToEditIt() {
    }

    @Then("total price should be displayed as a number")
    public void totalPriceShouldBeDisplayedAsANumber() {
    }

    @Then("service type is displayed as repair and maintenance by default")
    public void serviceTypeIsDisplayedAsRepairAndMaintenanceByDefault() {
    }

}
