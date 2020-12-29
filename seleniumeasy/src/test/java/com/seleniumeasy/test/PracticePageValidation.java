package com.seleniumeasy.test;

import com.base.TestBase;
import com.seleniumeasy.pages.PracticePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PracticePageValidation extends TestBase {
    @Test

    public void UserWillUseDemo(){
        PracticePage practicePage = PageFactory.initElements(driver, PracticePage.class);
        practicePage.userGoesIntoDemoWebsite();
        sleepFor(2);

        try {
            practicePage.userAbleToClosePopup();

        }catch (Exception e){
            e.printStackTrace();
        }
        practicePage.userGoesIntoExpamples();
        sleepFor(2);
        practicePage.userGoesIntoButtonDemo();
        sleepFor(2);

    }
}
