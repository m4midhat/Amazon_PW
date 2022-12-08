package org.amazon.page;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import org.amazon.constants.TVCategoryLocators;

public class TVCategoryPage {
    private Page page;

    public TVCategoryPage(Page page){
        this.page=page;

    }

    public String getTVCategoryPageTitle(){
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
        return page.title();
    }

    public String getTVCategoryPageURL(){
        return page.url();
    }

    public int getSubOptionsTV(){
        return  page.locator(TVCategoryLocators.subCategoryTVBar).count();
    }

    public String getTVSelectionSubOption(int optionNumber){
        return page.locator(TVCategoryLocators.subCategoryItems).nth(optionNumber).innerText().trim();
    }
}
