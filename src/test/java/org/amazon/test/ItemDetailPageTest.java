package org.amazon.test;

import com.microsoft.playwright.options.LoadState;
import org.amazon.base.BaseTest;
import org.amazon.constants.TimeOuts;
import org.amazon.page.ItemDetailsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ItemDetailPageTest extends BaseTest {

    @Test (description = "Verify if the title of the newly opened tab is matching with the item description clicked on the previous page")
    public void verifyNewTabTitleIsMatchingWithItemDescription(){
        //itemDetailsPage = brandResultsPage.selectNthItem(2);
        itemDetailsPage = brandResultsPage.openNewTab();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
        page.waitForTimeout(TimeOuts.timeOut);
        String itemDescriptionText = brandResultsPage.getItemDescription(1);
        System.out.println(itemDescriptionText);
        Assert.assertNotEquals(-1,itemDescriptionText.contains(itemDetailsPage.getPageTitle()));
    }

    @Test (description = "Verify the bullet points regarding about the item", priority = 1)
    public void verifyBulletsPointsOfAboutThisItem(){
        List<String> bullets = itemDetailsPage.aboutThisItem();
        Assert.assertNotEquals(bullets.size(),0);
        System.out.println("Details about the selected item : ");
        bullets.forEach(System.out::println);
    }
}
