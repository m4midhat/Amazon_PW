package org.amazon.constants;

import org.testng.log4testng.Logger;

public class TVCategoryLocators {
    private Logger logger = Logger.getLogger(TVCategoryLocators.class);

    private String subCategoryTVBar = "div#nav-subnav a";
    private  String subCategoryItems = "div#s-refinements div ul li";
    private  String resolutionHeading = "//span[normalize-space()='Resolution']";
    private  String resolution8K = "//li[@class=\"a-spacing-micro\"]//span[contains(text(),'8K')]";
    private  String resolution4K = "//li[@class=\"a-spacing-micro\"]//span[contains(text(),'4K')]";
    private  String resolution1080p = "//li[@class=\"a-spacing-micro\"]//span[contains(text(),'1080p')]";
    private  String resolution768p = "//li[@class=\"a-spacing-micro\"]//span[contains(text(),'768p')]";
    private  String resolution720p = "//li[@class=\"a-spacing-micro\"]//span[contains(text(),'720p')]";
    private  String resolution480p = "//li[@class=\"a-spacing-micro\"]//span[contains(text(),'480p')]";
    private  String modelYear2022 = "//span[@class=\"a-size-base a-color-base\"][normalize-space()='2022']";
    private  String modelYear2021 = "//span[@class=\"a-size-base a-color-base\"][normalize-space()='2021']";
    private  String modelYear2020 = "//span[@class=\"a-size-base a-color-base\"][normalize-space()='2020']";
    private  String modelYear2019 = "//span[@class=\"a-size-base a-color-base\"][normalize-space()='2019']";
    private  String modelYear2018 = "//span[@class=\"a-size-base a-color-base\"][normalize-space()='2018']";
    private  String modelYear2017 = "//span[@class=\"a-size-base a-color-base\"][normalize-space()='2017']";
    private  String modelYear2016 = "//span[@class=\"a-size-base a-color-base\"][normalize-space()='2016']";
    private  String smartTVPlatformHeading = "//span[normalize-space()='Smart TV Platform']";
    private  String platformAndroid = "//span[@class='a-size-base a-color-base'][normalize-space()='Android']";
    private  String plaformFireOS = "//span[contains(text(),'Fire OS')]";
    private  String platformHomeOS = "//span[contains(text(),'HomeOS')]";
    private  String platformTizen = "//span[contains(text(),'Tizen')]";
    private  String platformWebOS = "//span[contains(text(),'WebOS')]";
    private  String brandsHeading = "//span[normalize-space()='Brands']";
    private  String brandMI = "//span[@class='a-size-base a-color-base'][normalize-space()='MI']";
    private  String brandLG = "//span[@class='a-size-base a-color-base'][normalize-space()='LG']";
    private String brandSamsung = "//span[@class='a-size-base a-color-base'][normalize-space()='Samsung']";
    private  String brandOnePlus = "//span[@class='a-size-base a-color-base'][normalize-space()='OnePlus']";
    private  String brandCroma = "//span[@class='a-size-base a-color-base'][normalize-space()='CROMA']";
    private  String brandTCL = "//span[@class='a-size-base a-color-base'][normalize-space()='TCL']";
    private  String brandHisence = "//span[@class='a-size-base a-color-base'][normalize-space()='Hisense']";

    public void logInfo(String elementSelector){
        logger.info("Accessing the elementSelector via locator : " + elementSelector);
    }

    public  String getSubCategoryItems() {
        logInfo(subCategoryItems);
        return subCategoryItems;
    }

    public  String getResolutionHeading() {
        logInfo(resolutionHeading);
        return resolutionHeading;
    }

    public  String getResolution8K() {
        logInfo(resolution8K);
        return resolution8K;
    }

    public  String getResolution4K() {
        logInfo(resolution4K);
        return resolution4K;
    }

    public  String getResolution1080p() {
        logInfo(resolution1080p);
        return resolution1080p;
    }

    public  String getResolution768p() {
        logInfo(resolution768p);
        return resolution768p;
    }

    public  String getResolution720p() {
        logInfo(resolution720p);
        return resolution720p;
    }

    public  String getResolution480p() {
        logInfo(resolution480p);
        return resolution480p;
    }

    public  String getModelYear2022() {
        logInfo(modelYear2022);
        return modelYear2022;
    }

    public  String getModelYear2021() {
        logInfo(modelYear2021);
        return modelYear2021;
    }

    public  String getModelYear2020() {
        logInfo(modelYear2020);
        return modelYear2020;
    }

    public  String getModelYear2019() {
        logInfo(modelYear2019);
        return modelYear2019;
    }

    public  String getModelYear2018() {
        logInfo(modelYear2018);
        return modelYear2018;
    }

    public  String getModelYear2017() {
        logInfo(modelYear2017);
        return modelYear2017;
    }

    public  String getModelYear2016() {
        logInfo(modelYear2016);
        return modelYear2016;
    }

    public  String getSmartTVPlatformHeading() {
        logInfo(smartTVPlatformHeading);
        return smartTVPlatformHeading;
    }

    public  String getPlatformAndroid() {
        logInfo(platformAndroid);
        return platformAndroid;
    }

    public  String getPlaformFireOS() {
        logInfo(plaformFireOS);
        return plaformFireOS;
    }

    public  String getPlatformHomeOS() {
        logInfo(platformHomeOS);
        return platformHomeOS;
    }

    public  String getPlatformTizen() {
        logInfo(platformTizen);
        return platformTizen;
    }

    public  String getPlatformWebOS() {
        logInfo(platformWebOS);
        return platformWebOS;
    }

    public  String getBrandsHeading() {
        logInfo(brandsHeading);
        return brandsHeading;
    }

    public  String getBrandMI() {
        logInfo(brandMI);
        return brandMI;
    }

    public  String getBrandLG() {
        logInfo(brandLG);
        return brandLG;
    }

    public  String getBrandSamsung() {
        logInfo(brandSamsung);
        return brandSamsung;
    }

    public  String getBrandOnePlus() {
        logInfo(brandOnePlus);
        return brandOnePlus;
    }

    public  String getBrandCroma() {
        logInfo(brandCroma);
        return brandCroma;
    }

    public  String getBrandTCL() {
        logInfo(brandTCL);
        return brandTCL;
    }

    public  String getBrandHisence() {
        logInfo(brandHisence);
        return brandHisence;
    }

    public  String getSubCategoryTVBar() {
        logInfo(subCategoryTVBar);
        return subCategoryTVBar;
    }
}
