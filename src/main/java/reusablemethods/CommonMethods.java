package reusablemethods;

import HandlingData.AppLevelData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {
    WebDriver driver;

    public CommonMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void doClick(By locator) {
        WebElement we = driver.findElement(locator);
        we.click();
    }

    public void doWait(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void doSendKeys(By locator, String text) {
        WebElement we = driver.findElement(locator);
        we.sendKeys(text);
    }

    public void doTitleValidation(String EXPECTED_PAGE_TITLE) {
        if (driver.getTitle().equalsIgnoreCase(EXPECTED_PAGE_TITLE)) {
            System.out.println(AppLevelData.SUCCESS_MSG);
        } else {
            System.out.println(AppLevelData.FAILURE_MSG);
        }
    }
}
