package com.meet_sky.step_definitions;

import com.meet_sky.pages.DashboardPage;
import com.meet_sky.pages.SearchFileFunctionPage;
import com.meet_sky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class searchFileStepDefinitions {


    SearchFileFunctionPage searchFileFunctionPage = new SearchFileFunctionPage();
    DashboardPage dashboardPage = new DashboardPage();


    @And("user click to contact page")
    public void userClickToContactPage() {
        dashboardPage.clickMenuByText("Contacts");
    }

    @When("user type file  name  in glass icon")
    public void user_type_file_name_in_glass_icon() {

        searchFileFunctionPage.SearchIcon.click();
        searchFileFunctionPage.SearchBar.sendKeys("Test");
        searchFileFunctionPage.FileIcon.click();
        searchFileFunctionPage.closeIcon.click();
    }

    @Then("user should see file in side page")
    public void user_should_see_file_in_side_page() {


        List<WebElement> listItems = Driver.getDriver().findElements(By.xpath("//*[@id=\"app-content-files\"]"));

        String documentName = "Test.jpg";
        boolean isDocumentInList = false;


        for (WebElement item : listItems) {
            if (item.getText().contains(documentName)) {
                isDocumentInList = true;
                break;
            }

            System.out.println("documentName = " + documentName);

//        String actualFileName = searchFileFunctionPage.FileName.getText();
//        String expectedFileName = "Test.jpg";
//
//        Assert.assertEquals(actualFileName,expectedFileName);


            System.out.println("searchFunctionPage.SideBarIcon.isDisplayed() = " + searchFileFunctionPage.SideBarIcon.isDisplayed());

        }


    }

}
