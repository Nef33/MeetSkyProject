package com.meet_sky.pages;

import com.meet_sky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsModulePage {


    public ContactsModulePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[7]/a")
    public WebElement contactsModule;

    @FindBy(xpath = "//*[@id=\"new-contact-button\"]")
    public WebElement newContact;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement createName;

    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement allContact;


    @FindBy(xpath = "//*[@id=\"notgrouped\"]/div/div[1]/div")
    public WebElement totalNumber;


    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div/div[3]/div/header/div[1]/div/div[2]/div/div/button")
    public WebElement imgIcon;

    @FindBy(xpath = "//span[normalize-space()='Choose from Files']")
    public WebElement chooseFromFiles;

    @FindBy(xpath = "//*[@id=\"picker-filestable\"]/tbody/tr[15]")
    public WebElement getImgIcon;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/button")
    public WebElement chooseButton;

   // @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div/div[3]/div/header/div[1]/div/div[1]/div")
   // public WebElement newPicture;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div/div[3]/div/header/div[3]/div/div/div/button/span")
    public WebElement threeDotButton;

    @FindBy(xpath = "//*[//*[@id=\"menu-bjffg\"]/li[3]/button]")
    public WebElement deleteButton;
}