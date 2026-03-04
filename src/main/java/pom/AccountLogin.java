package pom;

import HandlingData.FeatureData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reusablemethods.CommonMethods;

public class AccountLogin {
    By loginButton = By.xpath("//input[@type='submit']");
    By passwordTextBox = By.xpath("//input[@id='input-password']");
    By emailTextBox = By.xpath("//input[@id='input-email']");

    WebDriver driver;
    CommonMethods cm;

    public AccountLogin(WebDriver driver) {
        this.driver = driver;
        cm = new CommonMethods(driver);

    }

    public void enterEmail() {
        cm.doSendKeys(emailTextBox, FeatureData.EMAIL_ID);
    }

    public void enterPassword() {
        cm.doSendKeys(passwordTextBox, FeatureData.PASSWORD);
    }

    public  void clickOnLoginButton()
    {
        cm.doClick(loginButton);
    }


}
