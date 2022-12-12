package org.amazon.base;

import com.microsoft.playwright.Page;
import org.amazon.factory.PlaywrightFactory;
import org.amazon.page.HomePage;
import org.amazon.page.BrandResultsPage;
import org.amazon.page.ItemDetailsPage;
import org.amazon.page.TVCategoryPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    private final Logger logger = Logger.getLogger(BaseTest.class);
    public static PlaywrightFactory pf;
    public static Page page;
    protected Properties properties;
    protected static HomePage homePage;
    protected static TVCategoryPage tvCategoryPage;
    protected static BrandResultsPage brandResultsPage;
    protected static ItemDetailsPage itemDetailsPage;

    @BeforeSuite
    public void setUp() throws IOException {
        logger.info("Initializing Playwright");
        pf=new PlaywrightFactory();
        properties = pf.init_prop();
        page = pf.initBrowser(properties);
        homePage = new HomePage(page);
    }

    protected String getCurrentURL(){
        return page.url();
    }

    protected String getCurrentTitle(){
        return page.title();
    }

    @AfterSuite
    public void tearDown(){
        logger.info("Closing the application");
        page.context().close();
        pf.closePlaywright();
    }
}
