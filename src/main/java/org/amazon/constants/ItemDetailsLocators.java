package org.amazon.constants;

import org.testng.log4testng.Logger;

public class ItemDetailsLocators {
    private String aboutThisItem = "h1.a-size-base-plus.a-text-bold";
    private String aboutThisItemBullets = "ul.a-unordered-list.a-vertical.a-spacing-mini li";

    private Logger logger = Logger.getLogger(ItemDetailsLocators.class);

    public void logInfo(String elementSelector){
        logger.info("Accessing the elementSelector via locator : " + elementSelector);
    }

    public String getAboutThisItem(){
        logInfo(aboutThisItem);
        return aboutThisItem;
    }

    public String getAboutThisItemBullets() {
        logInfo(aboutThisItemBullets);
        return aboutThisItemBullets;
    }
}
