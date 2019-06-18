package TestRegression;

import Regression.HomePage;
import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends MobileAPI {
    @Test
    public void Testmust() throws InterruptedException {
        HomePage home= PageFactory.initElements(appiumDriver,HomePage.class);
        sleep(5);
        home.clicktest();

    }
}
