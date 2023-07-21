package com.meet_sky.pages;

import com.meet_sky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckModulePage {
    public DeckModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@aria-controls='app-navigation-vue']")
    public WebElement buttonOpenNavigation;

    @FindBy(css = "div[class$='icon-add']")
    public WebElement addBoardIcon;

    @FindBy(css = "input[required='required']")
    public WebElement inputBox;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement inputBoxSubmit;

    @FindBy(xpath = "//span[@title='Project B']")
    public WebElement boardName;


    @FindBy(xpath = "//div[@id='stack-add']")
    public WebElement addListButton;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement addListArrow;

    @FindBy(xpath = "(//input[@placeholder='List name'])[1]")
    public WebElement listInputBox;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div/div/div/div[1]/h3")
    public WebElement list;

    @FindBy(xpath = "(//button[@class='action-item action-item--single icon-add undefined undefined has-tooltip'])[2]")
    public WebElement addCardIcon;

    @FindBy(xpath = "//input[@placeholder='Card name']")
    public WebElement cardInputBox;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement cardSubmitBtn;

    @FindBy(xpath = "//div[@class='card card__editable']")
    public WebElement newCard;

    @FindBy(xpath = "//div[@class='stack']//button[@icon='icon-add']/../following-sibling::div//button")
    public WebElement threeDotCardMenuBtn;


    @FindBy(xpath = "//span[.='Assign to me']")
    public WebElement assignToMe;


    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div[1]/div/div")
    public WebElement userProfileIcon;

}
