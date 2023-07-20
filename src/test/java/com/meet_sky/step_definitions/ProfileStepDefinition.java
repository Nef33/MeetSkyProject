package com.meet_sky.step_definitions;

import com.meet_sky.pages.DashboardPage;
import com.meet_sky.pages.ProfilePage;
import com.meet_sky.utilities.BrowserUtils;
import com.meet_sky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProfileStepDefinition {

    DashboardPage dashboardPage = new DashboardPage();
    ProfilePage profilePage = new ProfilePage();

    @When("user on the Profile module")
    public void user_on_the_profile_module() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(dashboardPage.ProfileButton).click().perform();
        dashboardPage.MenuButton.click();
        BrowserUtils.sleep(1);
        profilePage.EditButton.click();


    }

    @And("user navigate to the Profile module")
    public void user_navigate_to_the_profile_module() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(dashboardPage.ProfileButton).click().perform();
        BrowserUtils.sleep(1);


    }

    @Then("user Full name and username should be the same.")
    public void user_full_name_and_username_should_be_the_same() {


        String actual = dashboardPage.UserName.getText();
        String actual2 = profilePage.TextOfProfile.getText();

        System.out.println("actual = " + actual);
        System.out.println("actual2 = " + actual2);


        Assert.assertTrue(actual2.contains("MaksymVoloshyn"));
        Assert.assertTrue(actual.contains("MaksymVoloshyn"));


    }

    @When("user enter a proper email {string} in the Email input box")
    public void user_enter_a_proper_email_in_the_email_input_box(String email) {

        profilePage.EmailInput.sendKeys(email);

    }

    @When("user click on the add button")
    public void user_click_on_the_add_button() {

        profilePage.AddButton.click();
        BrowserUtils.sleep(1);

    }

    @Then("my email address should be updated")
    public void my_email_address_should_be_updated() {

        Assert.assertTrue(profilePage.AdditionalEmails.isDisplayed());

    }


    @Then("user select a different language from the Language dropdown and language preference should be updated")
    public void userSelectADifferentLanguageFromTheLanguageDropdownAndLanguagePreferenceShouldBeUpdated() {
        Select select = new Select(profilePage.languageSelect);
        select.selectByVisibleText("Українська");
        BrowserUtils.sleep(1);
        Assert.assertTrue(profilePage.languageSelect.isDisplayed());

    }
}
