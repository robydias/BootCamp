package TestRegression;


import Regression.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
    public class TestHomePage extends CommonAPI{


        HomePage home;

        @BeforeMethod
        public void initialization() {
            home = PageFactory.initElements(driver, HomePage.class);
        }

        @Test(enabled = false)
        public void testSignIn(){
            home.signIn();
            sleepFor(3);
        }

        @Test(enabled = false)
        public void testbanking(){
            home.banking();
        }

        @Test(enabled = true)
        public void testSearch(){
            home.search();
        }

    }
