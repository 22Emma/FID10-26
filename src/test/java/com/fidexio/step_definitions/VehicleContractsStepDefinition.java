package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.VehicleContractsPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleContractsStepDefinition {

    VehicleContractsPage VehicleContractsPage = new VehicleContractsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is on the vehicle contract creation page")
    public void user_is_on_the_vehicle_contract_creation_page() {
        VehicleContractsPage.sectionMore.click();
        VehicleContractsPage.MoreFleet.click();
        VehicleContractsPage.VehicleContractsBtn.click();


        wait.until(ExpectedConditions.visibilityOf(VehicleContractsPage.VehiclesContractsTitle));

        Assert.assertTrue(VehicleContractsPage.VehiclesContractsTitle.isDisplayed());

    }
    @When("user clicks Create button")
    public void user_clicks_create_button() {


        wait.until(ExpectedConditions.elementToBeClickable(VehicleContractsPage.CreateBtn));

        VehicleContractsPage.CreateBtn.click();

        wait.until(ExpectedConditions.visibilityOf(VehicleContractsPage.ContractDetailsTitle));

        Assert.assertTrue(VehicleContractsPage.ContractDetailsTitle.isDisplayed());

    }
    @When("user enters a vehicle, contract type, activation cost and recurring cost amount")
    public void user_enters_a_vehicle_contract_type_activation_cost_and_recurring_cost_amount() {
        VehicleContractsPage.VehicleDropDown.click();

        wait.until(ExpectedConditions.elementToBeClickable(VehicleContractsPage.VehicleDropDown1stOption));
        VehicleContractsPage.VehicleDropDown1stOption.click();

        wait.until(ExpectedConditions.textToBePresentInElementValue(VehicleContractsPage.VehicleDropDown,"Bmw/520ES/01adana01"));
        Assert.assertEquals("Bmw/520ES/01adana01",VehicleContractsPage.VehicleDropDown.getAttribute("value"));

        wait.until(ExpectedConditions.textToBePresentInElementValue(VehicleContractsPage.ContractType,"Leasing"));
        Assert.assertEquals("Leasing",VehicleContractsPage.ContractType.getAttribute("value")); //default on leasing so no need to change

        VehicleContractsPage.ActivationCostInput.clear();
        VehicleContractsPage.ActivationCostInput.sendKeys("50");

        wait.until(ExpectedConditions.textToBePresentInElementValue(VehicleContractsPage.ActivationCostInput,"50"));
        Assert.assertEquals("50",VehicleContractsPage.ActivationCostInput.getAttribute("value"));

        Select selectObj = new Select(VehicleContractsPage.RecurringCostAmountBtn);
        selectObj.selectByIndex(4);

        Assert.assertEquals("\"monthly\"",VehicleContractsPage.RecurringCostAmountBtn.getAttribute("value"));

        VehicleContractsPage.RecurringCostAmountInput.clear();
        VehicleContractsPage.RecurringCostAmountInput.sendKeys("300");

        wait.until(ExpectedConditions.textToBePresentInElementValue(VehicleContractsPage.RecurringCostAmountInput,"300"));
        Assert.assertEquals("300",VehicleContractsPage.RecurringCostAmountInput.getAttribute("value"));
    }
    @Then("user should be able to click Save button to save the contract")
    public void user_should_be_able_to_click_save_button_to_save_the_contract() {

        VehicleContractsPage.SaveBtn.click();
        wait.until(ExpectedConditions.titleContains("Bmw/520ES/01adana01"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Bmw/520ES/01adana01"));
    }


}
