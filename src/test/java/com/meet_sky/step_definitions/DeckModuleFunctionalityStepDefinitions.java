package com.meet_sky.step_definitions;

import com.meet_sky.pages.DashboardPage;
import com.meet_sky.pages.DeckModulePage;
import com.meet_sky.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DeckModuleFunctionalityStepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    DeckModulePage deckModulePage = new DeckModulePage();


    @Given("user is on the Deck Module")
    public void user_is_on_the_deck_module() {

        dashboardPage.clickMenuByText("Deck");
    }

    @And("user clicks on three line navigation bar")
    public void userClicksOnThreeLineNavigationBar() {
        deckModulePage.buttonOpenNavigation.click();
    }

    @When("user clicks on Add boards")
    public void user_clicks_on_add_boards() {

        deckModulePage.addBoardIcon.click();

    }

    @Then("user types a new board name {string}")
    public void userTypesANewBoardName(String boardName) {
        deckModulePage.inputBox.sendKeys(boardName);
    }

    @Then("user click on arrow or hit the Enter key on keyboard")
    public void user_click_on_arrow_or_hit_the_enter_key_on_keyboard() {
        deckModulePage.inputBoxSubmit.click();
    }

    @Then("new board should be displayed under All boards")
    public void new_board_should_be_displayed_under_all_boards() {
        Assert.assertTrue("Board name ", deckModulePage.boardName.isDisplayed());
    }

    @When("User choose a board name {string}")
    public void user_choose_a_board_name(String boardName) {
        //deckModulePage.buttonOpenNavigation.click();

        deckModulePage.boardName.click();
    }


    @Then("user clicks s on Add list button")
    public void user_clicks_s_on_add_list_button() {
        deckModulePage.addListButton.click();

    }

    @Then("types a new list name {string}")
    public void types_a_new_list_name(String list) {

        deckModulePage.listInputBox.sendKeys(list);
    }


    @Then("user clicks on arrow or hit the Enter key on keyboard")
    public void user_clicks_on_arrow_or_hit_the_enter_key_on_keyboard() {
        deckModulePage.addListArrow.click();
    }

    @Then("new list should be displayed")
    public void new_list_should_be_displayed() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(deckModulePage.list.isDisplayed());
    }


    @When("user clicks on Add card button")
    public void user_clicks_on_add_card_button() {

        deckModulePage.boardName.click();
        deckModulePage.addListButton.click();
        deckModulePage.listInputBox.sendKeys("list");
        deckModulePage.addListArrow.click();
        deckModulePage.addCardIcon.click();
    }


    @When("types a new card name {string}")
    public void types_a_new_card_name(String card) {
        deckModulePage.cardInputBox.sendKeys(card);
    }

    @Then("user clicks on arrow")
    public void user_clicks_on_arrow() {
        deckModulePage.cardSubmitBtn.click();
    }

    @Then("new card is displayed")
    public void new_card_is_displayed() {
        Assert.assertTrue(deckModulePage.newCard.isDisplayed());

    }


    @When("user clicks on three dots on the related card {string}")
    public void user_clicks_on_three_dots_on_the_related_card(String card) {

        deckModulePage.boardName.click();

        deckModulePage.addCardIcon.click();
        deckModulePage.cardInputBox.sendKeys(card);
        deckModulePage.cardSubmitBtn.click();


        deckModulePage.threeDotCardMenuBtn.click();
    }

    @And("selects Assign to me")
    public void selects_assign_to_me() {

        deckModulePage.assignToMe.click();
    }

    @Then("user profile icon should be displayed near the three dots icon")
    public void user_profile_icon_should_be_displayed_near_the_three_dots_icon() {
        Assert.assertTrue("User profile is displayed", deckModulePage.userProfileIcon.isDisplayed());
    }


}
