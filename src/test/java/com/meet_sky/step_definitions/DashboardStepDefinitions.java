package com.meet_sky.step_definitions;



import com.meet_sky.pages.DashboardPage;
import com.meet_sky.pages.LoginPage;
import com.meet_sky.utilities.ConfigurationReader;
import com.meet_sky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DashboardStepDefinitions {

    DashboardPage dashboardPage=new DashboardPage();

    @When("each module displays on the dashboard page")
    public void each_module_displays_on_the_dashboard_page() throws InterruptedException {
        Thread.sleep(4);
        for (WebElement each : dashboardPage.listOfDashBoardModule){
            Assert.assertTrue(each.isDisplayed());



      }
    }
    @Then("user see module name of the modules")
    public void user_see_module_name_of_the_modules(List<String>expectedModules) {
        List<String>actualModules=new ArrayList<>();

            for (WebElement eachModule : dashboardPage.listOfDashBoardModule) {

                actualModules.add(eachModule.getAttribute("data-id"));
            }
           Assert.assertEquals(expectedModules,actualModules);

        }


    @Then("user see the username on the dashboard")
    public void userSeeTheUsernameOnTheDashboard() {
        String expectedName=dashboardPage.expectedUserNameOnDashboard.getText();
        String actualName=dashboardPage.actualUserNameOnDashboard.getText();

        Assert.assertTrue(expectedName.contains(actualName));

    }

    @When("user clicks on Customize Button")
    public void userClicksOnCustomizeButton() {
        dashboardPage.CustomizeButton.click();
    }


    @Then("user should be able to select on each widget")
    public void userShouldBeAbleToSelectOnEachWidget() throws InterruptedException {

        for (WebElement eachWidget : dashboardPage.widgets) {

            if(!(eachWidget.isEnabled())) {
                eachWidget.click();
            }

            Thread.sleep(4);
        }
        for (WebElement widget : dashboardPage.widgets) {
            Assert.assertTrue(widget.isEnabled());

        }
    }

    @When("user clicks on Status button")
    public void userClicksOnStatusButton() {
        dashboardPage.statusButton.click();

    }

    @Then("user is able to select any status option")
    public void userIsAbleToSelectAnyStatusOption() {
        dashboardPage.awayStatus.click();

        dashboardPage.setStatusButton.click();


    }

    @Then("user is able to see the selected status on dashboard")
    public void userIsAbleToSeeTheSelectedStatusOnDashboard() {
      String actualStatus=  dashboardPage.statusButton.getText();
        Assert.assertEquals("Away",actualStatus);

    }
}



