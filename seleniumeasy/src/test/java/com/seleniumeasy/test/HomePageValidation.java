package com.seleniumeasy.test;

import com.base.TestBase;
import com.seleniumeasy.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase {

    @Test(enabled = false)
    public void UserAbleToOpenTheWebsite(){
        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.userAbleTheGoTheWebsite();
        sleepFor(2);
        homePage.userAbleToVerfiyURL();
        sleepFor(2);

    }
}
