package com.meet_sky.pages;


import com.meet_sky.utilities.BrowserUtils;
import com.meet_sky.utilities.ConfigurationReader;
import com.meet_sky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage {


    //lets make a change to try

        public void clickMenuByText(String text){
            String locator = "(//a[@aria-label='"+text+"'])[1]";
            WebElement element = Driver.getDriver().findElement(By.xpath(locator));
            element.click();
        }



}
