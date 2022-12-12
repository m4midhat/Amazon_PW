package org.amazon.page;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import org.amazon.constants.BrandResultsLocators;
import org.amazon.utility.Util;
import org.testng.log4testng.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Brand results page.
 */
public class BrandResultsPage {
    private Page page;

    /**
     * Instantiates a new Brand results page.
     *
     * @param page the page
     */
    public BrandResultsPage(Page page) {
        this.page = page;
    }

    /**
     * The constant logger.
     */
    public static Logger logger = Logger.getLogger(BrandResultsPage.class);
    private BrandResultsLocators brandResultsLocators = new BrandResultsLocators();

    /**
     * Get samsung results url string.
     *
     * @return the string
     */
    public String getSamsungResultsURL(){
        return page.url();
    }

    /**
     * Is samsung option checked boolean.
     *
     * @return the boolean
     */
    public boolean isSamsungOptionChecked(){
        logger.info("If Samsung checkbox is checked");
        return page.isChecked(brandResultsLocators.getSamsungOption());
    }

    /**
     * Is results header available boolean.
     *
     * @return the boolean
     */
    public boolean isResultsHeaderAvailable(){
        logger.info("Is result header available");
        return page.isVisible(brandResultsLocators.getResultsHeader());
    }

    /**
     * Get filtered results text list.
     *
     * @return the list
     */
    public List<String> getFilteredResultsText(){
        List<String> filteredResults = new ArrayList<>();
        for(int i=0;i<page.locator(brandResultsLocators.getFilteredResultsText()).count();i++){
            String text = page.locator(brandResultsLocators.getFilteredResultsText()).nth(i).innerText().trim();
            logger.info(text);
            filteredResults.add(i, text);
        }
        return filteredResults;
    }

    /**
     * Click sort drop down.
     */
    public void clickSortDropDown(){
        logger.info("CLicking on sort drill down");
        page.locator(brandResultsLocators.getSortDropDown()).click();
    }

    /**
     * Get item description string.
     *
     * @param n the n
     * @return the string
     */
    public String getItemDescription(int n){
        return page.locator(brandResultsLocators.getItemDescription()).nth(n).innerText();
    }

    /**
     * Sort by featured.
     */
    public void sortByFeatured(){
        clickSortDropDown();
        logger.info("Sort by featured");
        page.locator(brandResultsLocators.getSortByFeatured()).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }

    /**
     * Sort by price low to high.
     */
    public void sortByPriceLowToHigh(){
        clickSortDropDown();
        logger.info("Sort by prices low to high");
        page.locator(brandResultsLocators.getSortByPriceLowToHigh()).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }

    /**
     * Sort by price high to low.
     */
    public void sortByPriceHighToLow(){
        clickSortDropDown();
        logger.info("Sort by prices high to low");
        page.locator(brandResultsLocators.getSortByPriceHighToLow()).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }

    /**
     * Sort by customer reviews.
     */
    public void sortByCustomerReviews(){
        clickSortDropDown();
        logger.info("Sort by reviews");
        page.locator(brandResultsLocators.getSortByReviews()).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }

    /**
     * Sort by new arrivals.
     */
    public void sortByNewArrivals(){
        clickSortDropDown();
        logger.info("Sort by new arrivals");
        page.locator(brandResultsLocators.getSortByNewArrivals()).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }

    /**
     * Get prices list.
     *
     * @return the list
     */
    public List<Integer> getPrices(){
        logger.info("Fetching prices");
        List<Integer> prices = new ArrayList<>();
        for(int i=0;i<page.locator(brandResultsLocators.getPrices()).count();i++){
            String text = page.locator(brandResultsLocators.getPrices()).nth(i).innerText().trim();
            prices.add(i, Util.parseStringToInt(text));
            logger.info(text);
        }
        return prices;
    }

    /**
     * Select nth item item details page.
     *
     * @param n the n
     * @return the item details page
     */
    public ItemDetailsPage selectNthItem(int n){
        page.locator(brandResultsLocators.getItemDescription()).nth(n).click();
        return new ItemDetailsPage(page);
    }

    /**
     * Open new tab item details page.
     *
     * @return the item details page
     */
    public ItemDetailsPage openNewTab(){
        Page itemDetails = page.waitForPopup(()->{
            page.locator(brandResultsLocators.getItemDescription()).nth(2).click();
        });

        return new ItemDetailsPage(itemDetails);
    }

}
