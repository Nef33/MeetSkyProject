package com.meet_sky.pages;

import com.meet_sky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FolderPage {

    public FolderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"fileList\"]")
    public WebElement folders;

    public List<WebElement> FolderElements(){
        List<WebElement> folderElements = folders.findElements(By.tagName("tr"));
        return folderElements;
    }


    public List<String> folderNames(){
        List<String> folderNames = new ArrayList<>();
        for (   WebElement folderElement :   FolderElements()){
            folderNames.add(folderElement.getText());
        }
        return folderNames;
    }

    public List<String> sortedFolderNames(){
        List<String> sortedFolderNames = new ArrayList<>(folderNames());

            Collections.sort(sortedFolderNames);

        return sortedFolderNames;
    }

    public List<String> reverseSortedFolderNames(){
        List<String> reverseSortedFolderNames = new ArrayList<>(folderNames());

        Collections.sort(reverseSortedFolderNames);
        Collections.sort(reverseSortedFolderNames);
        Collections.reverse(reverseSortedFolderNames);
        return reverseSortedFolderNames;
    }

    public void clickFolderBarText(String text){
        String locator = "(//a[@data-sort='"+text+"'])[1]";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        element.click();
    }


}
