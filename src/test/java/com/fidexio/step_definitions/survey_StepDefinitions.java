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

    @Then("Create button display instead of Discard button.")
    public void createButtonDisplayInsteadOfDiscardButton() {
        BrowserUtils.sleep(5);
        Assert.assertTrue(SurveysPage.DisplayCreateBtn.isDisplayed());
        if (SurveysPage.DisplayCreateBtn.isDisplayed()){
            System.out.println("Create Btn is displayed");
        }else{
            System.out.println("create Btn is not displayed");
        }
    }

    @And("Attachment\\(s) buttons should be displayed.")
    public void attachmentSButtonsShouldBeDisplayed() {
        BrowserUtils.sleep(5);
        System.out.println("Attachments Btn is displayed= " + SurveysPage.AttachmentsBtnDisplayed.isDisplayed());
    }

    @And("Action buttons should be displayed.")
    public void actionButtonsShouldBeDisplayed() {
        BrowserUtils.sleep(5);

        System.out.println("SAction Btn is displayed = " + SurveysPage.ActionBtnIsDisplayed.isDisplayed());


    }

    @And("Test Survey buttons should be displayed.")
    public void testSurveyButtonsShouldBeDisplayed() {
        BrowserUtils.sleep(5);
        System.out.println("Test Survey Btn is displayed= " + SurveysPage.TestSurveyDisplayed.isDisplayed());
    }

    @And("Print Survey buttons should be displayed.")
    public void printSurveyButtonsShouldBeDisplayed() {
        BrowserUtils.sleep(5);
        System.out.println("Print Survey is displayed = " + SurveysPage.PrintSurveyBtn.isDisplayed());

    }

    @And("Share and invite by email buttons should be displayed.")
    public void shareAndInviteByEmailButtonsShouldBeDisplayed() {
        BrowserUtils.sleep(5);
        System.out.println("Share and Invite by Email Btn is Displayed = " + SurveysPage.ShareAndInviteByEmailBtn.isDisplayed());

    }

    @Then("View result buttons should be displayed.")
    public void viewResultButtonsShouldBeDisplayed() {
        BrowserUtils.sleep(5);
        System.out.println("View Result Btn is displayed  = " + SurveysPage.ViewResultBtn.isDisplayed());
    }





  /*  @Then("Add an item should be not displayed.")
    public void addAnItemShouldBeNotDisplayed() {
        WebElement addAnItemButton = Driver.getDriver().findElement(By.id("add-an-item-button"));
        Assert.assertFalse(addAnItemButton.isDisplayed());
    }

   */
  /*@Then("User can choose \"User can come back in the previous page")
  public void userCanChooseUserCanComeBackInThePreviousPage() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
  }

   */

    @Then("Survey created message should be displayed under the survey form sheet,")
    public void surveyCreatedMessageShouldBeDisplayedUnderTheSurveyFormSheet() {
        BrowserUtils.sleep(5);
        System.out.println("Survey created message is displayed " + SurveysPage.Message.isDisplayed());

    }

    @And("Verify that the user should be able to s ee created survey is listed")
    public void verifyThatTheUserShouldBeAbleToSEeCreatedSurveyIsListed() {
        BrowserUtils.sleep(5);
        SurveysPage.accessList.click();
        BrowserUtils.sleep(5);
        System.out.println("Survey List is displayed = " + SurveysPage.TitleList.isDisplayed());

    }
}
