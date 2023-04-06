package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.CostFunctionPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;
import java.util.Scanner;

public class CostFunctionDefinitions extends BasePage {

    CostFunctionPage costFunctionPage=new CostFunctionPage();

    Fidexio_login_Definitions fidexio_login_definitions=new Fidexio_login_Definitions();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @And("user clicks on more button")
    public void userClicksOnMoreButton() {
        sectionMore.click();
    }

    @And("user clicks on fleet button")
    public void userClicksOnFleetButton() {
        MoreFleet.click();
    }

    @Then("user click Vehicle Costs buttonn")
    public void userClickVehicleCostsButtonn() {
        costFunctionPage.vehicleCostBtn.click();
    }

    @And("user clicks on the create buttonn")
    public void userClicksOnTheCreateButtonn() {
        costFunctionPage.createNewBtn.click();
    }

    @When("user enters a vehicle Modell {string}")
    public void userEntersAVehicleModell(String model) {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(costFunctionPage.vehicle_input_box, model).pause(1000).sendKeys(Keys.TAB).perform();
    }

    @And("user chooses a vehicle type descriptionn")
    public void userChoosesAVehicleTypeDescriptionn() {
        costFunctionPage.vehicle_type.click();
        costFunctionPage.readyType.click();
    }

    @And("User enters Total Price amountt {string}")
    public void userEntersTotalPriceAmountt(String totalPrice) {
        costFunctionPage.total_price.clear();
        costFunctionPage.total_price.sendKeys(totalPrice);
    }

    @Then("user clicks on the save buttonn")
    public void userClicksOnTheSaveButtonn() {
        costFunctionPage.save_button.click();
    }

    @Then("user selects a vehicle from vehicles dropdownn")
    public void userSelectsAVehicleFromVehiclesDropdownn() {
        costFunctionPage.vehicle_input_box.click();

        BrowserUtils.sleep(2);
        costFunctionPage.selectFromDropDown.click();
    }

    @Then("user enters total price and clicks to save buttonn")
    public void userEntersTotalPriceAndClicksToSaveButtonn() {
        costFunctionPage.total_price.clear();
        costFunctionPage.total_price.sendKeys("200000");

    }

    @And("users  clicks on create button and enters vehicle name and clicks to create buttonn")
    public void usersClicksOnCreateButtonAndEntersVehicleNameAndClicksToCreateButtonn() {

        costFunctionPage.vehicle_input_box.sendKeys("bitsinartikbucile");
        costFunctionPage.createBtn.click();




    }

    @Then("Create a Vehicle popup should be displayedd")
    public void createAVehiclePopupShouldBeDisplayedd() {
        wait.until(ExpectedConditions.visibilityOf(costFunctionPage.createVehiclePopup));
        System.out.println("costFunctionPage.createVehiclePopup.getText() = " + costFunctionPage.createVehiclePopup.getText());

    }

    @Then("costs details should be displayedn")
    public void costsDetailsShouldBeDisplayedn() {
    }

    @Then("edit button should be displayedd")
    public void editButtonShouldBeDisplayedd() {
        costFunctionPage.edit_button.isDisplayed();
    }


    @Then("total price should be displayed as a float numberr")
    public void totalPriceShouldBeDisplayedAsAFloatNumberr() {
     Assert.assertTrue(costFunctionPage.totalPriceInput.getText().contains("."));
        System.out.println("costFunctionPage.totalPriceInput.getText() = " + costFunctionPage.totalPriceInput.getText());
    }

    @Then("{string} should be displayedd")
    public void shouldBeDisplayedd(String costDetails) {
        Assert.assertEquals("Cost Details",costFunctionPage.costDetailsEditPage.getText());
    }

    @And("user clicks on the edit buttonn")
    public void userClicksOnTheEditButtonn() {
        BrowserUtils.sleep(3);
        costFunctionPage.edit_button.click();
    }

    @Then("user sees the information ready to be editedd")
    public void userSeesTheInformationReadyToBeEditedd() {
        costFunctionPage.vehicleCostInfoPage.isDisplayed();

    }

    @Then("And user can see edit and create buttons on the pagee")
    public void andUserCanSeeEditAndCreateButtonsOnThePagee() {
        costFunctionPage.edit_button.isDisplayed();
        costFunctionPage.create2Buttonn.isDisplayed();
       // System.out.println("costFunctionPage.edit_button.getText() = " + costFunctionPage.edit_button.getText());
     //   System.out.println("costFunctionPage.create2Buttonn.getText() = " + costFunctionPage.create2Buttonn.getText());

    }

    @Then("user sees a warning message {string}")
    public void userSeesAWarningMessage(String warningMessage) {
        System.out.println("costFunctionPage.warningMsg.getText() = " + costFunctionPage.warningMsg.getText());
        Assert.assertTrue(costFunctionPage.warningMsg.isDisplayed());



    }

    @And("user clears total price input")
    public void userClearsTotalPriceInput() {
        costFunctionPage.total_price.clear();

    }
}
