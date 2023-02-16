package base;
import driver.DriverManager;
import helper.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;

public class Keywords {

    public static WebDriver driver;
    public static WebDriverWait webDriverWait;
    public static void launchApplication() throws FileNotFoundException {
        try {
            DriverManager webDriverManager = new DriverManager();

            driver = webDriverManager.getDriver();
            webDriverWait=webDriverManager.getWait();
            driver.get(PropertyReader.valueOf("Driver.Applicationurl").trim());
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void quitDriver()
    {
        driver.quit();
    }
}
