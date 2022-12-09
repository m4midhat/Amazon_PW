package org.amazon.page;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import org.amazon.constants.BrandResultsLocators;
import org.amazon.utility.Util;
import org.testng.log4testng.Logger;

import java.util.ArrayList;
import java.util.List;

public class BrandResultsPage {
    private Page page;
    public BrandResultsPage(Page page) {
        this.page = page;
    }
    public static Logger logger = Logger.getLogger(BrandResultsPage.class);

    public String getSamsungResultsURL(){
        return page.url();
    }

    public boolean isSamsungOptionChecked(){
        logger.info("If Samsung checkbox is checked");
        return page.isChecked(BrandResultsLocators.samsungOption);
    }
    public boolean isResultsHeaderAvailable(){
        logger.info("Is result header available");
        return page.isVisible(BrandResultsLocators.resultsHeader);
    }
    public List<String> getFilteredResultsText(){
        List<String> filteredResults = new ArrayList<>();
        for(int i=0;i<page.locator(BrandResultsLocators.filteredResultsText).count();i++){
            String text = page.locator(BrandResultsLocators.filteredResultsText).nth(i).innerText().trim();
            logger.info(text);
            filteredResults.add(i, text);
        }
        return filteredResults;
    }
    public void clickSortDropDown(){
        logger.info("CLicking on sort drill down");
        page.locator(BrandResultsLocators.sortDropDown).click();
    }

    public void sortByFeatured(){
        clickSortDropDown();
        logger.info("Sort by featured");
        page.locator(BrandResultsLocators.sortByFeatured).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }
    public void sortByPriceLowToHigh(){
        clickSortDropDown();
        logger.info("Sort by prices low to high");
        page.locator(BrandResultsLocators.sortByPriceLowToHigh).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }
    public void sortByPriceHighToLow(){
        clickSortDropDown();
        logger.info("Sort by prices high to low");
        page.locator(BrandResultsLocators.sortByPriceHighToLow).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }
    public void sortByCustomerReviews(){
        clickSortDropDown();
        logger.info("Sort by reviews");
        page.locator(BrandResultsLocators.sortByReviews).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }
    public void sortByNewArrivals(){
        clickSortDropDown();
        logger.info("Sort by new arrivals");
        page.locator(BrandResultsLocators.sortByNewArrivals).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }

    public List<Integer> getPrices(){
        logger.info("Fetching prices");
        List<Integer> prices = new ArrayList<>();
        for(int i=0;i<page.locator(BrandResultsLocators.prices).count();i++){
            String text = page.locator(BrandResultsLocators.prices).nth(i).innerText().trim();
            prices.add(i, Util.parseStringToInt(text));
            logger.info(text);
        }
        return prices;
    }

}
