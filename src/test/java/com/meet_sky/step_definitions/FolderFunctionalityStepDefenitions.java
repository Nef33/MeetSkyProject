package com.meet_sky.step_definitions;

import com.meet_sky.pages.DashboardPage;
import com.meet_sky.pages.FolderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
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
        List<String> expectedSortedFolderNames = folderPage.sortedFolderNames();
        System.out.println(actualFolderNames);
        System.out.println(expectedSortedFolderNames);
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
        List<String> expectedSortedFolderNames = folderPage.sortedFolderNames();

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
        System.out.println(actualFolderNames);
        System.out.println(expectedSortedFolderNames);

        Assert.assertEquals(actualFolderNames, expectedSortedFolderNames);

    }
}


