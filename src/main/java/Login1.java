import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class Login1 {
    @Test
    public void testLogin() throws InterruptedException {
        WebDriver driver = null;
        try {
            // 1- Open the browser
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            // Initialize WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // 2- Enter the url
            driver.get("https://janbaskdemo.com/");

            // 3- Click on My Account icon
            WebElement myAccountIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-user']")));
            myAccountIcon.click();

            // 4- Click on login Link
            WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Login']")));
            loginLink.click();

            // 5- Enter correct email
            WebElement emailTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-email']")));
            emailTextBox.sendKeys("jason.roger@janbask.com");

            // 6- Enter correct password
            WebElement passwordTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-password']")));
            passwordTextBox.sendKeys("test@1234");

            // 7- Click on Login button
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));
            loginButton.click();

            // 8- Validate Login Status
            String expectedPageTitle = "My Account";
            wait.until(ExpectedConditions.titleIs(expectedPageTitle));
            String actualPageTitle = driver.getTitle();
            Assert.assertEquals(actualPageTitle, expectedPageTitle, "Login failed: Title does not match");
            System.out.println("Login is successful..");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            Assert.fail("Test failed due to exception: " + e.getMessage());
        } finally {
            // 9- Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
