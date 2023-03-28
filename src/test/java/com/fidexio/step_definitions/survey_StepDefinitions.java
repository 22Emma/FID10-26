package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.pages.SurveysPage;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class survey_StepDefinitions {
    SurveysPage SurveysPage =new SurveysPage();
    @Given("User is on the fidexio login  page")
    public void userIsOnTheFidexioLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("User\\(posmanager) enters {string} and {string} as credentials")
    public void userPosmanagerEntersAndAsCredentials(String username, String password) {
        SurveysPage.username66.sendKeys(username);
        SurveysPage.password66.sendKeys(password);
    }

    @Then("User clicks to login button")
    public void userClicksToLoginButton() {
        SurveysPage.loginBtn.click();
    }





    }
