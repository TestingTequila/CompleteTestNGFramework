package pom;

import HandlingData.AppLevelData;
import HandlingData.FeatureData;
import org.openqa.selenium.WebDriver;
import reusablemethods.CommonMethods;

public class MyAccount
{
    WebDriver driver;
    CommonMethods cm;
    public  MyAccount(WebDriver driver)
    {
        this.driver = driver;
        cm= new CommonMethods(driver);
    }

    public void validateLoginStatus()
    {
        cm.doTitleValidation(AppLevelData.EXPECTED_PAGE_TITLE);
    }
}
