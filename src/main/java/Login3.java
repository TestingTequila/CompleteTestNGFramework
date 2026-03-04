import HandlingData.AppLevelData;
import HandlingData.FeatureData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login3 {

    public static void main(String[] args) throws InterruptedException {
        // 1- Open the browser
        WebDriver driver = utilities.HandlingBrowsers.launchBrowser(AppLevelData.BROWSER_NAME);

        // 2- Enter the url
        driver.get(AppLevelData.APP_URL);

        // 3- Click on My Account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        Thread.sleep(3000);

        // 4- Click on login Link
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();

        // 5- Enter correct email
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys(FeatureData.EMAIL_ID);

        // 6- Enter correct password
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys(FeatureData.PASSWORD);

        // 7- Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        // 8- Validate Login Status;
        String actualPageTitle = driver.getTitle();
        assert actualPageTitle != null;
        if (actualPageTitle.equalsIgnoreCase(AppLevelData.EXPECTED_PAGE_TITLE)) {
            System.out.println(AppLevelData.SUCCESS_MSG);
        } else {
            System.out.println(AppLevelData.FAILURE_MSG);
        }
        // 9- Close the browser
        driver.close();

    }
}
