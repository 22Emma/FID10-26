package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.VehicleContractsPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
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

    @And("user clicks save button")
    public void userClicksSaveButton() {

        VehicleContractsPage.SaveBtn.click();
    }

    @Then("user should not be able to create a contract without entering a vehicle")
    public void userShouldNotBeAbleToCreateAContractWithoutEnteringAVehicle() {

        wait.until(ExpectedConditions.visibilityOf(VehicleContractsPage.InvalidFieldNoti));
        Assert.assertTrue(VehicleContractsPage.InvalidFieldNoti.isDisplayed());
    }

    @When("user chooses at least a vehicle")
    public void userChoosesAtLeastAVehicle() {
        wait.until(ExpectedConditions.elementToBeClickable(VehicleContractsPage.VehicleDropDown));
        VehicleContractsPage.VehicleDropDown.click();

        wait.until(ExpectedConditions.elementToBeClickable(VehicleContractsPage.VehicleDropDown1stOption));
        VehicleContractsPage.VehicleDropDown1stOption.click();

        wait.until(ExpectedConditions.textToBePresentInElementValue(VehicleContractsPage.VehicleDropDown,"Bmw/520ES/01adana01"));
        Assert.assertEquals("Bmw/520ES/01adana01",VehicleContractsPage.VehicleDropDown.getAttribute("value"));

    }

    @Then("user should be able to create a contract")
    public void userShouldBeAbleToCreateAContract() {

        VehicleContractsPage.SaveBtn.click();
        wait.until(ExpectedConditions.titleContains("Bmw/520ES/01adana01"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Bmw/520ES/01adana01"));
    }

    @When("user enters a vehicle which is not on the vehicle list and clicks the save button")
    public void userEntersAVehicleWhichIsNotOnTheVehicleListAndClicksTheSaveButton() {
        wait.until(ExpectedConditions.elementToBeClickable(VehicleContractsPage.VehicleDropDown));
        VehicleContractsPage.VehicleDropDown.click();

        VehicleContractsPage.VehicleDropDown.sendKeys("audi");
        VehicleContractsPage.SaveBtn.click();


    }

    @Then("Create a Vehicle popup should be displayed.")
    public void createAVehiclePopupShouldBeDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(VehicleContractsPage.CreateAVehicle));
        Assert.assertTrue(VehicleContractsPage.CreateAVehicle.isDisplayed());

    }

    @Then("information of the Contract Details which user entered should be displayed.")
    public void informationOfTheContractDetailsWhichUserEnteredShouldBeDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(VehicleContractsPage.ContractDetails));
        Assert.assertTrue(VehicleContractsPage.ContractDetails.isDisplayed());
    }

    @Then("Edit button should be displayed instead of Save button")
    public void editButtonShouldBeDisplayedInsteadOfSaveButton() {
        wait.until(ExpectedConditions.visibilityOf(VehicleContractsPage.EditBtn));
        Assert.assertTrue(VehicleContractsPage.EditBtn.isDisplayed());
        
        Assert.assertFalse(VehicleContractsPage.SaveBtn.isDisplayed());
    }

    @And("Create button should be displayed instead of Discard button.")
    public void createButtonShouldBeDisplayedInsteadOfDiscardButton() {
        wait.until(ExpectedConditions.visibilityOf(VehicleContractsPage.CreateBtn));
        Assert.assertTrue(VehicleContractsPage.CreateBtn.isDisplayed());

        Assert.assertFalse(VehicleContractsPage.DiscardBtn.isDisplayed());

    }

    @And("user clicks the edit button")
    public void userClicksTheEditButton() {
        wait.until(ExpectedConditions.elementToBeClickable(VehicleContractsPage.EditBtn));
        VehicleContractsPage.EditBtn.click();
    }

    @Then("form should open by displaying the all the information and it be ready to edit")
    public void formShouldOpenByDisplayingTheAllTheInformationAndItBeReadyToEdit() {

        wait.until(ExpectedConditions.textToBePresentInElementValue(VehicleContractsPage.ActivationCostInput,"50"));
        Assert.assertEquals("50.00",VehicleContractsPage.ActivationCostInput.getAttribute("value"));

        VehicleContractsPage.ActivationCostInput.clear();
        VehicleContractsPage.ActivationCostInput.sendKeys("100");

        wait.until(ExpectedConditions.textToBePresentInElementValue(VehicleContractsPage.ActivationCostInput,"100"));
        Assert.assertEquals("100",VehicleContractsPage.ActivationCostInput.getAttribute("value"));


    }

    @And("user enters a vehicle, contract type and recurring cost amount")
    public void userEntersAVehicleContractTypeAndRecurringCostAmount() {
        VehicleContractsPage.VehicleDropDown.click();

        wait.until(ExpectedConditions.elementToBeClickable(VehicleContractsPage.VehicleDropDown1stOption));
        VehicleContractsPage.VehicleDropDown1stOption.click();

        wait.until(ExpectedConditions.textToBePresentInElementValue(VehicleContractsPage.VehicleDropDown,"Bmw/520ES/01adana01"));
        Assert.assertEquals("Bmw/520ES/01adana01",VehicleContractsPage.VehicleDropDown.getAttribute("value"));

        wait.until(ExpectedConditions.textToBePresentInElementValue(VehicleContractsPage.ContractType,"Leasing"));
        Assert.assertEquals("Leasing",VehicleContractsPage.ContractType.getAttribute("value")); //default on leasing so no need to change

        Select selectObj = new Select(VehicleContractsPage.RecurringCostAmountBtn);
        selectObj.selectByIndex(4);

        Assert.assertEquals("\"monthly\"",VehicleContractsPage.RecurringCostAmountBtn.getAttribute("value"));

        VehicleContractsPage.RecurringCostAmountInput.clear();
        VehicleContractsPage.RecurringCostAmountInput.sendKeys("300");

        wait.until(ExpectedConditions.textToBePresentInElementValue(VehicleContractsPage.RecurringCostAmountInput,"300"));
        Assert.assertEquals("300",VehicleContractsPage.RecurringCostAmountInput.getAttribute("value"));
    }

    @When("user enters {string}")
    public void userEnters(String arg0) {

        VehicleContractsPage.ActivationCostInput.clear();
        VehicleContractsPage.ActivationCostInput.sendKeys(arg0);

        wait.until(ExpectedConditions.textToBePresentInElementValue(VehicleContractsPage.ActivationCostInput,arg0));
        Assert.assertEquals(arg0,VehicleContractsPage.ActivationCostInput.getAttribute("value"));


    }

    @Then("only numbers should be accepted as activation cost")
    public void onlyNumbersShouldBeAcceptedAsActivationCost() {

        VehicleContractsPage.SaveBtn.click();


        if (VehicleContractsPage.ActivationCostInput.getAttribute("value").equals("0.00")){
            System.out.println("1st if triggered");
            Assert.assertTrue(VehicleContractsPage.InvalidFieldNoti.isDisplayed());
        }

        if (VehicleContractsPage.ActivationCostInput.getAttribute("value").equals("5")){
            System.out.println("2nd if triggered");
            wait.until(ExpectedConditions.textToBePresentInElementValue(VehicleContractsPage.ActivationCostInput,"5"));
            Assert.assertEquals("5",VehicleContractsPage.ActivationCostInput.getAttribute("value"));
        }

    }

    @And("numbers should be displayed as a float number")
    public void numbersShouldBeDisplayedAsAFloatNumber() {

        if (VehicleContractsPage.ActivationCostInput.getAttribute("value").equals("5")) {
            System.out.println("3rd if triggered");
            wait.until(ExpectedConditions.visibilityOf(VehicleContractsPage.ActivationCostSaved));
            Assert.assertEquals("5.00",VehicleContractsPage.ActivationCostSaved.getText());

        }
    }

    @Then("Service Type should be display as Leasing by default")
    public void serviceTypeShouldBeDisplayAsLeasingByDefault() {

        Assert.assertEquals("Leasing",VehicleContractsPage.ContractType.getAttribute("value"));


    }
}
