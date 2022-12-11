package org.amazon.factory;


import com.microsoft.playwright.*;
import org.amazon.constants.TimeOuts;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

public class PlaywrightFactory {


    private static final ThreadLocal<Playwright> playwrightThreadLocal = new ThreadLocal<>();
    private static final ThreadLocal<Browser> browserThreadLocal = new InheritableThreadLocal<>();
    private static final ThreadLocal<BrowserContext> browserContextThreadLocal = new ThreadLocal<>();
    private static final ThreadLocal<Page> pageThreadLocal = new ThreadLocal<>();
    Properties properties;
    private static final String screenshotFolder= "../screenshot/";

    private static Playwright getPlaywright(){
        return playwrightThreadLocal.get();
    }

    private static Browser getBrowser(){
        return browserThreadLocal.get();
    }

    private static BrowserContext getBrowserContext(){
        return browserContextThreadLocal.get();
    }

    private static Page getPage(){
        return pageThreadLocal.get();
    }

    public Page initBrowser(Properties properties){

        String browserName = properties.getProperty("browser").trim();
        System.out.println("Browser name : "+browserName);
        playwrightThreadLocal.set(Playwright.create());

        switch (browserName.toLowerCase()){
            case "chromium":
                //browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                browserThreadLocal.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
                break;
            case "firefox":
                //browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                browserThreadLocal.set(getPlaywright().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false)));
                break;
            case "safari":
                //browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
                browserThreadLocal.set(getPlaywright().webkit().launch(new BrowserType.LaunchOptions().setHeadless(false)));
                break;
            case "chrome":
                //browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
                browserThreadLocal.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false)));
                break;
            case "msedge":
                //browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
                browserThreadLocal.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false)));
                break;

            default:
                System.out.println("Invalid browser name !!!");
                break;
        }

        browserContextThreadLocal.set(getBrowser().newContext());
        getBrowserContext().setDefaultTimeout(TimeOuts.applicationTimeOut);

//        page = browserContext.newPage();
        pageThreadLocal.set(browserContextThreadLocal.get().newPage());
        String url = properties.getProperty("url");
        System.out.println("Navigating to : " + url);
        getPage().navigate(url);
        return getPage();

    }

    public Properties init_prop() throws IOException {
        FileInputStream inputStream = new FileInputStream("./src/main/resources/config/config.properties");
        properties = new Properties();
        properties.load(inputStream);

        return properties;
    }

    public static String takeScreenshot() {
        String filename = System.currentTimeMillis() + ".png";
        String path = System.getProperty("user.dir") + "/screenshot/" +filename;
        String screenshotFile = screenshotFolder+filename;

        getPage().screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get(path))
                .setFullPage(true));
        return screenshotFile;
    }

    public void closePlaywright(){

        getPlaywright().close();
    }
}
