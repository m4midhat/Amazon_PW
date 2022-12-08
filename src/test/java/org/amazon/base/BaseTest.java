package org.amazon.base;

import com.microsoft.playwright.Page;
import org.amazon.factory.PlaywrightFactory;
import org.amazon.page.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    private final Logger logger = Logger.getLogger(BaseTest.class);
    protected PlaywrightFactory pf;
    protected Page page;
    protected Properties properties;
    protected HomePage homePage;

    @BeforeClass
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

    @AfterClass
    public void tearDown(){
        logger.info("Closing the application");
        page.context().close();
        pf.closePlaywright();
    }
}
