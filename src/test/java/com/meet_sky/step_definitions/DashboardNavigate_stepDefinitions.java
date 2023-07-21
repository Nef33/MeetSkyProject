package com.meet_sky.step_definitions;

import com.meet_sky.pages.DashboardPage;
import com.meet_sky.utilities.BrowserUtils;
import com.meet_sky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DashboardNavigate_stepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();

    @And("user is on the contact page")
    public void user_is_on_the_contact_page() {
        dashboardPage.clickMenuByText("Contacts");
    }

    @Then("user should click to dashboard icon and back to home page")
    public void user_should_click_to_dashboard_icon_and_back_to_home_page() {

        dashboardPage.clickMenuByText("Dashboard");

        String expectedTitle ="Dashboard - QA - Meetsky";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(expectedTitle, actualTitle);

    }


}
