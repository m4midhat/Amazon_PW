package org.amazon.utility;

import com.microsoft.playwright.Page;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

import static org.amazon.factory.PlaywrightFactory.getPage;

public class Util {

    private static final String screenshotFolder= "../screenshot/";

    public static Integer parseStringToInt(String s){
        s = s.replaceAll(",", ""); //remove commas
        return (int)Math.round(Double.parseDouble(s)); //return rounded double cast to int
    }

    public static boolean isSorted(List<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) < array.get(i + 1)) {
                System.out.println("Failure upon comparing sorting; high value(" + array.get(i)+") & low value("+ array.get(i+1)+")");
                return false;
            }
        }
        return true;
    }

    public Properties init_prop() throws IOException {
        FileInputStream inputStream = new FileInputStream("./src/main/resources/config/config.properties");
        Properties properties = new Properties();
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

}
