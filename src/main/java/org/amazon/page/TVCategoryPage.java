package org.amazon.page;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;

public class TVCategoryPage {
    private Page page;

    public TVCategoryPage(Page page){
        this.page=page;

    }

    public String getTVCategoreyPageTitle(){
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
        return page.title();
    }

    public String getTVCategoryPageURL(){
        return page.url();
    }
}
