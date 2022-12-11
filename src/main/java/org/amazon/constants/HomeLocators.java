package org.amazon.constants;

import org.testng.log4testng.Logger;

public class HomeLocators {
    private Logger logger = Logger.getLogger(HomeLocators.class);
    private final String hamburgerMenu = "[aria-label=\"Open Menu\"]";
    private final String navigationMenuItems = "nav-a";
    private final String searchTextBox = "twotabsearchtextbox";
    private final String searchDropDown = "searchDropdownBox";
    private final String searchButton = "nav-search-submit-button";
    private final String searchOptionValues = "select#searchDropdownBox option";
    private final String tvAppliancesAndElectronics = "text=TV, Appliances, Electronics";
    private final String submenuTV = "a:has-text(\"Televisions\"), div:has-text(\"Televisions\")";

    private void logInfo(String elementSelector){
        logger.info("Accessing the elementSelector via locator : " + elementSelector);
    }

    public String getHamburgerMenu() {
        logInfo(hamburgerMenu);
        return hamburgerMenu;
    }

    public String getNavigationMenuItems() {
        logInfo(navigationMenuItems);
        return navigationMenuItems;
    }

    public String getSearchTextBox() {
        logInfo(searchTextBox);
        return searchTextBox;
    }

    public String getSearchDropDown() {
        logInfo(searchDropDown);
        return searchDropDown;
    }

    public String getSearchButton() {
        logInfo(searchButton);
        return searchButton;
    }

    public String getSearchOptionValues() {
        logInfo(searchOptionValues);
        return searchOptionValues;
    }

    public String getTvAppliancesAndElectronics() {
        logInfo(tvAppliancesAndElectronics);
        return tvAppliancesAndElectronics;
    }

    public String getSubmenuTV() {
        logInfo(submenuTV);
        return submenuTV;
    }
}
