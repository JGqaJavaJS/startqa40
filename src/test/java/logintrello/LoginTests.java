package logintrello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{
    @Test
    public void loginPositive() {
       // driver.findElement(By.xpath("//a[contains(@data-uuid, 'login')]")).click();
        clickBase(By.xpath("//a[contains(@data-uuid, 'login')]"));

//        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='username']"));
//        inputEmail.click();
//        inputEmail.clear();
//        inputEmail.sendKeys("juliagordyin@gmail.com");
        sendKeysBase(By.xpath("//input[@id='username']"), "juliagordyin@gmail.com");

        //driver.findElement(By.xpath("//button[@id='login-submit']")).click();
        clickBase(By.xpath("//button[@id='login-submit']"));

//        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
//        inputPassword.click();
//        inputPassword.clear();
//        inputPassword.sendKeys("123456Aa$");
        sendKeysBase(By.xpath("//input[@id='password']"), "123456Aa$");

        //driver.findElement(By.xpath("//button[@id='login-submit']")).click();
        clickBase(By.xpath("//button[@id='login-submit']"));

        String boardText = driver.findElement(By.xpath("//span[text()='Boards']")).getText();

        Assert.assertEquals(boardText, "Boards", "text not Boards");

//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }

    @Test
    public void loginPositive2() {
        clickBase(By.xpath("//a[contains(@data-uuid, 'login')]"));
        sendKeysBase(By.xpath("//input[@id='username']"), "juliagordyin@gmail.com");
        clickBase(By.xpath("//button[@id='login-submit']"));
        sendKeysBase(By.xpath("//input[@id='password']"), "123456Aa$");
        clickBase(By.xpath("//button[@id='login-submit']"));
        String boardText = driver.findElement(By.xpath("//span[text()='Boards']")).getText();
        Assert.assertEquals(boardText, "Boards", "text not Boards");
    }
}
