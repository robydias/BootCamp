package TestRegression;

import Regression.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomepage extends CommonAPI {
    HomePage homePage;

    @BeforeMethod
    public void init(){
        homePage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void LogIn(){
        homePage.Login();
    }

//@Test
//public void testFindDDF(){homePage.}
}
