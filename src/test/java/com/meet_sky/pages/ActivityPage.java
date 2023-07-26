package com.meet_sky.pages;

import com.meet_sky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityPage {

    public ActivityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "app-navigation")
    public WebElement allActivities;

    @FindBy(xpath = "//a[@data-navigation]")
    public  List<WebElement> eachActivities;

    @FindBy(xpath = "//span[@class='activitytime has-tooltip live-relative-timestamp']")
    public List<WebElement> allDates;

    @FindBy(id = "no_more_activities")
    public WebElement NoMoreEventsToLoadMessage;

}