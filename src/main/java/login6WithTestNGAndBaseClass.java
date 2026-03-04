import HandlingData.AppLevelData;
import HandlingData.FeatureData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reusablemethods.CommonMethods;
import utilities.Base;
import utilities.HandlingBrowsers;

public class login6WithTestNGAndBaseClass extends Base {

    By myAccountIcon = By.xpath("//i[@class='fa fa-user']");
    By loginLink = By.xpath("//a[text()='Login']");
    By loginButton = By.xpath("//input[@type='submit']");
    By passwordTextBox = By.xpath("//input[@id='input-password']");
    By emailTextBox = By.xpath("//input[@id='input-email']");

    @Test
    public void login1() throws InterruptedException {

        // 3- Click on My Account icon
        cm.doClick(myAccountIcon);
        cm.doWait(3000);

        // 4- Click on login Link
        cm.doClick(loginLink);

        // 5- Enter correct email
        cm.doSendKeys(emailTextBox, FeatureData.EMAIL_ID);

        // 6- Enter correct password
        cm.doSendKeys(passwordTextBox, FeatureData.PASSWORD);

        // 7- Click on Login button
        cm.doClick(loginButton);

        // 8- Validate Login Status;
        cm.doTitleValidation(AppLevelData.EXPECTED_PAGE_TITLE);

    }

}

