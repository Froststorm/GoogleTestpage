import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anrii on 30.11.2015.
 */
public class ResultPage {
    private WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstLink() {

     return driver.findElement(By.xpath("(//*[@id='rso']/div[1]/div/div/h3/a)[1]")).getText();

    }
}
