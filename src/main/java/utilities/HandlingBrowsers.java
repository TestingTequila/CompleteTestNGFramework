package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HandlingBrowsers {
    static WebDriver driver;

    public static WebDriver launchBrowser(String browserName) {

        if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("IE")) {
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeBrowser() {
        driver.close();
    }
}
