package org.amazon.test;

import org.amazon.base.BaseTest;
import org.amazon.constants.HomePageConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TVCategoryTest extends BaseTest {


    @Test (description = "TV Catogory URL verification", priority = 0)
    public void verifyTVCategoryURL() {
        tvCategoryPage = homePage.clickSubMenuOptionTelevision();
        Assert.assertEquals(tvCategoryPage.getTVCategoryPageURL(), HomePageConstants.returnURLOfSelectingTV);
    }

    @Test (description = "TV Category title", priority = 1)
    public void verifyTVCategoryTitle(){
        Assert.assertEquals(tvCategoryPage.getTVCategoreyPageTitle(), HomePageConstants.pgTitleTVSelection);
    }

}
