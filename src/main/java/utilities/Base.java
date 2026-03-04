package utilities;

import HandlingData.AppLevelData;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pom.AccountLogin;
import pom.MyAccount;
import pom.YourStore;
import reusablemethods.CommonMethods;

public class Base {

    protected WebDriver driver;
    protected CommonMethods cm;
    protected YourStore ys;
    protected AccountLogin al;
    protected MyAccount ma;

    @BeforeMethod
    public void openBrowserAndEnterUrl() {
        // 1- Open the browser
        driver = HandlingBrowsers.launchBrowser(AppLevelData.BROWSER_NAME);
        // 2- Enter the url
        driver.get(AppLevelData.APP_URL);
        cm = new CommonMethods(driver);
        ys = new YourStore(driver);
        al = new AccountLogin(driver);
        ma= new MyAccount(driver);
    }


    @AfterMethod
    public void closeBrowser() {
        // 9- Close the browser
        HandlingBrowsers.closeBrowser();
    }
}
