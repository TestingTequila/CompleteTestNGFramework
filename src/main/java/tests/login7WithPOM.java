package tests;

import org.testng.annotations.Test;
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

