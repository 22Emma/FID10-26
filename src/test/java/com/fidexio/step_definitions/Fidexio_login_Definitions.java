package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.FidexioPage;
import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Fidexio_login_Definitions extends BasePage{

    LoginPage loginPage=new LoginPage();
    FidexioPage fidexioPage=new FidexioPage();

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





    }


    @When("user\\(sales) enters {string} and {string} as credentials")
    public void userSalesEntersAndAsCredentials(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
    }

    @Then("user\\(sales) is on the dashboard")
    public void userSalesIsOnTheDashboard() {
        BrowserUtils.sleep(5);
        Assert.assertEquals("#Inbox - Odoo",Driver.getDriver().getTitle());


    }
}
