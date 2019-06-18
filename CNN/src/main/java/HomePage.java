import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.Assertion;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[1]")
    WebElement us;
    @FindBy(xpath = "//*[@id=\"nav-section-submenu\"]/a[1]")
    WebElement submenu;
    @FindBy(xpath = "//*[@id=\"nav-section-submenu\"]/a[2]")
    WebElement energy;
    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[2]")
    WebElement world;
    @FindBy(xpath = "//*[@id=\"nav-section-submenu\"]/a[1]")
    WebElement africa;
    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[3]")
    WebElement politics;
    @FindBy(xpath = "//*[@id=\"nav\"]/div/div[2]/div[2]/ul[1]/li[2]/a")
    WebElement congress;
    @FindBy(xpath = "//*[@id=\"nav\"]/div/div[2]/div[2]/ul[1]/li[3]/a")
    WebElement supremecourt;
    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[4]")
    WebElement business;
    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[5]")
    WebElement opinion;
    @FindBy (id="search-button")
    WebElement searchbutton;
    @FindBy(id="search-input-field")
    WebElement searchfield;
    @FindBy(id="submit-button")
    WebElement submitbutton;
    @FindBy(xpath = "//*[@id=\"breaking-news\"]/div/div/div[2]/span")
    WebElement breakingnews;
    @FindBy(xpath = "//*[@id=\"logo\"]")
    WebElement CNNlogo;
    @FindBy(xpath = "//*[@id=\"homepage1-zone-1\"]/div[2]/div/div[1]/ul/li[1]/article/a/h2")
    WebElement textvalidation;

    public void setnewsdisp(){
        waitUntilVisible(By.xpath("//*[@id=\"homepage1-zone-1\"]/div[2]/div/div[1]/ul/li[1]/article/div/div[1]/a/img"));
    }
    public void setBreakingnews() {
    }

    public void setCNNlogo () {
        if (CNNlogo.isDisplayed()) {
            System.out.println("CNN displayed");
        }else{
            System.out.println("testfield");
        }
    }
    public void setTextvalidation () {
        String st ="Acting defense chief out of confirmation process";
        Assertion assertion = new Assertion();
        assertion.assertEquals("Acting defense chief out of confirmation process",st);
    }
    public void setUs() {
        us.click();
        submenu.click();
        driver.navigate().back();
        energy.click();
    }
    public void setWorld() {
        world.click();
        africa.click();
    }
    public void setPolitics() {
        politics.click();
        congress.click();
        driver.navigate().back();
        supremecourt.click();
    }
    public void setBusiness() {
        business.click();
    }
    public void setOpinion(){
        opinion.click();
    }
    public void setSearchnews(){
        searchbutton.click();
        searchfield.sendKeys("NewYorkNews");
        sleepFor(2);
        submitbutton.click();
        sleepFor(3);


    }



}
