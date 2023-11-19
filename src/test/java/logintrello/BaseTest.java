package logintrello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseTest {

    static WebDriver driver;
    @BeforeSuite(alwaysRun = true)
    public void preconditions() {
        driver = new ChromeDriver();
        driver.navigate().to("https://trello.com/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterSuite(alwaysRun = true)
    public void postConditions() {
        driver.quit();
    }

    public WebElement findElementBase(By by) {
        return driver.findElement(by);
    }

    public void clickBase(By by) {
        findElementBase(by).click();
    }

    public void sendKeysBase(By by, String text) {
        WebElement el = findElementBase(by);
        el.click();
        el.clear();
        el.sendKeys(text);
    }
}
