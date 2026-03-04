import HandlingData.AppLevelData;
import HandlingData.FeatureData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pom.AccountLogin;
import pom.MyAccount;
import pom.YourStore;
import utilities.Base;

public class login7WithPOM extends Base {

    @Test
    public void login1() throws InterruptedException {
        ys.clickOnMyAccountIcon();
        ys.clickOnLoginLink();
        al.enterEmail();
        al.enterPassword();
        al.clickOnLoginButton();
        ma.validateLoginStatus();
    }

}

