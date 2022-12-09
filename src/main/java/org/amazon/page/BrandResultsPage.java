package org.amazon.page;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import org.amazon.constants.BrandResultsLocators;
import org.amazon.utility.Util;

import java.util.ArrayList;
import java.util.List;

public class BrandResultsPage {
    private Page page;
    public BrandResultsPage(Page page) {
        this.page = page;
    }

    public String getSamsungResultsURL(){
        return page.url();
    }

    public boolean isSamsungOptionChecked(){
        return page.isChecked(BrandResultsLocators.samsungOption);
    }
    public boolean isResultsHeaderAvailable(){
        return page.isVisible(BrandResultsLocators.resultsHeader);
    }
    public List<String> getFilteredResultsText(){
        List<String> filteredResults = new ArrayList<>();
        for(int i=0;i<page.locator(BrandResultsLocators.filteredResultsText).count();i++){
            String text = page.locator(BrandResultsLocators.filteredResultsText).nth(i).innerText().trim();
            filteredResults.add(i, text);
        }
        return filteredResults;
    }
    public void clickSortDropDown(){
        page.locator(BrandResultsLocators.sortDropDown).click();
    }

    public void sortByFeatured(){
        clickSortDropDown();
        page.locator(BrandResultsLocators.sortByFeatured).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }
    public void sortByPriceLowToHigh(){
        clickSortDropDown();
        page.locator(BrandResultsLocators.sortByPriceLowToHigh).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }
    public void sortByPriceHighToLow(){
        clickSortDropDown();
        page.locator(BrandResultsLocators.sortByPriceHighToLow).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }
    public void sortByCustomerReviews(){
        clickSortDropDown();
        page.locator(BrandResultsLocators.sortByReviews).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }
    public void sortByNewArrivals(){
        clickSortDropDown();
        page.locator(BrandResultsLocators.sortByNewArrivals).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }

    public List<Integer> getPrices(){
        List<Integer> prices = new ArrayList<>();
        for(int i=0;i<page.locator(BrandResultsLocators.prices).count();i++){
            String text = page.locator(BrandResultsLocators.prices).nth(i).innerText().trim();
            prices.add(i, Util.parseStringToInt(text));
            //System.out.println(prices.get(i));
        }
        return prices;
    }

}
