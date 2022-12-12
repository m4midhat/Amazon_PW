package org.amazon.constants;

import org.testng.log4testng.Logger;

public class BrandResultsLocators {
    private Logger logger = Logger.getLogger(BrandResultsLocators.class);
    private String samsungOption = "//li[@id='p_89/Samsung']//input[@type='checkbox']";
    private String resultsHeader = "span.a-size-medium-plus.a-color-base.a-text-normal";
    private String filteredResultsText = "span[class='a-size-base-plus a-color-base a-text-normal']";
    private String sortDropDown = "#a-autoid-0-announce";
    private String sortByFeatured = "//a[@id='s-result-sort-select_0']";
    private String sortByPriceLowToHigh = "//a[@id='s-result-sort-select_1']";
    private String sortByPriceHighToLow = "//a[@id='s-result-sort-select_2']";
    private String sortByReviews = "//a[@id='s-result-sort-select_3']";
    private String sortByNewArrivals = "//a[@id='s-result-sort-select_4']";
    private String prices = "span.a-price-whole";
    private String itemDescription = "a.a-link-normal.s-underline-text.s-underline-link-text.s-link-style.a-text-normal span.a-size-base-plus.a-color-base.a-text-normal";


    public void logInfo(String elementSelector){
        logger.info("Accessing the elementSelector via locator : " + elementSelector);
    }

    public String getItemDescription() {
        logInfo(itemDescription);
        return itemDescription;
    }
    public String getSamsungOption() {
        logInfo(samsungOption);
        return samsungOption;
    }

    public String getResultsHeader() {
        logInfo(resultsHeader);
        return resultsHeader;
    }

    public String getFilteredResultsText() {
        logInfo(filteredResultsText);
        return filteredResultsText;
    }

    public String getSortDropDown() {
        logInfo(sortDropDown);
        return sortDropDown;
    }

    public String getSortByFeatured() {
        logInfo(sortByFeatured);
        return sortByFeatured;
    }

    public String getSortByPriceLowToHigh() {
        logInfo(sortByPriceLowToHigh);
        return sortByPriceLowToHigh;
    }

    public String getSortByPriceHighToLow() {
        logInfo(sortByPriceHighToLow);
        return sortByPriceHighToLow;
    }

    public String getSortByReviews() {
        logInfo(sortByReviews);
        return sortByReviews;
    }

    public String getSortByNewArrivals() {
        logInfo(sortByNewArrivals);
        return sortByNewArrivals;
    }

    public String getPrices() {
        logInfo(prices);
        return prices;
    }
}
