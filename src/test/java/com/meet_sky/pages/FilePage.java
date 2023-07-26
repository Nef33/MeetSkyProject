package com.meet_sky.pages;


import com.meet_sky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage {

    public FilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath ="//*[@id=\"fileList\"]/tr/td[2]/a/span[3]/a[2]/span[1]")
    public WebElement ThreeDotsMenu;



    @FindBy(xpath ="//*[@id=\"fileList\"]/tr/td[2]/div/ul/li[3]/a")
    public WebElement FavoritesIcon;


    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[3]/a")
    public WebElement FavoritesBTN;


    @FindBy(xpath = "//*[@id=\"fileList\"]/tr/td[1]/a/span[1]/span")
    public WebElement FileName;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[5]/a")
    public WebElement RenameBTN;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr/td[2]/div/ul/li[4]/a")
    public WebElement DetailsIcon;


    @FindBy(xpath = "//*[@id=\"comments\"]")
    public WebElement CommentsBTN ;


    @FindBy(xpath = "//*[@id=\"tab-comments\"]/div/div[1]/div[2]/div")
    public WebElement CommentBox;














}
