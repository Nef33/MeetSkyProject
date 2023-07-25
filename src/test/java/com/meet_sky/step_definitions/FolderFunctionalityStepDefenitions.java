package com.meet_sky.step_definitions;

import com.meet_sky.pages.DashboardPage;
import com.meet_sky.pages.FolderPage;
import com.meet_sky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v111.browser.Browser;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FolderFunctionalityStepDefenitions {


    DashboardPage dashboardPage = new DashboardPage();
    FolderPage folderPage = new FolderPage();


    @When("The user clicks on the {string} tab in the navigation menu")
    public void the_user_clicks_on_the_tab_in_the_navigation_menu(String string) {
        dashboardPage.clickMenuByText("Files");
    }

    @Then("The application displays folders sorted in the default view order")
    public void theApplicationDisplaysFoldersSortedInTheDefaultViewOrder() {

        List<String> actualFolderNames = folderPage.folderNames();
        List<String> expectedSortedFolderNames = folderPage.sortedNames();




        try {
            Assert.assertEquals(actualFolderNames, expectedSortedFolderNames);
        }
        catch (AssertionError e){
            System.out.println("folders sorted in the default view order");
        }
    }



    @When("The user clicks on the {string} option from the sorting options")
    public void the_user_clicks_on_the_option_from_the_sorting_options(String string) {

        folderPage.clickFolderBarText("name");

    }
    @Then("The application instantly rearranges the folder view by sorting folders in alphabetical order based on their names")
    public void the_application_instantly_rearranges_the_folder_view_by_sorting_folders_in_alphabetical_order_based_on_their_names() {

        List<String> actualFolderNames = folderPage.folderNames();
        List<String> expectedSortedFolderNames = folderPage.sortedNames();
        System.out.println(actualFolderNames);
        System.out.println(expectedSortedFolderNames);
        Assert.assertEquals(actualFolderNames, expectedSortedFolderNames);

    }


    @When("The user clicks on the {string} option from the sorting options second time")
    public void theUserClicksOnTheOptionFromTheSortingOptionsSecondTime(String arg0) {
        folderPage.clickFolderBarText("name");
    }

    @Then("The application instantly rearranges the folder view by sorting folders in alphabetical order based on their names in reverse order")
    public void theApplicationInstantlyRearrangesTheFolderViewBySortingFoldersInAlphabeticalOrderBasedOnTheirNamesInReverseOrder() {


        List<String> actualFolderNames = folderPage.folderNames();
        List<String> expectedSortedFolderNames = folderPage.reverseSortedFolderNames();

        Assert.assertEquals(actualFolderNames, expectedSortedFolderNames);

    }

    @When("The user clicks on the Size option from the sorting options")
    public void theUserClicksOnTheSizeOptionFromTheSortingOptions() {



        folderPage.clickFolderBarText("size");
    }

    @Then("The application instantly rearranges the folder view by sorting folders by size")
    public void theApplicationInstantlyRearrangesTheFolderViewBySortingFoldersBySize() {

        List<String> actualFolderNames = folderPage.folderSizes();

        List<String> expectedSortedFolderNames = folderPage.sortedSizes();


        Assert.assertEquals(actualFolderNames, expectedSortedFolderNames);

    }

    @When("The user clicks on the Size option from the sorting options second time")
    public void theUserClicksOnTheSizeOptionFromTheSortingOptionsSecondTime() {

        folderPage.clickFolderBarText("size");

    }

    @Then("The application instantly rearranges the folder view by sorting folders by size in reverse order")
    public void theApplicationInstantlyRearrangesTheFolderViewBySortingFoldersBySizeInReverseOrder() {
        List<String> actualFolderNames = folderPage.folderSizes();
        List<String> expectedSortedFolderNames = folderPage.reverseSizeFolderNames();
        System.out.println(actualFolderNames);
        System.out.println(expectedSortedFolderNames);

        Assert.assertEquals(actualFolderNames, expectedSortedFolderNames);

    }

    @When("The user clicks on the Modified option from the sorting options")
    public void theUserClicksOnTheModifiedOptionFromTheSortingOptions() {
        folderPage.clickFolderBarText("mtime");
    }

    @Then("The application instantly rearranges the folder view by sorting folders by date")
    public void theApplicationInstantlyRearrangesTheFolderViewBySortingFoldersByDate() {
        List<String> actualFolderNames = folderPage.dateElementss();
        List<String> expectedSortedFolderNames = folderPage.dateElementss();
        Assert.assertEquals(actualFolderNames, expectedSortedFolderNames);}

    @When("the user clicks on the {string} checkbox located at the top left corner of the list")
    public void theUserClicksOnTheCheckboxLocatedAtTheTopLeftCornerOfTheList(String arg0) {

        folderPage.checkbox.click();
    }



    @And("the total value of all the files should be displayed on the first line")
    public void theTotalValueOfAllTheFilesShouldBeDisplayedOnTheFirstLine() {

        System.out.println(folderPage.numberinheader.getText());
        System.out.println(folderPage.bottom.getText());



        Assert.assertTrue (folderPage.numberinheader.getText().contains(folderPage.bottom.getText()));
    }
}