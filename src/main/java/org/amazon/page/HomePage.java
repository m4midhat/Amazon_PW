package org.amazon.page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Selectors;
import com.microsoft.playwright.options.LoadState;
import org.amazon.constants.HomeLocators;
import org.amazon.constants.HomePageConstants;
import org.testng.log4testng.Logger;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    private Page page;

    private final Logger logger = Logger.getLogger(HomePage.class);
    public HomePage(Page page){
        this.page = page;
    }


    private void sendKeys(String keys, String txtBox){
        page.locator(txtBox).fill("");
        page.locator(txtBox).fill(keys);
    }

    public void searchItem(String item){
        sendKeys(item, HomeLocators.searchTextBox);
        page.locator(HomeLocators.searchButton).click();
    }

    public List<String> searchDropDownOptions(){
        Locator searchOptions = page.locator(HomeLocators.searchOptionValues);
        List<String> searchOptionValues = searchOptions.allTextContents();
        return searchOptionValues;
    }

    public void clickHamburgerMenuIcon(){
        page.locator(HomeLocators.hamburgerMenu).click();
        logger.info("Hamburger menu clicked");
        logger.info("Waiting for load state done");
    }

    public void navigateToTVAppliances(){
        logger.info("In function, navigateToTVAppliances()");
        page.waitForTimeout(HomePageConstants.timeOut);
        page.locator(HomeLocators.tvAppliancesAndElectronics).click();
        logger.info("Clicked on TV, Appliances, Electronics");
    }

    public TVCategoryPage clickSubMenuOptionTelevision(){
        logger.info("In function , clickSubMenuOptionTelevision()");
        page.waitForTimeout(HomePageConstants.timeOut);
        logger.info("Waiting done. Clicking submenu tv link ");
        page.locator(HomeLocators.submenuTV).nth(3).click();
        logger.info("Clicking submenu tv link done, system will now navigate to new page");
        return new TVCategoryPage(page);
    }

}