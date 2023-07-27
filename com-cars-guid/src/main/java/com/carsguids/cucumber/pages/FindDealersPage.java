package com.carsguids.cucumber.pages;

import com.carsguids.cucumber.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FindDealersPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findDealerLink;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='h1Text']")
    WebElement dealerText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerResults']")
    List<WebElement> dealersName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='pagination']//p[7]//*[name()='svg']")
    WebElement nextButton;


    public void clickOnFindDealerLink(){
        mouseHoverToElementAndClick(findDealerLink);
    }
    public String getDealerText(){
        return getTextFromElement(dealerText);
    }
    public String getDealersList(String name){
        for (WebElement dealer : dealersName){
            String text = dealer.getText();
            if (text.equalsIgnoreCase(name)){
                return text;
            }
        }return null;
    }
    public void clickOnNextButton(){
        clickOnElement(nextButton);
    }

}
