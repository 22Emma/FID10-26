package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.LoginPage;
import com.fidexio.pages.SurveysPage;
import com.fidexio.pages.VehicleContractsPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class survey_StepDefinitions  extends BasePage {
    SurveysPage SurveysPage =new SurveysPage();

    @Given("user is on the home  page clicks to the surveys options")
    public void userIsOnTheHomePageClicksToTheSurveysOptions() {
        sectionSurveys.click();
    }



    @Then("create,import are displayed and user is able click to them.")
    public void createImportAreDisplayedAndUserIsAbleClickToThem() {
        BrowserUtils.sleep(3);
       Assert.assertTrue(SurveysPage.CreateBtn.isDisplayed());

        BrowserUtils.sleep(3);
      Assert.assertTrue(SurveysPage.ImportBtn.isDisplayed());



    }




    @And("user clicks to the Create button")
    public void userClicksToTheCreateButton() {
        BrowserUtils.sleep(5);
        SurveysPage.ClickCreateBtn.click();
        BrowserUtils.sleep(5);
        Assert.assertTrue(SurveysPage.SurveyTitle.isDisplayed());

    }

    @And("User must enter a survey title to create a survey.")
    public void userMustEnterASurveyTitleToCreateASurvey() {
        SurveysPage.SurveyTitle.sendKeys("First Survey");
    }

    @Then("User click to Save button")
    public void userClickToSaveButton() {
        BrowserUtils.sleep(5);
        SurveysPage.SaveBtn.click();


    }

    @Then("Create button display instead of Discard button.")
    public void createButtonDisplayInsteadOfDiscardButton() {
        BrowserUtils.sleep(5);
        Assert.assertTrue(SurveysPage.DisplayCreateBtn.isDisplayed());

    }

    @And("Attachment\\(s) buttons should be displayed.")
    public void attachmentSButtonsShouldBeDisplayed() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(SurveysPage.AttachmentsBtnDisplayed.isDisplayed());


    }

    @And("Action buttons should be displayed.")
    public void actionButtonsShouldBeDisplayed() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(SurveysPage.ActionBtnIsDisplayed.isDisplayed());



    }

    @And("Test Survey buttons should be displayed.")
    public void testSurveyButtonsShouldBeDisplayed() {
        BrowserUtils.sleep(3);
        Assert.assertTrue( SurveysPage.TestSurveyDisplayed.isDisplayed());

    }

    @And("Print Survey buttons should be displayed.")
    public void printSurveyButtonsShouldBeDisplayed() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(SurveysPage.PrintSurveyBtn.isDisplayed());


    }

    @And("Share and invite by email buttons should be displayed.")
    public void shareAndInviteByEmailButtonsShouldBeDisplayed() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(SurveysPage.ShareAndInviteByEmailBtn.isDisplayed());


    }

    @Then("View result buttons should be displayed.")
    public void viewResultButtonsShouldBeDisplayed() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(SurveysPage.ViewResultBtn.isDisplayed());

    }
    @And("Add an item is displayed")
    public void addAnItemIsDisplayed() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(SurveysPage.AddAnItem.isDisplayed());
    }





    @Then("Add an item should be not displayed.")
    public void addAnItemShouldBeNotDisplayed() {

        try {

            System.out.println("Add an item is displayed = " + SurveysPage.AddAnItem.isDisplayed());

        }catch (StaleElementReferenceException e){

            System.out.println("-->StaleElementReferenceException exception is thrown");
            System.out.println("-->This means the web element is completely deleted from the page");
            System.out.println("Add item is displayed = false");

        }
    }


  @Then("User can choose \"User can come back in the previous page")
  public void userCanChooseUserCanComeBackInThePreviousPage() throws Throwable {
      Driver.getDriver().navigate().back();
  }




    @Then("Survey created message should be displayed under the survey form sheet,")
    public void surveyCreatedMessageShouldBeDisplayedUnderTheSurveyFormSheet() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(SurveysPage.Message.isDisplayed());


    }

    @And("Verify that the user should be able to s ee created survey is listed")
    public void verifyThatTheUserShouldBeAbleToSEeCreatedSurveyIsListed() {
        BrowserUtils.sleep(5);
        SurveysPage.accessList.click();
        BrowserUtils.sleep(5);
        Assert.assertTrue(SurveysPage.TitleList.isDisplayed());


    }


}
