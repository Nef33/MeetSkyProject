package com.meet_sky.step_definitions;

import com.meet_sky.pages.DashboardPage;
import com.meet_sky.pages.FilePage;
import com.meet_sky.utilities.BrowserUtils;
import com.meet_sky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FileFunctionalityStepDef {
    DashboardPage dashboardPage = new DashboardPage();
    FilePage filePage = new FilePage();

    @When("user clicks on {string} module")
    public void user_clicks_on_module(String string) {
        dashboardPage.clickMenuByText("Files");
    }

    @When("user clicks three dots menu")
    public void user_clicks_three_dots_menu() {
        BrowserUtils.sleep(3);
        filePage.ThreeDotsMenu.click();

    }

    @Then("user add a file to favorites")
    public void user_add_a_file_to_favorites() {
        filePage.FavoritesIcon.click();
        filePage.FavoritesBTN.click();

    }


    @Then("user sees file under favorites tab")
    public void userSeesFileUnderFavoritesTab() {

        String expectedFileName = "Talk";
        String actualFileName = filePage.FileName.getText();
        Assert.assertEquals(expectedFileName, actualFileName);

    }



    @Then("user clicks rename button")
    public void userClicksRenameButton() {

        filePage.RenameBTN.click();

    }

    @And("user clicks Details button")
    public void userClicksDetailsButton() {
        filePage.DetailsIcon.click();
    }

    @When("user clicks on Comments Option")
    public void userClicksOnCommentsOption() {
        filePage.CommentsBTN.click();
    }

    @Then("user enters comment and clicks")
    public void userEntersCommentAndClicks() {
        BrowserUtils.sleep(2);
        filePage.CommentBox.sendKeys("Hello" + Keys.ENTER);
    }


}
