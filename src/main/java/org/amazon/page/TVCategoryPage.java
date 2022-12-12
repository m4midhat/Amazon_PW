package org.amazon.page;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import org.amazon.constants.TVCategoryLocators;
import org.amazon.constants.TimeOuts;
import org.testng.log4testng.Logger;

/**
 * The type Tv category page.
 */
public class TVCategoryPage {
    private Page page;
    private TVCategoryLocators tvCategoryLocators = new TVCategoryLocators();
    private final Logger logger = Logger.getLogger(TVCategoryPage.class);

    /**
     * Instantiates a new Tv category page.
     *
     * @param page the page
     */
    public TVCategoryPage(Page page){
        this.page=page;

    }

    /**
     * Get tv category page title string.
     *
     * @return the string
     */
    public String getTVCategoryPageTitle(){
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
        return page.title();
    }

    /**
     * Get tv category page url string.
     *
     * @return the string
     */
    public String getTVCategoryPageURL(){
        return page.url();
    }

    /**
     * Get sub options tv int.
     *
     * @return the int
     */
    public int getSubOptionsTV(){
        logger.info("Getting Sub options for TV");
        return  page.locator(tvCategoryLocators.getSubCategoryTVBar()).count();
    }

    /**
     * Get tv selection sub option string.
     *
     * @param optionNumber the option number to be selected
     * @return the string
     */
    public String getTVSelectionSubOption(int optionNumber){
        return page.locator(tvCategoryLocators.getSubCategoryItems()).nth(optionNumber).innerText().trim();
    }

    /**
     * Is resolution box visible boolean.
     *
     * @return the boolean
     */
    public boolean isResolutionBoxVisible(){
        return page.isVisible(tvCategoryLocators.getResolutionHeading());
    }

    /**
     * Is resolution 8 k visible boolean.
     *
     * @return the boolean
     */
    public boolean isResolution8KVisible(){
        return page.isVisible(tvCategoryLocators.getResolution8K());
    }

    /**
     * Is resolution 4 k visible boolean.
     *
     * @return the boolean
     */
    public boolean isResolution4KVisible(){
        return page.isVisible(tvCategoryLocators.getResolution4K());
    }

    /**
     * Is resolution 1080 p visible boolean.
     *
     * @return the boolean
     */
    public boolean isResolution1080pVisible(){
        return page.isVisible(tvCategoryLocators.getResolution1080p());
    }

    /**
     * Is resolution 768 p visible boolean.
     *
     * @return the boolean
     */
    public boolean isResolution768pVisible(){
        return page.isVisible(tvCategoryLocators.getResolution768p());
    }

    /**
     * Is resolution 720 p visible boolean.
     *
     * @return the boolean
     */
    public boolean isResolution720pVisible(){
        return page.isVisible(tvCategoryLocators.getResolution720p());
    }

    /**
     * Is resolution 480 p visible boolean.
     *
     * @return the boolean
     */
    public boolean isResolution480pVisible(){
        return page.isVisible(tvCategoryLocators.getResolution480p());
    }

    /**
     * Is year 2022 visible boolean.
     *
     * @return the boolean
     */
    public boolean isYear2022Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2022());
    }

    /**
     * Is year 2021 visible boolean.
     *
     * @return the boolean
     */
    public boolean isYear2021Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2021());
    }

    /**
     * Is year 2020 visible boolean.
     *
     * @return the boolean
     */
    public boolean isYear2020Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2020());
    }

    /**
     * Is year 2019 visible boolean.
     *
     * @return the boolean
     */
    public boolean isYear2019Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2019());
    }

    /**
     * Is year 2018 visible boolean.
     *
     * @return the boolean
     */
    public boolean isYear2018Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2018());
    }

    /**
     * Is year 2017 visible boolean.
     *
     * @return the boolean
     */
    public boolean isYear2017Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2017());
    }

    /**
     * Is year 2016 visible boolean.
     *
     * @return the boolean
     */
    public boolean isYear2016Visible(){
        return page.isVisible(tvCategoryLocators.getModelYear2016());
    }

    /**
     * Is platform heading visible boolean.
     *
     * @return the boolean
     */
    public boolean isPlatformHeadingVisible(){
        return page.isVisible(tvCategoryLocators.getSmartTVPlatformHeading());
    }

    /**
     * Is platform android visible boolean.
     *
     * @return the boolean
     */
    public boolean isPlatformAndroidVisible(){
        return page.isVisible(tvCategoryLocators.getPlatformAndroid());
    }

    /**
     * Is platform fire os visible boolean.
     *
     * @return the boolean
     */
    public boolean isPlatformFireOSVisible(){
        return page.isVisible(tvCategoryLocators.getPlaformFireOS());
    }

    /**
     * Is platform web os visible boolean.
     *
     * @return the boolean
     */
    public boolean isPlatformWebOSVisible(){
        return page.isVisible(tvCategoryLocators.getPlatformWebOS());
    }

    /**
     * Is platform tizen visible boolean.
     *
     * @return the boolean
     */
    public boolean isPlatformTizenVisible(){
        return page.isVisible(tvCategoryLocators.getPlatformTizen());
    }

    /**
     * Is platform home os visible boolean.
     *
     * @return the boolean
     */
    public boolean isPlatformHomeOSVisible(){
        return page.isVisible(tvCategoryLocators.getPlatformHomeOS());
    }

    /**
     * Is brands heading visible boolean.
     *
     * @return the boolean
     */
    public boolean isBrandsHeadingVisible(){
        return page.isVisible(tvCategoryLocators.getBrandsHeading());
    }

    /**
     * Is brand mi visible boolean.
     *
     * @return the boolean
     */
    public boolean isBrandMIVisible(){
        return page.isVisible(tvCategoryLocators.getBrandMI());
    }

    /**
     * Is brand samsung visible boolean.
     *
     * @return the boolean
     */
    public boolean isBrandSamsungVisible(){
        logger.info("Checking if brand Samsung is visible");
        return page.isVisible(tvCategoryLocators.getBrandSamsung());
    }

    /**
     * Is brand lg visible boolean.
     *
     * @return the boolean
     */
    public boolean isBrandLGVisible(){
        return page.isVisible(tvCategoryLocators.getBrandLG());
    }

    /**
     * Is brand one plus visible boolean.
     *
     * @return the boolean
     */
    public boolean isBrandOnePlusVisible(){
        return page.isVisible(tvCategoryLocators.getBrandOnePlus());
    }

    /**
     * Is brand croma visibele boolean.
     *
     * @return the boolean
     */
    public boolean isBrandCromaVisibele(){
        return page.isVisible(tvCategoryLocators.getBrandCroma());
    }

    /**
     * Is brand tcl visible boolean.
     *
     * @return the boolean
     */
    public boolean isBrandTCLVisible(){
        return page.isVisible(tvCategoryLocators.getBrandTCL());
    }

    /**
     * Is brand hisence visible boolean.
     *
     * @return the boolean
     */
    public boolean isBrandHisenceVisible(){
        return page.isVisible(tvCategoryLocators.getBrandHisence());
    }

    /**
     * Click brand samsung.
     */
    public void clickBrandSamsung(){
        page.locator(tvCategoryLocators.getBrandSamsung()).scrollIntoViewIfNeeded();
        logger.info("Scrolling and clicking to Samsung option");
        page.locator(tvCategoryLocators.getBrandSamsung()).click();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
    }

    /**
     * Click brand lg.
     */
    public void clickBrandLG(){
        page.locator(tvCategoryLocators.getBrandLG()).scrollIntoViewIfNeeded();
        page.locator(tvCategoryLocators.getBrandLG()).click();
    }

    /**
     * Click brand one plus.
     */
    public void clickBrandOnePlus(){
        page.locator(tvCategoryLocators.getBrandOnePlus()).scrollIntoViewIfNeeded();
        page.locator(tvCategoryLocators.getBrandOnePlus()).click();
    }

    /**
     * Click brand croma.
     */
    public void clickBrandCroma(){
        page.locator(tvCategoryLocators.getBrandCroma()).scrollIntoViewIfNeeded();
        page.locator(tvCategoryLocators.getBrandCroma()).click();
    }

    /**
     * Click brand tcl.
     */
    public void clickBrandTCL(){
        page.locator(tvCategoryLocators.getBrandTCL()).scrollIntoViewIfNeeded();
        page.locator(tvCategoryLocators.getBrandTCL()).click();
    }

    /**
     * Click brand hisence.
     */
    public void clickBrandHisence(){
        page.locator(tvCategoryLocators.getBrandHisence()).scrollIntoViewIfNeeded();
        page.locator(tvCategoryLocators.getBrandHisence()).click();
    }

    /**
     * Select brand samsung brand results page.
     *
     * @return the brand results page
     */
    public BrandResultsPage selectBrandSamsung(){
        clickBrandSamsung();
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
        page.waitForTimeout(TimeOuts.timeOut);
        logger.info("Selecting the option Samsung, system will now navigate to new page");
        return new BrandResultsPage(page);
    }
}
