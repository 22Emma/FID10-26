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
     CalendarPage calendarPage=new CalendarPage();

    @Given("User is on fidexio homepage and user clicks to Calendar section.")
    public void user_is_on_fidexio_homepage_and_user_clicks_to_calendar_section() {
        BrowserUtils.sleep(3);
         sectionCalender.click();

    }

    @When("User is on the calender section and weekly display is displayed by default")
    public void user_is_on_the_calender_section_and_weekly_display_is_displayed_by_default() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(calendarPage.weekButton.getText().contains("Week"));

    }

    @And("User can click on the time box and create new event.")
    public void userCanClickOnTheTimeBoxAndCreateNewEvent() {

    }

    @Then("User can see event details by clicking the event.")
    public void userCanSeeEventDetailsByClickingTheEvent() {
        
    }

    @And("User can edit the created event details.")
    public void userCanEditTheCreatedEventDetails() {
        
    }

    @Given("User is on fidexio homepage and user clicks to Calender section.")
    public void userIsOnFidexioHomepageAndUserClicksToCalenderSection() {
        
    }

    @And("User can switch between day, week and month sections.")
    public void userCanSwitchBetweenTheseSections() {
        BrowserUtils.sleep(2);
        calendarPage.dayButton.click();
        BrowserUtils.sleep(2);
        Assert.assertTrue(calendarPage.dayTitle.getText().contains("25"));
        BrowserUtils.sleep(2);
        calendarPage.monthButton.click();
        BrowserUtils.sleep(2);
        Assert.assertTrue(calendarPage.monthTitle.getText().contains("March"));
        BrowserUtils.sleep(2);
        calendarPage.weekButton.click();

    }


}
