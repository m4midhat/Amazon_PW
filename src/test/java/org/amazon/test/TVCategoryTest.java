package org.amazon.test;

import org.amazon.base.BaseTest;
import org.amazon.constants.TVCategoryConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TVCategoryTest extends BaseTest {


    @Test (description = "TV Category URL verification", priority = 0)
    public void verifyTVCategoryURL() {
        tvCategoryPage = homePage.clickSubMenuOptionTelevision();
        Assert.assertEquals(tvCategoryPage.getTVCategoryPageURL(), TVCategoryConstants.returnURLOfSelectingTV);
    }

    @Test (description = "TV Category title", priority = 1)
    public void verifyTVCategoryTitle(){
        Assert.assertEquals(tvCategoryPage.getTVCategoryPageTitle(), TVCategoryConstants.pgTitleTVSelection);
    }

    @Test (description = "Verify the total options after selecting TV is 10", priority = 2)
    public void verifySubOptionsCountTV() {
        Assert.assertEquals(tvCategoryPage.getSubOptionsTV(),TVCategoryConstants.TVCategoryOptions);
    }

    @Test (description = "Verify first sub-option value", priority = 3)
    public void verifySubOptionsTV1(){
        Assert.assertEquals(tvCategoryPage.getTVSelectionSubOption(0),TVCategoryConstants.subCategoryOption1);
    }


    @Test (description = "Verify second sub-option value", priority = 4)
    public void verifySubOptionsTV2(){
        Assert.assertEquals(tvCategoryPage.getTVSelectionSubOption(1),TVCategoryConstants.subCategoryOption2);
    }


    @Test (description = "Verify third sub-option value", priority = 5)
    public void verifySubOptionsTV3(){
        Assert.assertEquals(tvCategoryPage.getTVSelectionSubOption(2),TVCategoryConstants.subCategoryOption3);
    }


    @Test (description = "Verify fourth sub-option value", priority = 6)
    public void verifySubOptionsTV4(){
        Assert.assertEquals(tvCategoryPage.getTVSelectionSubOption(3),TVCategoryConstants.subCategoryOption4);
    }



}
