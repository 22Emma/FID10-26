package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.LoginPage;
import com.fidexio.pages.SurveysPage;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class survey_StepDefinitions  extends BasePage {
    SurveysPage SurveysPage =new SurveysPage();

    @Given("user is on the home  page clicks to the surveys options")
    public void userIsOnTheHomePageClicksToTheSurveysOptions() {
        sectionSurveys.click();
    }


    @And("user in on Surveys page")
    public void userInOnSurveysPage() {

        Assert.assertEquals("Surveys-Odoo",Driver.getDriver().getTitle());

    }

    @Then("create,import are displayed and user is able click to them.")
    public void createImportAreDisplayedAndUserIsAbleClickToThem() {

    }
}
