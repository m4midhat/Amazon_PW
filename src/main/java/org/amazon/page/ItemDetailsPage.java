package org.amazon.page;

import com.microsoft.playwright.Page;
import org.amazon.constants.ItemDetailsLocators;

import java.util.List;

/**
 * The type Item details page.
 */
public class ItemDetailsPage {
    private Page page;
    private ItemDetailsLocators itemDetailsLocators = new ItemDetailsLocators();

    /**
     * Instantiates a new Item details page.
     *
     * @param page the page
     */
    public ItemDetailsPage(Page page) {
        this.page = page;
    }

    /**
     * Get page title string.
     *
     * @return the string
     */
    public String getPageTitle(){
        return page.title();
    }

    /**
     * Availability of about item boolean.
     *
     * @return the boolean
     */
    public boolean availabilityOfAboutItem(){
        return page.isVisible(itemDetailsLocators.getAboutThisItem());
    }

    /**
     * About this item list.
     *
     * @return the list
     */
    public List<String> aboutThisItem(){
        return page.locator(itemDetailsLocators.getAboutThisItemBullets()).allTextContents();
    }
}
