package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.CalendarPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_tw.並且;
import org.junit.Assert;

public class Calendar_StepDefinitions extends BasePage {
    CalendarPage calendarPage = new CalendarPage();

    @Given("User is on fidexio homepage and user clicks to Calendar section.")
    public void user_is_on_fidexio_homepage_and_user_clicks_to_calendar_section() {
        sectionCalender.click();

    }

    @When("User is on the calender section and weekly display is displayed by default")
    public void user_is_on_the_calender_section_and_weekly_display_is_displayed_by_default() {
        Assert.assertTrue(calendarPage.weekButton.getText().contains("Week"));

    }

    @And("User can click on the time box and create new event.")
    public void userCanClickOnTheTimeBoxAndCreateNewEvent() {
        BrowserUtils.sleep(3);
        calendarPage.allSectionFirstDay.click();
        BrowserUtils.sleep(3);
        calendarPage.createPopUpTitle.isDisplayed();
        //BrowserUtils.sleep(3);
        calendarPage.summaryInputBox.sendKeys("First Event");
        //BrowserUtils.sleep(3);
        calendarPage.createButton.click();
      //  BrowserUtils.sleep(3);
        calendarPage.createdEvent.isDisplayed();
        //delete the meeting
        calendarPage.createdEvent.click();
        calendarPage.deleteButton.click();
        calendarPage.okButton.click();

    }

    @Then("User can see event details by clicking the event.")
    public void userCanSeeEventDetailsByClickingTheEvent() {
        calendarPage.createdEvent.click();
        calendarPage.editPopUpTitle.isDisplayed();
        calendarPage.closePopup.click();
        //delete the meeting
        calendarPage.createdEvent.click();
        calendarPage.deleteButton.click();
        calendarPage.okButton.click();

    }

    @And("User can edit the created event details.")
    public void userCanEditTheCreatedEventDetails() {
        calendarPage.createdEvent.click();
        calendarPage.editButton.click();
        calendarPage.changeName.click();
        calendarPage.changeName.clear();
        calendarPage.changeName.sendKeys(" name changed");
        calendarPage.saveButton.click();
//delete the meeting
        calendarPage.createdEvent.click();
        calendarPage.deleteButton.click();
        calendarPage.okButton.click();

    }

    @And("User can switch between day, week and month sections.")
    public void userCanSwitchBetweenTheseSections() {
        calendarPage.dayButton.click();
        BrowserUtils.sleep(2);
        Assert.assertTrue(calendarPage.dayTitle.getText().contains("Meetings"));
        calendarPage.monthButton.click();
        Assert.assertTrue(calendarPage.monthTitle.getText().contains("April"));
        calendarPage.weekButton.click();

    }


    @And("User can click on the time box and create new events.")
    public void userCanClickOnTheTimeBoxAndCreateNewEvents() {
        BrowserUtils.sleep(1);
        calendarPage.allSectionFirstDay.click();
        calendarPage.createPopUpTitle.isDisplayed();
        calendarPage.summaryInputBox.sendKeys("First Event");
        calendarPage.createButton.click();
        calendarPage.createdEvent.isDisplayed();

    }

    @Then("User can see event details by clicking the events.")
    public void userCanSeeEventDetailsByClickingTheEvents() {
        calendarPage.createdEvent.click();
        calendarPage.editPopUpTitle.isDisplayed();
        calendarPage.closePopup.click();
    }
}
