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
       if(SurveysPage.CreateBtn.isDisplayed()){
           System.out.println("Create Btn is displayed");
       }else{
           System.out.println("test failed");
       }
        BrowserUtils.sleep(5);
      Assert.assertTrue(SurveysPage.ImportBtn.isDisplayed());
      if(SurveysPage.ImportBtn.isDisplayed()){
          System.out.println("Import Btn is displayed");
      }else{
          System.out.println("test failed");
      }


    }




    @And("user clicks to the Create button")
    public void userClicksToTheCreateButton() {
        BrowserUtils.sleep(5);
        SurveysPage.ClickCreateBtn.click();
        BrowserUtils.sleep(5);
        Assert.assertTrue(SurveysPage.SurveyTitle.isDisplayed());
        if (SurveysPage.SurveyTitle.isDisplayed()) {
            System.out.println("Test Passed");

        }else {
            System.out.println("Test Failed");
        }
    }

    @And("User must enter a survey title to create a survey.")
    public void userMustEnterASurveyTitleToCreateASurvey() {
        SurveysPage.SurveyTitle.sendKeys("First Survey");
    }

    @Then("User click to Save button")
    public void userClickToSaveButton() {
        SurveysPage.SaveBtn.click();
        BrowserUtils.sleep(5);
        if (SurveysPage.FirstSurvey.isDisplayed()){
            System.out.println("First Survey Created");
        }
    }
}
