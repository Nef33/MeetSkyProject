package com.meet_sky.pages;


import com.meet_sky.utilities.BrowserUtils;
import com.meet_sky.utilities.ConfigurationReader;
import com.meet_sky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //lets make a change to try

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
