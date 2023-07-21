package com.meet_sky.pages;

import com.meet_sky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.awt.SystemColor.text;

public class FolderPage {

    public FolderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"fileList\"]")
    public WebElement folders;




    @FindBy(xpath = "//*[@id=\"headerSelection\"][1]")
    public WebElement checkbox;


    @FindBy(xpath = "//*[@id=\"headerName\"][1]")
    public WebElement numberinheader;



    @FindBy(xpath = "//*[@id=\"filestable\"]/tfoot/tr/td[2]/span")
    public WebElement bottom;

    public List<WebElement> FolderElements(){
        List<WebElement> folderElements = folders.findElements(By.tagName("tr"));
        return folderElements;
    }

  //////////////////////////////////////////////////////////////////////////////////////////

    public List<WebElement> FolderElementsFavourite(){
        List<WebElement> folderElementsFavourite = folders.findElements(By.xpath("//*[@data-type='dir' and @data-favorite='true']"));



        return folderElementsFavourite;
    }
/////////////////////////////////////////////////////////////////////////////////
    public List<String> folderNamesFolderElementsFavourite(){
        List<String> folderNamesFolderElementsFavourite = new ArrayList<>();
        for (   WebElement folderElementsFavourite :   FolderElementsFavourite()){
           folderNamesFolderElementsFavourite.add(folderElementsFavourite.getText().toLowerCase());
        }
        return folderNamesFolderElementsFavourite;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////

    public List<String> folderSizeFolderElementsFavourite(){
        List<String> folderSizeFolderElementsFavourite = new ArrayList<>();
        for (   WebElement folderElementsFavourite :   FolderElementsFavourite()){
            folderSizeFolderElementsFavourite.add(folderElementsFavourite.getAttribute("data-size"));
        }
        return folderSizeFolderElementsFavourite;
    }



////////////////////////////////////////////////////////////////////////////////////////////////

    public List<WebElement> FolderElementsNOOOOOTFavourite(){
        List<WebElement> folderElementsNOOOOOTFavourite = folders.findElements(By.xpath("//*[@data-type='dir' and not(@data-favorite='true')]"));



        return folderElementsNOOOOOTFavourite;
    }

//////////////////////////////////////////////////
    public List<String> folderNamesFolderElementsNOOOOTFavourite(){
        List<String> folderNamesFolderElementsNOOOOTFavourite = new ArrayList<>();
        for (   WebElement folderElementsNOOOOOTFavourite :   FolderElementsNOOOOOTFavourite()){
            folderNamesFolderElementsNOOOOTFavourite.add(folderElementsNOOOOOTFavourite.getText().toLowerCase());
        }
        return folderNamesFolderElementsNOOOOTFavourite;


    }

    ///////////////////////////////////////////////////////////////////////////////////
    public List<WebElement> FolderSIzeNOOOOOTFavourite(){
        List<WebElement> folderSizeNOOOOOTFavourite = folders.findElements(By.xpath("//*[@data-type='dir' and not(@data-favorite='true')]"));



        return folderSizeNOOOOOTFavourite;
    }
/////////////////////////////////////////////////////////////////////
    public List<String> folderSizeFolderSizeNOOOOTFavourite(){
        List<String> folderSizeFolderSizeNOOOOTFavourite = new ArrayList<>();
        for (   WebElement folderSizeNOOOOOTFavourite :   FolderSIzeNOOOOOTFavourite()){
            folderSizeFolderSizeNOOOOTFavourite.add(folderSizeNOOOOOTFavourite.getAttribute("data-size"));
        }
        return folderSizeFolderSizeNOOOOTFavourite;
    }

////////////////////////////////////////////////////////////////////////////////////
    public List<WebElement> FileElementsFavourite(){
        List<WebElement> fileElementsFavourite = folders.findElements(By.xpath("//*[@data-type='file' and @data-favorite='true']"));



        return fileElementsFavourite;
    }

//////////////////////////////////////////////////////////////////////////////////////
    public List<String> fileNamesFileElementsFavourite(){
        List<String> fileNamesFileElementsFavourite = new ArrayList<>();
        for (   WebElement fileElementsFavourite :   FileElementsFavourite()){
            fileNamesFileElementsFavourite.add(fileElementsFavourite.getText().toLowerCase());
        }
        return fileNamesFileElementsFavourite;
    }



    //////////////////////////////////////////////////////////////////////////////

    public List<WebElement> FileSizeFavourite(){
        List<WebElement> fileSizeFavourite = folders.findElements(By.xpath("//*[@data-type='file' and @data-favorite='true']"));



        return fileSizeFavourite;
    }


//////////////////////////////////////////////////////////////////////////////////////
    public List<String> fileSizeFileElementsFavourite(){
        List<String> fileSizeFileElementsFavourite = new ArrayList<>();
        for (   WebElement fileSizeFavourite :   FileSizeFavourite()){
            fileSizeFileElementsFavourite.add(fileSizeFavourite.getAttribute("data-size"));
        }
        return fileSizeFileElementsFavourite;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    public List<WebElement> FileElementsNOOOOOTFavourite(){
        List<WebElement> fileElementsNOOOOOTFavourite = folders.findElements(By.xpath("//*[@data-type='file' and not(@data-favorite='true')]"));



        return fileElementsNOOOOOTFavourite;
    }

///////////////////////////////////////////////////////////////////////////////////////////////
    public List<String> fileNamesFileElementsNOOOOTFavourite(){
        List<String> fileNamesFileElementsNOOOOTFavourite = new ArrayList<>();
        for (   WebElement fileElementsNOOOOOTFavourite :   FileElementsNOOOOOTFavourite()){
            fileNamesFileElementsNOOOOTFavourite.add(fileElementsNOOOOOTFavourite.getText().toLowerCase().replace(".txt","" )
                    .replace("e2","e" )
                    .replace("_file","-a" ));

        }
        return fileNamesFileElementsNOOOOTFavourite;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public List<String> fileSizeFileElementsNOOOOTFavourite(){
        List<String> fileSizeFileElementsNOOOOTFavourite = new ArrayList<>();
        for (   WebElement fileElementsNOOOOOTFavourite :   FileElementsNOOOOOTFavourite()){
            fileSizeFileElementsNOOOOTFavourite.add(fileElementsNOOOOOTFavourite.getAttribute("data-size"));

        }
        return fileSizeFileElementsNOOOOTFavourite;
    }


 //////////////////////////////////////////////////////////////////////////////////////////



    public List<String> folderNames(){
        List<String> folderNames = new ArrayList<>();
        for (   WebElement folderElement :   FolderElements()){
            folderNames.add(folderElement.getText().toLowerCase().replace(".txt","" ).replace("e2","e" )
                    .replace("_file","-a" ));
        }
        return folderNames;
    }

    public List<String> folderSizes(){
        List<String> folderSizes = new ArrayList<>();
        for (   WebElement folderElement :   FolderElements()){
            folderSizes.add(folderElement.getAttribute("data-size"));
        }



        return folderSizes;
    }


    public List<String> dateElementss(){


        List<WebElement> dateElements = folders.findElements(By.cssSelector("[data-original-title]"));

        List<String> dateList = new ArrayList<>();
        for (WebElement dateElement : dateElements) {
            dateList.add(dateElement.getAttribute("data-original-title"));
        }


      return dateList;
    }


//////////////////////////////////////////////////////////////////////////////////
    public List<String> sortedNames(){
        List<String> sortedNames = new ArrayList<>();
        List<String> folderNamesFavourite = folderNamesFolderElementsFavourite();
        List<String> folderNamesNotFavourite = folderNamesFolderElementsNOOOOTFavourite();
        List<String> fileNamesFavourite = fileNamesFileElementsFavourite();
        List<String> fileNamesNotFavourite = fileNamesFileElementsNOOOOTFavourite();

        Collections.sort(folderNamesFavourite);
        Collections.sort(folderNamesNotFavourite);
        Collections.sort(fileNamesFavourite);
        Collections.sort(fileNamesNotFavourite);

        sortedNames.addAll(folderNamesFavourite);
        sortedNames.addAll(fileNamesFavourite);
        sortedNames.addAll(folderNamesNotFavourite);
        sortedNames.addAll(fileNamesNotFavourite);

        return sortedNames;
    }
////////////////////////////////////////
public List<String> datessorted(){
    List<String>datessorted = new ArrayList<>();
    List<String> sort = dateElementss();
    Collections.sort(sort);
    datessorted.addAll(sort);

    return datessorted;
}

    /////////////////////////////
    public List<String> sortedSizes(){
        List<String> sortedSizes = new ArrayList<>();
        List<String> folderSizesFavourite = folderSizeFolderElementsFavourite();
        List<String> folderSizesNotFavourite = folderSizeFolderSizeNOOOOTFavourite();
        List<String> fileSizesFavourite = fileSizeFileElementsFavourite();
        List<String> fileSizesNotFavourite = fileSizeFileElementsNOOOOTFavourite();



        List<Integer> integerList = new ArrayList<>();
        for (String str : folderSizesFavourite) {
            integerList.add(Integer.parseInt(str));
        }
        // Step 2: Sort the list of integers in ascending order
        Collections.sort(integerList);
        // Step 3: Optionally, convert the list of integers back to a list of strings
        List<String> sortedStringList = new ArrayList<>();
        for (int num : integerList) {
            sortedStringList.add(String.valueOf(num));}
/////////////////////////////

        List<Integer> integerList1 = new ArrayList<>();
        for (String str : fileSizesFavourite) {
            integerList1.add(Integer.parseInt(str));
        }
        // Step 2: Sort the list of integers in ascending order
        Collections.sort(integerList1);
        // Step 3: Optionally, convert the list of integers back to a list of strings
        List<String> sortedStringList1 = new ArrayList<>();
        for (int num : integerList1) {
            sortedStringList1.add(String.valueOf(num));}

  ///////////////////////////
        List<Integer> integerList2 = new ArrayList<>();
        for (String str : folderSizesNotFavourite) {
            integerList2.add(Integer.parseInt(str));
        }
        // Step 2: Sort the list of integers in ascending order
        Collections.sort(integerList2);
        // Step 3: Optionally, convert the list of integers back to a list of strings
        List<String> sortedStringList2 = new ArrayList<>();
        for (int num : integerList2) {
            sortedStringList2.add(String.valueOf(num));}
////////////////////////////////////////////////////
        List<Integer> integerList3 = new ArrayList<>();
        for (String str : fileSizesNotFavourite) {
            integerList3.add(Integer.parseInt(str));
        }
        // Step 2: Sort the list of integers in ascending order
        Collections.sort(integerList3);
        // Step 3: Optionally, convert the list of integers back to a list of strings
        List<String> sortedStringList3 = new ArrayList<>();
        for (int num : integerList3) {
            sortedStringList3.add(String.valueOf(num));}
        //////////////////////////////////


        sortedSizes.addAll(sortedStringList);
        sortedSizes.addAll(sortedStringList1);
        sortedSizes.addAll(sortedStringList2);
        sortedSizes.addAll(sortedStringList3);

        return sortedSizes;
    }


  ///////////////////////////////////////////////////////////////

    public List<String> reverseSortedFolderNames(){
        List<String> reverseSortedFolderNames = new ArrayList<>();
        List<String> folderNamesFavourite = folderNamesFolderElementsFavourite();
        List<String> folderNamesNotFavourite = folderNamesFolderElementsNOOOOTFavourite();
        List<String> fileNamesFavourite = fileNamesFileElementsFavourite();
        List<String> fileNamesNotFavourite = fileNamesFileElementsNOOOOTFavourite();

        Collections.sort(folderNamesFavourite);
        Collections.sort(folderNamesNotFavourite);
        Collections.sort(fileNamesFavourite);
        Collections.sort(fileNamesNotFavourite);

        Collections.reverse(folderNamesFavourite);
        Collections.reverse(folderNamesNotFavourite);
        Collections.reverse(fileNamesFavourite);
        Collections.reverse(fileNamesNotFavourite);


     reverseSortedFolderNames.addAll(fileNamesFavourite);
        reverseSortedFolderNames.addAll(folderNamesFavourite);
        reverseSortedFolderNames.addAll(fileNamesNotFavourite);
        reverseSortedFolderNames.addAll(folderNamesNotFavourite);





        return reverseSortedFolderNames;
    }


    public List<String> reverseSizeFolderNames(){
        List<String> reversedsortedSizes = new ArrayList<>();
        List<String> reversedfolderSizesFavourite = folderSizeFolderElementsFavourite();
        List<String> reversedfolderSizesNotFavourite = folderSizeFolderSizeNOOOOTFavourite();
        List<String> reversedfileSizesFavourite = fileSizeFileElementsFavourite();
        List<String> reversedfileSizesNotFavourite = fileSizeFileElementsNOOOOTFavourite();




        List<Integer> reversedintegerList = new ArrayList<>();
        for (String str : reversedfolderSizesFavourite) {
           reversedintegerList.add(Integer.parseInt(str));
        }
        // Step 2: Sort the list of integers in ascending order
        Collections.sort(reversedintegerList);
        Collections.reverse(reversedintegerList);
        // Step 3: Optionally, convert the list of integers back to a list of strings
        List<String> reversedsortedStringList = new ArrayList<>();
        for (int num : reversedintegerList) {
            reversedsortedStringList.add(String.valueOf(num));}
/////////////////////////////

        List<Integer> reversedintegerList1 = new ArrayList<>();
        for (String str : reversedfileSizesFavourite) {
            reversedintegerList1.add(Integer.parseInt(str));
        }
        // Step 2: Sort the list of integers in ascending order
        Collections.reverse(reversedintegerList1);
        Collections.reverse(reversedintegerList1);
        // Step 3: Optionally, convert the list of integers back to a list of strings
        List<String> reversedsortedStringList1 = new ArrayList<>();
        for (int num : reversedintegerList1) {
            reversedsortedStringList1.add(String.valueOf(num));}

        ///////////////////////////
        List<Integer> reversedintegerList2 = new ArrayList<>();
        for (String str : reversedfolderSizesNotFavourite) {
            reversedintegerList2.add(Integer.parseInt(str));
        }
        // Step 2: Sort the list of integers in ascending order
        Collections.sort(reversedintegerList2);
        Collections.reverse(reversedintegerList2);
        // Step 3: Optionally, convert the list of integers back to a list of strings
        List<String> reversedsortedStringList2 = new ArrayList<>();
        for (int num : reversedintegerList2) {
            reversedsortedStringList2.add(String.valueOf(num));}
////////////////////////////////////////////////////
        List<Integer> reversedintegerList3 = new ArrayList<>();
        for (String str : reversedfileSizesNotFavourite) {
            reversedintegerList3.add(Integer.parseInt(str));
        }
        // Step 2: Sort the list of integers in ascending order
        Collections.sort(reversedintegerList3);
        Collections.reverse(reversedintegerList3);



        // Step 3: Optionally, convert the list of integers back to a list of strings
        List<String> reversedsortedStringList3 = new ArrayList<>();
        for (int num : reversedintegerList3) {
            reversedsortedStringList3.add(String.valueOf(num));}
        //////////////////////////////////

        reversedsortedSizes.addAll(reversedsortedStringList);
        reversedsortedSizes.addAll(reversedsortedStringList1);
        reversedsortedSizes.addAll(reversedsortedStringList3);
        reversedsortedSizes.addAll(reversedsortedStringList2) ;







        return reversedsortedSizes;
    }

    public void clickFolderBarText(String text){
        String locator = "(//a[@data-sort='"+text+"'])[1]";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        element.click();
    }


}
