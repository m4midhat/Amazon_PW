package org.amazon.test;

import org.amazon.base.BaseTest;
import org.amazon.constants.TVCategoryConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TVCategoryTest extends BaseTest {


    @Test (description = "TV Category URL verification")
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

    @Test (description = "Verifying the resolution", priority = 7)
    public void verifyResolutionHeaderAvailability(){
        Assert.assertTrue(tvCategoryPage.isResolutionBoxVisible());
    }

    @Test (description = "Verification of 8k resolution visibility under resolution header", priority = 8)
    public void verifyAvailabilityCheck_8kResolution(){
        Assert.assertTrue(tvCategoryPage.isResolution8KVisible());
    }


    @Test (description = "Verification of 4k resolution visibility under resolution header", priority = 9)
    public void verifyAvailabilityCheck_4kResolution(){
        Assert.assertTrue(tvCategoryPage.isResolution4KVisible());
    }

    @Test (description = "Verification of 1080p resolution visibility under resolution header", priority = 10)
    public void verifyAvailabilityCheck_1080pResolution(){
        Assert.assertTrue(tvCategoryPage.isResolution480pVisible());
    }

    @Test (description = "Verification of 768p resolution visibility under resolution header", priority = 11)
    public void verifyAvailabilityCheck_768pResolution(){
        Assert.assertTrue(tvCategoryPage.isResolution768pVisible());
    }

    @Test (description = "Verification of 720p resolution visibility under resolution header", priority = 12)
    public void verifyAvailabilityCheck_720pResolution(){
        Assert.assertTrue(tvCategoryPage.isResolution720pVisible());
    }

    @Test (description = "Verification of 480p resolution visibility under resolution header", priority = 13)
    public void verifyAvailabilityCheck_480pResolution(){
        Assert.assertTrue(tvCategoryPage.isResolution480pVisible());
    }

    @Test (description = "Verification of year 2022 visibility", priority = 14)
    public void verifyAvailabilityCheck_Year2022(){
        Assert.assertTrue(tvCategoryPage.isYear2022Visible());
    }

    @Test (description = "Verification of year 2021 visibility", priority = 15)
    public void verifyAvailabilityCheck_Year2021(){
        Assert.assertTrue(tvCategoryPage.isYear2021Visible());
    }
    @Test (description = "Verification of year 2020 visibility", priority = 16)
    public void verifyAvailabilityCheck_Year2020(){
        Assert.assertTrue(tvCategoryPage.isYear2020Visible());
    }
    @Test (description = "Verification of year 2019 visibility", priority = 17)
    public void verifyAvailabilityCheck_Year2019(){
        Assert.assertTrue(tvCategoryPage.isYear2019Visible());
    }
    @Test (description = "Verification of year 2018 visibility", priority = 18)
    public void verifyAvailabilityCheck_Year2018(){
        Assert.assertTrue(tvCategoryPage.isYear2018Visible());
    }
    @Test (description = "Verification of year 2017 visibility", priority = 19)
    public void verifyAvailabilityCheck_Year2017(){
        Assert.assertTrue(tvCategoryPage.isYear2017Visible());
    }
    @Test (description = "Verification of year 2016 visibility", priority = 20)
    public void verifyAvailabilityCheck_Year2016(){
        Assert.assertTrue(tvCategoryPage.isYear2016Visible());
    }

    @Test (description = "Availability check of heading Smart TV Platform", priority = 21)
    public void verifyAvailabilityCheck_SmartTVPlatform(){
        Assert.assertTrue(tvCategoryPage.isPlatformHeadingVisible());
    }
    @Test (description = "Availability check of platform Android", priority = 22)
    public void verifyAvailabilityCheck_PlatformAndroid(){
        Assert.assertTrue(tvCategoryPage.isPlatformAndroidVisible());
    }
    @Test (description = "Availability check of platform FireOS", priority = 23)
    public void verifyAvailabilityCheck_PlatformFireOS(){
        Assert.assertTrue(tvCategoryPage.isPlatformFireOSVisible());
    }
    @Test (description = "Availability check of platform Android", priority = 24)
    public void verifyAvailabilityCheck_PlatformHomeOS(){
        Assert.assertTrue(tvCategoryPage.isPlatformHomeOSVisible());
    }
    @Test (description = "Availability check of platform Android", priority = 25)
    public void verifyAvailabilityCheck_PlatformTizen(){
        Assert.assertTrue(tvCategoryPage.isPlatformTizenVisible());
    }
    @Test (description = "Availability check of platform WebOS", priority = 26)
    public void verifyAvailabilityCheck_PlatformWebOS(){
        Assert.assertTrue(tvCategoryPage.isPlatformWebOSVisible());
    }
    @Test (description = "Availability of brand heading", priority = 27)
    public void verifyAvailabilityCheckBrandHeading(){
        Assert.assertTrue(tvCategoryPage.isBrandHisenceVisible());
    }
    @Test (description = "Availability of brand MI", priority = 28)
    public void verifyAvailabilityCheckBrandMI(){
        Assert.assertTrue(tvCategoryPage.isBrandMIVisible());
    }
    @Test (description = "Availability of brand Samsung", priority = 29)
    public void verifyAvailabilityCheckBrandSamsung(){
        Assert.assertTrue(tvCategoryPage.isBrandSamsungVisible());
    }


}
