package com.seleniumeasy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticePage {
    @FindBy(xpath = "/html//div[@id='header_bar']//section//a[@href='http://www.seleniumeasy.com/test'] ")
    private WebElement demobtn;

    @FindBy(xpath = "/html//a[@id='btn_basic_example']")
    private WebElement expamlesBtn;

    @FindBy(xpath = "//div[@id='basic']//a[@href='./basic-radiobutton-demo.html']")
    private WebElement buttonBtn;

    @FindBy(id="at-cv-lightbox-close")
    private WebElement closePopup;


    public void userGoesIntoDemoWebsite(){
        demobtn.click();
    }
    public void userGoesIntoExpamples(){
        expamlesBtn.click();
    }

    public void userGoesIntoButtonDemo(){
        buttonBtn.click();
    }

    public void userAbleToClosePopup(){
        closePopup.click();
    }
}
