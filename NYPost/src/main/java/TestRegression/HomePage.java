package TestRegression;

import base.MobileAPI;
import org.testng.annotations.Test;

public class HomePage extends MobileAPI {

    @Test
    public void scrap(){
        appiumDriver.scrollTo("help");

    }
}
