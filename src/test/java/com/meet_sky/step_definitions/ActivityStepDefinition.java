package com.meet_sky.step_definitions;

import com.meet_sky.pages.ActivityPage;
import com.meet_sky.pages.DashboardPage;
import com.meet_sky.pages.LoginPage;
import com.meet_sky.utilities.BrowserUtils;
import com.meet_sky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.util.AsciiString;
import org.apache.velocity.runtime.directive.contrib.For;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;
import java.util.*;


public class ActivityStepDefinition {

    DashboardPage dashboardPage = new DashboardPage();
    ActivityPage activityPage = new ActivityPage();

    @Given("the user is on the Activity module")
    public void the_user_is_on_the_activity_module() {

        dashboardPage.clickMenuByText("Activity");

    }

    @When("the user views the listed items")
    public void the_user_views_the_listed_items() {

        Assert.assertTrue(activityPage.allActivities.isDisplayed());

    }

    @Then("the user should be able to see all items")
    public void the_user_should_be_able_to_see_all_items() {

        for (WebElement eachActivity : activityPage.eachActivities) {
            if (eachActivity.isDisplayed()) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }

        }

    }

    @Then("the user should see the items ordered by newest to oldest")
    public void the_user_should_see_the_items_ordered_by_newest_to_oldest() {


        List<String> times = new ArrayList<>();
        for (WebElement time : activityPage.allDates) {
            times.add(time.getText());
        }
        System.out.println("dateStrings = " + times);

        List<String> sortedDates = new ArrayList<>(times);
        Collections.max(sortedDates);
        System.out.println("sortedDates = " + sortedDates);
        Assert.assertEquals(times, sortedDates);
    }


    @When("the user scrolls to the end of the All Activities tab")
    public void the_user_scrolls_to_the_end_of_the_all_activities_tab() {


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(1);
        for (int i = 0; i < 30; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            //js.executeScript("window.scrollBy(0,20050)");

        }


        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        //WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"no_more_activities\"]")));
        //js.executeScript("arguments[0].scrollIntoView(true);",element);
    }


    @Then("the user should see the message {string}")
    public void theUserShouldSeeTheMessage(String expectedMessage) {

        String actualMessage = activityPage.NoMoreEventsToLoadMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }
}
