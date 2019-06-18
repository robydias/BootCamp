package Regression;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomePage extends MobileAPI {
@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]\n")
    WebElement bar;
    public void clicktest() throws InterruptedException {
   bar.click();

    }
}
