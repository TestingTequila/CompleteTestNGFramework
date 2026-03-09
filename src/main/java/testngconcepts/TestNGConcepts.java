package testngconcepts;

import org.testng.annotations.*;

public class TestNGConcepts {
    @BeforeMethod
    @Parameters("url")
    public void enterUrlInBrowser(String url) {
        System.out.println("@BeforeMethod--This will enter url in browser: " + url);
    }

    @AfterMethod
    public void removeUrlFromBrowser() {
        System.out.println("@AfterMethod--This will remove url in browser...");

    }

    @Test
    @Parameters()
    public void login() {
        System.out.println("@Test--This is login Test Case....");
    }


    @Test(dataProvider = "getData")
    public static void login1(String email, String password) {
        System.out.println("@Test--The user with " + email + " and password : " + password);
    }

    @DataProvider
    public  Object[][] getData()
    {
        Object[][] data ={{"jason.roger@janbask.com", "test@12345"}, {"tony.hill@janbask.com", "test@12346"}, {"kerrie.wright@janbask.com", "test@12347"}};
        return  data;
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
