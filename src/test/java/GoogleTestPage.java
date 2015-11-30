import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;


public class GoogleTestPage {

    private WebDriver driver ;

    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http:/google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterTest
    public void Teardown(){
        driver.close();

    }

    @Test
        public void TestSearch(){
            HomePage home = new HomePage(driver);
            ResultPage result = home.search("automated testing info");
            assertTrue(result.getFirstLink().contains("automated"));

    }

    @Test (priority = 1)
    public void TestSearch1(){
        HomePage home = new HomePage(driver);
        ResultPage result = home.search("wikipedia");
        assertTrue(result.getFirstLink().contains("automated"));

    }

}
