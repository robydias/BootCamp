package Regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a")
    WebElement login;
    /**
     * This method will login
     *
     * @Author - rabah
     */
    public void Login() {
        login.click();

    }

}
