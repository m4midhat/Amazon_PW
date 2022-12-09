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

    public boolean isResolutionBoxVisible(){
        return page.isVisible(TVCategoryLocators.resolutionHeading);
    }
    public boolean isResolution8KVisible(){
        return page.isVisible(TVCategoryLocators.resolution8K);
    }
    public boolean isResolution4KVisible(){
        return page.isVisible(TVCategoryLocators.resolution4K);
    }
    public boolean isResolution1080pVisible(){
        return page.isVisible(TVCategoryLocators.resolution1080p);
    }
    public boolean isResolution768pVisible(){
        return page.isVisible(TVCategoryLocators.resolution768p);
    }
    public boolean isResolution720pVisible(){
        return page.isVisible(TVCategoryLocators.resolution720p);
    }
    public boolean isResolution480pVisible(){
        return page.isVisible(TVCategoryLocators.resolution480p);
    }

    public boolean isYear2022Visible(){
        return page.isVisible(TVCategoryLocators.modelYear2022);
    }

    public boolean isYear2021Visible(){
        return page.isVisible(TVCategoryLocators.modelYear2021);
    }
    public boolean isYear2020Visible(){
        return page.isVisible(TVCategoryLocators.modelYear2020);
    }
    public boolean isYear2019Visible(){
        return page.isVisible(TVCategoryLocators.modelYear2019);
    }
    public boolean isYear2018Visible(){
        return page.isVisible(TVCategoryLocators.modelYear2018);
    }
    public boolean isYear2017Visible(){
        return page.isVisible(TVCategoryLocators.modelYear2017);
    }
    public boolean isYear2016Visible(){
        return page.isVisible(TVCategoryLocators.modelYear2016);
    }
    public boolean isPlatformHeadingVisible(){
        return page.isVisible(TVCategoryLocators.smartTVPlatformHeading);
    }
    public boolean isPlatformAndroidVisible(){
        return page.isVisible(TVCategoryLocators.platformAndroid);
    }
    public boolean isPlatformFireOSVisible(){
        return page.isVisible(TVCategoryLocators.plaformFireOS);
    }
    public boolean isPlatformWebOSVisible(){
        return page.isVisible(TVCategoryLocators.platformWebOS);
    }
    public boolean isPlatformTizenVisible(){
        return page.isVisible(TVCategoryLocators.platformTizen);
    }
    public boolean isPlatformHomeOSVisible(){
        return page.isVisible(TVCategoryLocators.platformHomeOS);
    }
    public boolean isBrandsHeadingVisible(){
        return page.isVisible(TVCategoryLocators.brandsHeading);
    }
    public boolean isBrandMIVisible(){
        return page.isVisible(TVCategoryLocators.brandMI);
    }
    public boolean isBrandSamsungVisible(){
        return page.isVisible(TVCategoryLocators.brandSamsung);
    }
    public boolean isBrandLGVisible(){
        return page.isVisible(TVCategoryLocators.brandLG);
    }
    public boolean isBrandOnePlusVisible(){
        return page.isVisible(TVCategoryLocators.brandOnePlus);
    }
    public boolean isBrandCromaVisibele(){
        return page.isVisible(TVCategoryLocators.brandCroma);
    }
    public boolean isBrandTCLVisible(){
        return page.isVisible(TVCategoryLocators.brandTCL);
    }
    public boolean isBrandHisenceVisible(){
        return page.isVisible(TVCategoryLocators.brandHisence);
    }
    public void clickBrandSamsung(){
        page.locator(TVCategoryLocators.brandSamsung).scrollIntoViewIfNeeded();
        page.locator(TVCategoryLocators.brandSamsung).click();
    }
    public void clickBrandLG(){
        page.locator(TVCategoryLocators.brandLG).scrollIntoViewIfNeeded();
        page.locator(TVCategoryLocators.brandLG).click();
    }
    public void clickBrandOnePlus(){
        page.locator(TVCategoryLocators.brandOnePlus).scrollIntoViewIfNeeded();
        page.locator(TVCategoryLocators.brandOnePlus).click();
    }
    public void clickBrandCroma(){
        page.locator(TVCategoryLocators.brandCroma).scrollIntoViewIfNeeded();
        page.locator(TVCategoryLocators.brandCroma).click();
    }
    public void clickBrandTCL(){
        page.locator(TVCategoryLocators.brandTCL).scrollIntoViewIfNeeded();
        page.locator(TVCategoryLocators.brandTCL).click();
    }
    public void clickBrandHisence(){
        page.locator(TVCategoryLocators.brandHisence).scrollIntoViewIfNeeded();
        page.locator(TVCategoryLocators.brandHisence).click();
    }

    public BrandResultsPage selectBrandSamsung(){
        clickBrandSamsung();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
        page.waitForLoadState(LoadState.NETWORKIDLE);
        page.waitForTimeout(500);
        return new BrandResultsPage(page);
    }
}
