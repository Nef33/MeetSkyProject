package com.meet_sky.pages;

import com.meet_sky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFileFunctionPage {


    public SearchFileFunctionPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }



    @FindBy (xpath = "//a[@aria-label='Search']")
    public WebElement SearchIcon;


    @FindBy (xpath = "//input[@class='unified-search__form-input']")
    public WebElement SearchBar;


    @FindBy(xpath = "//span[@class='unified-search__result-content']")
    public WebElement FileIcon;


    @FindBy (xpath = "//*[@id=\"app-sidebar-vue\"]/header/div[1]/div[2]")
    public WebElement SideBarIcon;


    @FindBy(xpath = "//*[@id=\"viewer\"]/div[1]/div[2]/button[2]/span[1]")
    public WebElement closeIcon;







}



