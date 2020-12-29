package com.seleniumeasy.pages;

import com.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(xpath = "//img[@title='Selenium Easy']")
    private WebElement seleniumIcon;

    public void userAbleTheGoTheWebsite(){
        Assert.assertTrue(seleniumIcon.isDisplayed());
        LOGGER.info("The logo of selenium easy is correctly displayed");
    }

    public void userAbleToVerfiyURL(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.seleniumeasy.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        LOGGER.info("The expected URL is the current URL");


    }



}
