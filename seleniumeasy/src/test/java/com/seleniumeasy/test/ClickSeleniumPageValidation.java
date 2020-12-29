package com.seleniumeasy.test;

import com.base.TestBase;
import com.seleniumeasy.pages.ClickSeleniumPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ClickSeleniumPageValidation extends TestBase {

    @Test(enabled = false)
    public void userWillBeAbleToGoToSeleniumJava(){
        ClickSeleniumPage clickSeleniumPage = PageFactory.initElements(driver, ClickSeleniumPage.class);
        clickSeleniumPage.clickOnSeleniumBtn();
        sleepFor(2);
        clickSeleniumPage.clickOnSelJava();
        sleepFor(3);
        clickSeleniumPage.enterInSearchBar("Maven");
        sleepFor(5);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        sleepFor(3);


    }
}
