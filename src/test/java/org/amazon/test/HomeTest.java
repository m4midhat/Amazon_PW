package org.amazon.test;

import org.amazon.base.BaseTest;
import org.amazon.constants.HomePageConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomeTest extends BaseTest {

    @Test (description = "Verification of page URL", priority = 0)
    public void verifyURL(){
        String originalURL = getCurrentURL();
        Assert.assertEquals(originalURL, HomePageConstants.url);
    }

    @Test (description = "Verification of page title", priority = 1)
    public void verifyTitle(){
        String originalTitle = getCurrentTitle();
        Assert.assertEquals(originalTitle, HomePageConstants.homePageTitle);
    }

    @Test (description = "Verification of search drop down values", priority = 2)
    public void verifySearchDropDownValues(){
        List<String> searchValues = homePage.searchDropDownOptions();
        //System.out.println("Search option count: "+ searchValues.size());
        /* searchValues.forEach(System.out::println);
        *
        *   All Categories
            Alexa Skills
            Amazon Devices
            Amazon Fashion
            Amazon Fresh
            Amazon Pharmacy
            Appliances
            Apps & Games
            Baby
            Beauty
            Books
            Car & Motorbike
            Clothing & Accessories
            Collectibles
            Computers & Accessories
            Deals
            Electronics
            Furniture
            Garden & Outdoors
            Gift Cards
            Grocery & Gourmet Foods
            Health & Personal Care
            Home & Kitchen
            Industrial & Scientific
            Jewellery
            Kindle Store
            Luggage & Bags
            Luxury Beauty
            Movies & TV Shows
            Music
            Musical Instruments
            Office Products
            Pet Supplies
            Prime Video
            Same-Day Delivery
            Shoes & Handbags
            Software
            Sports, Fitness & Outdoors
            Subscribe & Save
            Tools & Home Improvement
            Toys & Games
            Under ₹500
            Video Games
            Watches
        * */
        Assert.assertEquals(searchValues.size(),HomePageConstants.searchOptionCount);
    }

    @Test (description = "Navigation to Television section", priority = 3)
    public void verifyScrollToTV(){

        homePage.clickHamburgerMenuIcon();
        homePage.navigateToTVAppliances();
        List<String> returnValues = homePage.clickSubMenuOptionTelevision();
        Assert.assertEquals(returnValues.get(0), HomePageConstants.returnURLOfSelectingTV);
        Assert.assertEquals(returnValues.get(1), HomePageConstants.pgTitleTVSelection);
    }

}
