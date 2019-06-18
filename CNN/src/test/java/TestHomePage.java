import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    HomePage homePage;
    @BeforeMethod
    public void intit(){
        homePage = PageFactory.initElements(driver,HomePage.class);
    }
    //@Test
    public void setUsTest(){
        homePage.setUs();

    }
    //@Test
    public void setWorldTest(){
        homePage.setWorld();
    }
    // @Test
    public  void setPoliticsTest(){
        homePage.setPolitics();
    }
    @Test
    public void setsearchNewsTest(){
        homePage.setSearchnews();
    }
    // @Test
    public void setnewdispTest(){

        homePage.setnewsdisp();
    }
    //@Test
    public void setLogoTest(){
        homePage.setCNNlogo();
    }
    @Test
    public void setTextvalidationTest(){
        homePage.setTextvalidation();

    }


}
