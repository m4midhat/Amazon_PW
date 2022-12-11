package org.amazon.page;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import org.amazon.constants.TVCategoryLocators;
import org.amazon.constants.TimeOuts;
import org.testng.log4testng.Logger;

public class TVCategoryPage {
    private Page page;
    private TVCategoryLocators tvCategoryLocators = new TVCategoryLocators();
    private final Logger logger = Logger.getLogger(TVCategoryPage.class);

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
        logger.info("Getting Sub options for TV");
        return  page.locator(tvCategoryLocators.getSubCategoryTVBar()).count();
    }

    public String getTVSelectionSubOption(int optionNumber){
        return page.locator(tvCategoryLocators.getSubCategoryItems()).nth(optionNumber).innerText().trim();
    }

    public boolean isResolutionBoxVisible(){
        return page.isVisible(tvCategoryLocators.getResolutionHeading());
    }
    public boolean isResolution8KVisible(){
        return page.isVisible(tvCategoryLocators.getResolution8K());
    }
    public boolean isResolution4KVisible(){
        return page.isVisible(tvCategoryLocators.getResolution4K());
    }
    public boolean isResolution1080pVisible(){
        return page.isVisible(tvCategoryLocators.getResolution1080p());
    }
    public boolean isResolution768pVisible(){
        return page.isVisible(tvCategoryLocators.getResolution768p());
    }
    public boolean isResolution720pVisible(){
        return page.isVisible(tvCategoryLocators.getResolution720p());
    }
    public boolean isResolution480pVisible(){
        return page.isVisible(tvCategoryLocators.getResolution480p());
    }

    public boolean isYear2022Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2022());
    }

    public boolean isYear2021Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2021());
    }
    public boolean isYear2020Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2020());
    }
    public boolean isYear2019Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2019());
    }
    public boolean isYear2018Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2018());
    }
    public boolean isYear2017Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2017());
    }
    public boolean isYear2016Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2016());
    }
    public boolean isPlatformHeadingVisible(){
        return page.isVisible(tvCategoryLocators.getSmartTVPlatformHeading());
    }
    public boolean isPlatformAndroidVisible(){
        return page.isVisible(tvCategoryLocators.getPlatformAndroid());
    }
    public boolean isPlatformFireOSVisible(){
        return page.isVisible(tvCategoryLocators.getPlaformFireOS());
    }
    public boolean isPlatformWebOSVisible(){
        return page.isVisible(tvCategoryLocators.getPlatformWebOS());
    }
    public boolean isPlatformTizenVisible(){
        return page.isVisible(tvCategoryLocators.getPlatformTizen());
    }
    public boolean isPlatformHomeOSVisible(){
        return page.isVisible(tvCategoryLocators.getPlatformHomeOS());
    }
    public boolean isBrandsHeadingVisible(){
        return page.isVisible(tvCategoryLocators.getBrandsHeading());
    }
    public boolean isBrandMIVisible(){
        return page.isVisible(tvCategoryLocators.getBrandMI());
    }
    public boolean isBrandSamsungVisible(){
        logger.info("Checking if brand Samsung is visible");
        return page.isVisible(tvCategoryLocators.getBrandSamsung());
    }
    public boolean isBrandLGVisible(){
        return page.isVisible(tvCategoryLocators.getBrandLG());
    }
    public boolean isBrandOnePlusVisible(){
        return page.isVisible(tvCategoryLocators.getBrandOnePlus());
    }
    public boolean isBrandCromaVisibele(){
        return page.isVisible(tvCategoryLocators.getBrandCroma());
    }
    public boolean isBrandTCLVisible(){
        return page.isVisible(tvCategoryLocators.getBrandTCL());
    }
    public boolean isBrandHisenceVisible(){
        return page.isVisible(tvCategoryLocators.getBrandHisence());
    }
    public void clickBrandSamsung(){
        page.locator(tvCategoryLocators.getBrandSamsung()).scrollIntoViewIfNeeded();
        logger.info("Scrolling and clicking to Samsung option");
        page.locator(tvCategoryLocators.getBrandSamsung()).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }
    public void clickBrandLG(){
        page.locator(tvCategoryLocators.getBrandLG()).scrollIntoViewIfNeeded();
        page.locator(tvCategoryLocators.getBrandLG()).click();
    }
    public void clickBrandOnePlus(){
        page.locator(tvCategoryLocators.getBrandOnePlus()).scrollIntoViewIfNeeded();
        page.locator(tvCategoryLocators.getBrandOnePlus()).click();
    }
    public void clickBrandCroma(){
        page.locator(tvCategoryLocators.getBrandCroma()).scrollIntoViewIfNeeded();
        page.locator(tvCategoryLocators.getBrandCroma()).click();
    }
    public void clickBrandTCL(){
        page.locator(tvCategoryLocators.getBrandTCL()).scrollIntoViewIfNeeded();
        page.locator(tvCategoryLocators.getBrandTCL()).click();
    }
    public void clickBrandHisence(){
        page.locator(tvCategoryLocators.getBrandHisence()).scrollIntoViewIfNeeded();
        page.locator(tvCategoryLocators.getBrandHisence()).click();
    }

    public BrandResultsPage selectBrandSamsung(){
        clickBrandSamsung();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
        page.waitForTimeout(TimeOuts.timeOut);
        logger.info("Selecting the option Samsung, system will now navigate to new page");
        return new BrandResultsPage(page);
    }
}
