package testngconcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGConcepts {
    @BeforeMethod
    public void enterUrlInBrowser() {
        System.out.println("@BeforeMethod--This will enter url in browser...");
    }

    @AfterMethod
    public void removeUrlFromBrowser() {
        System.out.println("@AfterMethod--This will remove url in browser...");

    }

    @Test
    public void login() {
        System.out.println("@Test--This is login Test Case....");
    }

    @Test
    public void registration() {
        System.out.println("@Test--This is registration Test Case....");
    }

    @Test
    public void payment() {
        System.out.println("@Test--This is Payment Test Case....");
    }
}
