package org.amazon.test;

import org.amazon.base.BaseTest;
import org.amazon.utility.Util;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrandResultTest extends BaseTest {

    @Test (description = "Verify if the Samsung checkbox is selected on the details page")
    public void verifyIfSamsungCheckBoxIsSelected(){
        brandResultsPage = tvCategoryPage.selectBrandSamsung();
        Assert.assertTrue(brandResultsPage.isSamsungOptionChecked());
    }

    @Test (description = "Verify if the results header is available at the top of the report", priority = 1)
    public void verifyResultsHeaderAvailability(){
        Assert.assertTrue(brandResultsPage.isResultsHeaderAvailable());
    }

    @Test (description = "Verify if filtered results contains the selected brand", priority = 2)
    public void verifyFilteredResultsToHaveSelectedBrandName(){
        List<String> filteredResults = brandResultsPage.getFilteredResultsText();
        for(int i=0;i< filteredResults.size();i++){
            Assert.assertNotEquals(-1, filteredResults.get(i).indexOf("Samsung"));
        }
    }

    @Test (description = "Verify sorting the products by price; high to low", priority = 3)
    public void verifyHighToLowPriceSorting(){
        brandResultsPage.sortByPriceHighToLow();
        List<Integer> sortedPrices = new ArrayList<>();
        sortedPrices = brandResultsPage.getPrices();
        Assert.assertTrue(Util.isSorted(sortedPrices));
    }
}
