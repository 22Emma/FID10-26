package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.CostFunctionPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

import java.security.Key;

public class CostFunction_StepDefinitions extends BasePage {

    CostFunctionPage costFunctionPage = new CostFunctionPage();

    @Given("user is on the fidexio home page and clicks to fleet option from more section")
    public void user_is_on_the_fidexio_home_page_and_clicks_to_fleet_option_from_more_section() {
        BrowserUtils.sleep(3);
        sectionMore.click();
        BrowserUtils.sleep(3);
        MoreFleet.click();


    }

    @Given("user clicks to vehicle costs from the vehicles section")
    public void user_clicks_to_vehicle_costs_from_the_vehicles_section() {
        costFunctionPage.vehicleCost.click();
        BrowserUtils.sleep(5);

    }

    //user enters model name and clicks to empty space and click enter button
    @Given("users  clicks on create button and enters vehicle name and clicks to enter")
    public void users_clicks_on_create_button_and_enters_vehicle_name_and_clicks_to_enter() {
        BrowserUtils.sleep(10);
        costFunctionPage.createButton.click();
        BrowserUtils.sleep(1);


        costFunctionPage.vehicleName.sendKeys("acababune");
        BrowserUtils.sleep(1);
        costFunctionPage.createButtonOnVehicle.click();


        BrowserUtils.sleep(4);


        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

    }


    @And("user enters make name and clicks save button")
    public void userEntersMakeNameAndClicksSaveButton() {

    }

    @Then("user  enters model name on model input and click to enter")
    public void user_enters_model_name_on_model_input_and_click_to_enter() {

        costFunctionPage.modelName.sendKeys("dsadskj");
        BrowserUtils.sleep(1);
        costFunctionPage.createVehicleCreateButton.click();
        costFunctionPage.makeButton.sendKeys("salla");
        BrowserUtils.sleep(2);
        costFunctionPage.makeButton.sendKeys(Keys.ENTER);
        costFunctionPage.createModelSaveButton.click();


    }

    @Then("user enters licence plate and click to save button.")
    public void user_enters_licence_plate_and_click_to_save_button() {


    }

    @Then("user enters total price and clicks to save button.")
    public void user_enters_total_price_and_clicks_to_save_button() {

    }

    @Then("total price should be displayed as a float number.")
    public void total_price_should_be_displayed_as_a_float_number() {

    }


    @And("user enters licence plate and click to save button")
    public void userEntersLicencePlateAndClickToSaveButton() {

    }

    @Then("user enters total price and clicks to save button")
    public void userEntersTotalPriceAndClicksToSaveButton() {

    }

    @Then("edit button should be displayed")
    public void editButtonShouldBeDisplayed() {

    }

    @Then("user clicks to edit button and details should be editable")
    public void userClicksToEditButtonAndDetailsShouldBeEditable() {

    }

    @Then("costs details should be displayed")
    public void costsDetailsShouldBeDisplayed() {

    }

    @Then("Create a Vehicle popup should be displayed")
    public void createAVehiclePopupShouldBeDisplayed() {

    }

    @Then("user selects a vehicle from vehicles dropdown")
    public void userSelectsAVehicleFromVehiclesDropdown() {
    }


}

