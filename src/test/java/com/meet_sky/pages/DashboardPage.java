package com.meet_sky.pages;


import com.meet_sky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {


    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id]")
    public List<WebElement> listOfDashBoardModule;

    @FindBy(xpath = "//*[@id=\"app-dashboard\"]/h2")
    public WebElement expectedUserNameOnDashboard;

    @FindBy(xpath = "//div[@class='user-status-menu-item__header-content-displayname']")
    public WebElement actualUserNameOnDashboard;

    @FindBy(xpath = "//*[@id=\"app-dashboard\"]/div[2]/a")
    public WebElement CustomizeButton;



    @FindBy(xpath="//label[@for]")
    public List<WebElement> widgets;

    @FindBy(xpath="//*[@id=\"status-status\"]/li/div/button")
    public WebElement statusButton;

    @FindBy(xpath="//label[@class='user-status-online-select__label icon-user-status-away']")
    public WebElement awayStatus;

    @FindBy(xpath="//button[@text='Set status message']")
    public WebElement setStatusButton;


    public void clickMenuByText(String text) {
        String locator = "(//a[@aria-label='" + text + "'])[1]";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        element.click();
    }
    @FindBy(id = "expand")
    public WebElement ProfileButton;

    @FindBy(id = "expanddiv")
    public WebElement MenuButton;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[1]/div/a[1]/div[1]/div[1]")
    public  WebElement UserName;


}
