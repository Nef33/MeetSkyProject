package com.meet_sky.step_definitions;

import com.meet_sky.pages.ContactsModulePage;
import com.meet_sky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactsModuleStepDefinitions {

         ContactsModulePage contactsModulePage = new ContactsModulePage();


    @When("user is click the contacts module")
    public void user_is_click_the_contacts_module() {

        contactsModulePage.contactsModule.click();
    }

    @And("user is click the new contact button")
    public void user_is_click_the_new_contact_button() {

        contactsModulePage.newContact.click();
    }

    @Then("user creates newName")
    public void userCreatesNewName() {
        contactsModulePage.createName.sendKeys("Yasmin" + Keys.ENTER);
    }


    @When("user clicks the all contacts button")
    public void user_clicks_the_all_contacts_button() {

        contactsModulePage.allContact.click();
    }
    @Then("user should see all total contact number")
    public void user_should_see_all_total_contact_number() {
        contactsModulePage.totalNumber.click();
    }

    @And("user clicks img icon")
    public void userClicksImgIcon() {

        contactsModulePage.imgIcon.click();
    }

    @And("users clicks choose from files")
    public void usersClicksChooseFromFiles() {


       // Actions actions = new Actions(Driver.getDriver());

       // actions.moveToElement(contactsModulePage.chooseFromFiles).build().perform();

        contactsModulePage.chooseFromFiles.click();
    }

    @And("users picks some img")
    public void usersPicksSomeImg() {
        //Actions actions = new Actions(Driver.getDriver());
       // actions.moveToElement(contactsModulePage.getImgIcon).click();
        contactsModulePage.getImgIcon.click();
    }

    @Then("user clicks choose button")
    public void userClicksChooseButton() {
        contactsModulePage.chooseButton.click();
    }

  /*  @Then("user should see new picture")
    public void userShouldSeeNewPicture() {
        contactsModulePage.newPicture.click();
    }*/

    @And("user clicks three dot button")
    public void userClicksThreeDotButton() {
        contactsModulePage.threeDotButton.click();
    }

    @Then("user clicks delete button")
    public void userClicksDeleteButton() {

        Actions actions = new Actions(Driver.getDriver());
      actions.moveToElement(contactsModulePage.deleteButton).click();


    }

}
