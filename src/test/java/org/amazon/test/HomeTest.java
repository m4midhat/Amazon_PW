package org.amazon.test;

import org.amazon.base.BaseTest;
import org.amazon.constants.HomePageConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Test (description = "Verification of page URL")
    public void verifyURL(){
        String originalURL = homePage.getPageURL();
        Assert.assertEquals(originalURL, HomePageConstants.url);
    }

    @Test (description = "Verification of page title")
    public void verifyTitle(){
        String originalTitle = homePage.getPageTitle();
        Assert.assertEquals(originalTitle, HomePageConstants.homePageTitle);
    }
}
