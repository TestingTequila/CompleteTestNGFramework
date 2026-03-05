import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Register2 {

    public static double generateNumber() {
        return Math.random();
    }

    public static void main(String[] args) {
        //1. Open the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Enter the URL
        driver.get("https://janbaskdemo.com/");

        //3. Click on My Account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();

        //4. Click on Register link
        WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
        registerLink.click();

        //5. Fill the Registration form
        WebElement firstNameTextbox = driver.findElement(By.id("input-firstname"));
        firstNameTextbox.sendKeys("Charles");

        WebElement lastNameTextbox = driver.findElement(By.id("input-lastname"));
        lastNameTextbox.sendKeys("Babbage");

        WebElement emailTextbox = driver.findElement(By.name("email"));
        emailTextbox.sendKeys("charles.babbage" + Register2.generateNumber() + "@Janbask.com");

        WebElement telephoneTextbox = driver.findElement(By.id("input-telephone"));
        telephoneTextbox.sendKeys("57547475");

        List<WebElement> countryDdl = driver.findElements(By.xpath("//select[@name='country_id']/option"));
        for (WebElement we : countryDdl) {
            if (we.getText().equals("India")) {
                we.click();
                break;
            }
        }

        WebElement passwordTextbox = driver.findElement(By.id("input-password"));
        passwordTextbox.sendKeys("test@1234");

        WebElement confirmPasswordTextbox = driver.findElement(By.id("input-confirm"));
        confirmPasswordTextbox.sendKeys("test@1234");

        WebElement yesRadioButton = driver.findElement(By.xpath("//input[@value=1 and @name ='newsletter']"));
        yesRadioButton.click();

        //Select Subscription
        WebElement subscriptionDdl = driver.findElement(By.name("subscription"));
        Select subscription = new Select(subscriptionDdl);
        List<WebElement> subscriptions = subscription.getOptions();
        for (WebElement subs : subscriptions) {
            if (subs.getText().equals("Monthly")) {
                subs.click();
                break;
            }
        }

        //6. Click on Privacy Policy checkbox
        WebElement privacyPolicyCheckbox = driver.findElement(By.name("agree"));
        privacyPolicyCheckbox.click();

        //7. Click on Continue button
        WebElement submitButton = driver.findElement(By.id("submitbtn"));
        submitButton.click();

        //8. Validate Registration status
        String actualPageTitle = driver.getTitle();
        System.out.println("actualPageTitle" + actualPageTitle);

        if (!(actualPageTitle.equals("Register Account"))) {
            System.out.println("Registration Successful");
        } else {
            System.out.println("This email is already Registered ");
        }

        //9. Close the browser
        driver.close();

    }
}
