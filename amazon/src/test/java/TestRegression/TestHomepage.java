package TestRegression;

import Regression.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomepage extends CommonAPI {
    HomePage homePage;
    @BeforeMethod
    public void start(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void clickaccont(){
        homePage.accont();
captureScreenshot(driver,"clickoccont");
    }
    @Test(priority = 2)
    public void search(){
        homePage.setSearch("phone");
captureScreenshot(driver,"search for phone");
    }
}
