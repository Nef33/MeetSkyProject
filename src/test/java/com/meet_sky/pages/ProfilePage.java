package com.meet_sky.pages;

import com.meet_sky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage {

    public ProfilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/h2/a")
    public WebElement EditButton;

    @FindBy(id = "displayname")
    public WebElement FullName;

    @FindBy(id = "app-content")
    public  WebElement TextOfProfile;

    @FindBy(xpath = "//input[@placeholder='Your email address']")
    public WebElement EmailInput;

    @FindBy(xpath = "//*[@id=\"personal-settings\"]/div[2]/div[2]/section/h3/button")
    public WebElement AddButton;

    @FindBy(xpath = "//*[@id=\"personal-settings\"]/div[2]/div[2]/section/em")
    public WebElement AdditionalEmails;

    @FindBy(id = "language")
    public WebElement languageSelect;

    @FindBy(xpath = "//label[@for]")
    public List<WebElement> ProfileTittles;


}