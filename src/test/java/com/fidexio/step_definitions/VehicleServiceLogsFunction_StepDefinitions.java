package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.VehicleContractsPage;
import com.fidexio.pages.VehiclesServiceLogPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
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

    @Given("user is on the fidexio vehicles services logs page")
    public void userIsOnTheFidexioVehiclesServicesLogsPage() {

        wait.until(ExpectedConditions.titleContains("Vehicles Services Logs - Odoo"));
        Assert.assertEquals("Vehicles Services Logs - Odoo",Driver.getDriver().getTitle());

    }

    @And("user clicks the create button")
    public void userClicksTheCreateButton() {

        vehiclesServiceLogPage.createButton.click();

    }


    @Then("user selects a vehicle")
    public void userSelectsAVehicle() {

        wait.until(ExpectedConditions.elementToBeClickable(vehiclesServiceLogPage.vehicleDropdown));
        vehiclesServiceLogPage.vehicleDropdown.click();
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesServiceLogPage.vehicleDropdownOption1));
        vehiclesServiceLogPage.vehicleDropdownOption1.click();

        wait.until(ExpectedConditions.textToBePresentInElementValue(vehiclesServiceLogPage.vehicleDropdown,"Bmw/520ES/01adana01"));
        Assert.assertEquals("Bmw/520ES/01adana01",vehiclesServiceLogPage.vehicleDropdown.getAttribute("value"));

    }


    @And("user enters the total price fee and clicks the save button")
    public void userEntersTheTotalPriceFeeAndClicksTheSaveButton() {

        wait.until(ExpectedConditions.visibilityOf(vehiclesServiceLogPage.totalPriceBox));
        vehiclesServiceLogPage.totalPriceBox.clear();
        vehiclesServiceLogPage.totalPriceBox.sendKeys("500.00");
        wait.until(ExpectedConditions.textToBePresentInElementValue(vehiclesServiceLogPage.totalPriceBox,"500.00"));
        Assert.assertEquals("500.00",vehiclesServiceLogPage.totalPriceBox.getAttribute("value"));

        vehiclesServiceLogPage.saveButton.click();
    }

    @Then("user should see their vehicles service log")
    public void userShouldSeeTheirVehiclesServiceLog() {

        wait.until(ExpectedConditions.visibilityOf(vehiclesServiceLogPage.serviceDetails));
        Assert.assertTrue(vehiclesServiceLogPage.serviceDetails.isDisplayed());

    }

    @Then("user should not be able see their vehicles service log")
    public void userShouldNotBeAbleSeeTheirVehiclesServiceLog() {

        wait.until(ExpectedConditions.visibilityOf(vehiclesServiceLogPage.invalidFieldNotification));
        Assert.assertTrue(vehiclesServiceLogPage.invalidFieldNotification.isDisplayed());

    }

    @Then("user enters a vehicle not on the dropdown list")
    public void userEntersAVehicleNotOnTheDropdownList() {

        wait.until(ExpectedConditions.visibilityOf(vehiclesServiceLogPage.vehicleDropdown));
        vehiclesServiceLogPage.vehicleDropdown.sendKeys("tofas");
        Assert.assertEquals("tofas",vehiclesServiceLogPage.vehicleDropdown.getAttribute("value"));

    }


    @And("user clicks the save button")
    public void userClicksTheSaveButton() {

        vehiclesServiceLogPage.saveButton.click();
        wait.until(ExpectedConditions.visibilityOf(vehiclesServiceLogPage.serviceDetails));


    }

    @And("user clicks the create button in the pop up")
    public void userClicksTheCreateButtonInThePopUp() {

        wait.until(ExpectedConditions.visibilityOf(vehiclesServiceLogPage.createAVehiclePopup));
        Assert.assertTrue(vehiclesServiceLogPage.createAVehiclePopup.isDisplayed());
        vehiclesServiceLogPage.createButtonInPopUp.click();


    }

    @Then("create a vehicle popup should be displayed")
    public void createAVehiclePopupShouldBeDisplayed() {

        wait.until(ExpectedConditions.visibilityOf(vehiclesServiceLogPage.bigCreateVehiclePopUp));
        Assert.assertTrue(vehiclesServiceLogPage.bigCreateVehiclePopUp.isDisplayed());

    }

    @And("user enters the total price fee")
    public void userEntersTheTotalPriceFee() {

        wait.until(ExpectedConditions.visibilityOf(vehiclesServiceLogPage.totalPriceBox));
        vehiclesServiceLogPage.totalPriceBox.clear();
        vehiclesServiceLogPage.totalPriceBox.sendKeys("5000.00");
        wait.until(ExpectedConditions.textToBePresentInElementValue(vehiclesServiceLogPage.totalPriceBox,"5000.00"));
        Assert.assertEquals("5000.00",vehiclesServiceLogPage.totalPriceBox.getAttribute("value"));

    }

    @And("user enters the purchaser in additional details")
    public void userEntersThePurchaserInAdditionalDetails() {

    wait.until(ExpectedConditions.elementToBeClickable(vehiclesServiceLogPage.purchaserDetails));
    vehiclesServiceLogPage.purchaserDetails.click();
    wait.until(ExpectedConditions.elementToBeClickable(vehiclesServiceLogPage.purchaserDetails1));
    vehiclesServiceLogPage.purchaserDetails1.click();
    Assert.assertEquals("2700 Des Plaines RD, Des Plaines IL",vehiclesServiceLogPage.purchaserDetails.getAttribute("value"));


    }

    @And("user enters invoice reference")
    public void userEntersInvoiceReference() {

    vehiclesServiceLogPage.invoiceReference.sendKeys("abcdefg");
    Assert.assertEquals("abcdefg",vehiclesServiceLogPage.invoiceReference.getAttribute("value"));

    }


    @Then("user should see the edit button")
    public void userShouldSeeTheEditButton() {

    wait.until(ExpectedConditions.elementToBeClickable(vehiclesServiceLogPage.editButton));
    Assert.assertTrue(vehiclesServiceLogPage.editButton.isDisplayed());

    }

    @And("user should see the create button")
    public void userShouldSeeTheCreateButton() {

        wait.until(ExpectedConditions.elementToBeClickable(vehiclesServiceLogPage.createButton));
        Assert.assertTrue(vehiclesServiceLogPage.createButton.isDisplayed());

    }

    @And("user clicks the edit button.")
    public void userClicksTheEditButton() {

        wait.until(ExpectedConditions.elementToBeClickable(vehiclesServiceLogPage.editButton));
        Assert.assertTrue(vehiclesServiceLogPage.editButton.isDisplayed());
        vehiclesServiceLogPage.editButton.click();

    }

    @Then("user should be able to see all the information and be able to edit it")
    public void userShouldBeAbleToSeeAllTheInformationAndBeAbleToEditIt() {

        Assert.assertTrue(vehiclesServiceLogPage.totalPriceBox.isDisplayed());

        wait.until(ExpectedConditions.textToBePresentInElementValue(vehiclesServiceLogPage.totalPriceBox,"500.00"));
        Assert.assertEquals("500.00",vehiclesServiceLogPage.totalPriceBox.getAttribute("value"));

        vehiclesServiceLogPage.totalPriceBox.clear();
        vehiclesServiceLogPage.totalPriceBox.sendKeys("8000.00");

        wait.until(ExpectedConditions.textToBePresentInElementValue(vehiclesServiceLogPage.totalPriceBox,"8000.00"));
        Assert.assertEquals("8000.00",vehiclesServiceLogPage.totalPriceBox.getAttribute("value"));



    }


    @When("the user enters {string} for total price fee")
    public void theUserEntersForTotalPriceFee(String arg0) {

        vehiclesServiceLogPage.totalPriceBox.clear();
        vehiclesServiceLogPage.totalPriceBox.sendKeys(arg0);

        wait.until(ExpectedConditions.textToBePresentInElementValue(vehiclesServiceLogPage.totalPriceBox,arg0));
        Assert.assertEquals(arg0,vehiclesServiceLogPage.totalPriceBox.getAttribute("value"));

    }

    @Then("only float numbers should be accepted as total price fee")
    public void onlyFloatNumbersShouldBeAcceptedAsTotalPriceFee() {


        if (vehiclesServiceLogPage.totalPriceBox.getAttribute("value").equals("500.00")){
            System.out.println("Float number --> 500.00");
            vehiclesServiceLogPage.saveButton.click();
            wait.until(ExpectedConditions.visibilityOf(vehiclesServiceLogPage.totalpriceInServiceLogs));
            Assert.assertEquals("500.00",vehiclesServiceLogPage.totalpriceInServiceLogs.getText());
        } else if (vehiclesServiceLogPage.totalPriceBox.getAttribute("value").equals("60")) {
            System.out.println("Integer number --> 60");
            vehiclesServiceLogPage.saveButton.click();
            wait.until(ExpectedConditions.visibilityOf(vehiclesServiceLogPage.totalpriceInServiceLogs));
            Assert.assertEquals("60.00",vehiclesServiceLogPage.totalpriceInServiceLogs.getText());
        }else if (vehiclesServiceLogPage.totalPriceBox.getAttribute("value").equals("invalid entry")) {
            System.out.println("String --> invalid entry");
            vehiclesServiceLogPage.saveButton.click();
            wait.until(ExpectedConditions.visibilityOf(vehiclesServiceLogPage.invalidFieldNotification));
            Assert.assertTrue(vehiclesServiceLogPage.invalidFieldNotification.isDisplayed());
        }

    }


    @Then("service type is displayed as repair and maintenance by default")
    public void serviceTypeIsDisplayedAsRepairAndMaintenanceByDefault() {

        wait.until(ExpectedConditions.visibilityOf(vehiclesServiceLogPage.serviceTypeDropdown));
        Assert.assertEquals("Repair and maintenance", vehiclesServiceLogPage.serviceTypeDropdown.getAttribute("value"));

    }
}
