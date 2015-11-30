import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anrii on 30.11.2015.
 */
public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public ResultPage search(String string) {
        driver.findElement(By.id("lst-ib")).sendKeys(string);


        return new ResultPage(driver);
    }
}
