package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class Fidexio_login_Definitions {

    LoginPage loginPage=new LoginPage();

    @Given("user is on the fidexio login  page")
    public void user_is_on_the_fidexio_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user\\(pos) enters {string} and {string} as credentials")
    public void user_pos_enters_and_as_credentials(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);

    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user\\(pos) is on the dashboard")
    public void user_pos_is_on_the_dashboard() {
        BrowserUtils.sleep(5);
      Assert.assertEquals("#Inbox - Odoo",Driver.getDriver().getTitle());
      boolean checkProfile =loginPage.posProfileName.getText().contains("POS");
      Assert.assertTrue(checkProfile);

    }

    @When("user\\(sales) enters {string} and {string} as credentials")
    public void user_sales_enters_and_as_credentials(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
    }

    @Then("user\\(sales) is on the dashboard")
    public void user_sales_is_on_the_dashboard() {
        BrowserUtils.sleep(5);
        Assert.assertEquals("#Inbox - Odoo",Driver.getDriver().getTitle());
        boolean checkProfile =loginPage.salesProfileName.getText().contains("Sales");
        Assert.assertTrue(checkProfile);
    }


    @When("user enter number in the Odometer Value input box.")
    public void userEnterNumberInTheOdometerValueInputBox() {

    }


}

