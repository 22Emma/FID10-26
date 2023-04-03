package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.LoginPage;
import com.fidexio.pages.SurveysPage;
import com.fidexio.pages.VehicleContractsPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class survey_StepDefinitions  extends BasePage {
    SurveysPage SurveysPage =new SurveysPage();

    @Given("user is on the home  page clicks to the surveys options")
    public void userIsOnTheHomePageClicksToTheSurveysOptions() {
        sectionSurveys.click();
    }



    @Then("create,import are displayed and user is able click to them.")
    public void createImportAreDisplayedAndUserIsAbleClickToThem() {
        BrowserUtils.sleep(5);
       Assert.assertTrue(SurveysPage.CreateBtn.isDisplayed());
        BrowserUtils.sleep(5);
      Assert.assertTrue(SurveysPage.ImportBtn.isDisplayed());

    }
    @When("User clicks to Create buttons")
    public void user_clicks_to_create_buttons() {
        BrowserUtils.sleep(5);
        SurveysPage.CreateBtn.click();

    }
    @When("User must enter a survey title to create a survey.")
    public void user_must_enter_a_survey_title_to_create_a_survey() {
        BrowserUtils.sleep(5);
     SurveysPage.SurveyTitle.sendKeys("FirstSurvey");

    }

    @Then("User click to Save button")
    public void user_click_to_save_button() {
        BrowserUtils.sleep(5);
        SurveysPage.SaveBtn.click();
        Assert.assertTrue(SurveysPage.SrvyCreated.isDisplayed());

    }



    @Then("Create button display instead of Discard button.")
    public void create_button_display_instead_of_discard_button() {

    }

    @When("Attachment\\(s) buttons should be displayed.")
    public void attachment_s_buttons_should_be_displayed() {

    }

    @When("Action buttons should be displayed.")
    public void action_buttons_should_be_displayed() {

    }

    @When("Test Survey buttons should be displayed.")
    public void test_survey_buttons_should_be_displayed() {

    }

    @When("Print Survey buttons should be displayed.")
    public void print_survey_buttons_should_be_displayed() {

    }

    @When("Share and invite by email buttons should be displayed.")
    public void share_and_invite_by_email_buttons_should_be_displayed() {

    }

    @Then("View result buttons should be displayed.")
    public void view_result_buttons_should_be_displayed() {

    }

    @Then("Add an item should be not displayed.")
    public void add_an_item_should_be_not_displayed() {

    }

    @Then("User can choose \"User can come back in the previous page")
    public void user_can_choose_user_can_come_back_in_the_previous_page() {

    }

    @Then("{string} message should be displayed under the survey form sheet,")
    public void message_should_be_displayed_under_the_survey_form_sheet(String string) {

    }

    @When("Verify that the user should be able to see created survey is listed")
    public void verify_that_the_user_should_be_able_to_see_created_survey_is_listed() {

    }






}
