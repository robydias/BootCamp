package TestRegression;

import Regression.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    HomePage homepage;
    @BeforeMethod
    public void init(){
        homepage= PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void login(){
        homepage.login("rabah","123");
        captureScreenshot(driver,"login");
    }
    @Test
    public void SearchFriend(){
        homepage.sedsearchname("rachid");
        captureScreenshot(driver,"SearchFriend");
    }
   @Test
    public void SendFriendRequest(){
        homepage.sedsearchname("rachid");
        homepage.sendrequest();
        captureScreenshot(driver,"sendfriendRequast");
    }

}
