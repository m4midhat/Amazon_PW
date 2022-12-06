package org.amazon.page;

import com.microsoft.playwright.Page;
import org.testng.log4testng.Logger;

public class HomePage {
    private Page page;

    private final Logger logger = Logger.getLogger(HomePage.class);
    public HomePage(Page page){
        this.page = page;
    }
    public String getPageTitle(){
        String pgTitle = page.title();
        logger.info("Extracted Page Title : " + pgTitle);
        return pgTitle;
    }

    public String getPageURL(){
        String url = page.url();
        logger.info("Extracted Page URL : "+ url);
        return url;
    }

}
