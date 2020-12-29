package com.seleniumeasy.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickSeleniumPage {

    @FindBy(xpath = "//div[@id='navbar-collapse']/nav[@role='navigation']/ul/li[2]/a")
    private WebElement seleniumBtn;


    @FindBy(xpath = "//div[@id='navbar-collapse']/nav[@role='navigation']/ul[@class='menu nav navbar-nav']/li[2]/ul[@class='dropdown-menu']/li[@class='first leaf']/a")
    private WebElement seleJavaBtn;

    @FindBy(xpath = "/html//input[@id='edit-search-block-form--2']")
    private WebElement searchBar;


    public void clickOnSeleniumBtn(){
        seleniumBtn.click();
    }
    public void clickOnSelJava(){
        seleJavaBtn.click();
    }
    public void enterInSearchBar(String itemToSearch){
        searchBar.sendKeys(itemToSearch, Keys.ENTER);
    }

}
