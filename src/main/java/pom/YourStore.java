package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reusablemethods.CommonMethods;

public class YourStore {

    By myAccountIcon = By.xpath("//i[@class='fa fa-user']");
    By loginLink = By.xpath("//a[text()='Login']");

    WebDriver driver;
    CommonMethods commonMethods;

    public YourStore(WebDriver driver) {
        this.driver = driver;
        commonMethods = new CommonMethods(driver);
    }

    public void clickOnMyAccountIcon() throws InterruptedException {
        commonMethods.doClick(myAccountIcon);
        commonMethods.doWait(3000);
    }

    public AccountLogin clickOnLoginLink() {
        commonMethods.doClick(loginLink);
        return new AccountLogin(driver);
    }
}
