import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class FirstTest {

    @Test
    public void openGoogleTest() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement element = driver.findElement(By.xpath("//h5"));
        System.out.println("first: " + element.getText());

        List<WebElement> list = driver.findElements(By.xpath("//h5"));
        for(WebElement el: list) {
            System.out.println(el.getText());
        }
        driver.quit();
    }
}
