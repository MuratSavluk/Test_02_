package US_05_Login;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.linkText("Log in"));
        login.click();
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("javaselenium@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("AsdF0987");
        WebElement btn = driver.findElement(By.cssSelector("[type='submit'][value='Log in']"));
        btn.click();
        WebElement account = driver.findElement(By.linkText("javaselenium@gmail.com"));
        Assert.assertTrue(account.isDisplayed());
        bekleVeKapat();
    }

}
