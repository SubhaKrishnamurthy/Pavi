package driver;

import helper.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.time.Duration;

public class DriverManager {

    public static String EnvironmentType;
    public static String DriverType;
    protected WebDriver driver;
    protected WebDriverWait wait;

    public DriverManager() throws FileNotFoundException {
        DriverType = PropertyReader.valueOf("Driver.DriverType").trim();
        EnvironmentType =PropertyReader.valueOf("Driver.OS").trim();
    }

    public WebDriver getDriver() {
        createDriver();
        return driver;
    }

    private WebDriver createDriver()
    {
        switch (EnvironmentType.toLowerCase()){
            case "windows":
                driver = createWindowDriver();
                break;
        }
        return driver;
    }

    private WebDriver createWindowDriver()
    {
        switch (DriverType){
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "/Users/subhakrish/Documents/Selenium-Base/sample/driver/chromedriver");
                driver = new ChromeDriver();
                break;
        }
        return driver;
    }

    public WebDriverWait getWait(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15L));
        return wait;
    }
}
