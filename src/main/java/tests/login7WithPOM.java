package tests;

import org.testng.annotations.Test;
import utilities.Base;

public class login7WithPOM extends Base {

    @Test
    public void login1() throws InterruptedException {
        ys.clickOnMyAccountIcon();
        al = ys.clickOnLoginLink();
        al.enterEmail();
        al.enterPassword();
        ma = al.clickOnLoginButton();
        ma.validateLoginStatus();
    }

}

