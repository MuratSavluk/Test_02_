package Data;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;



// 1-  Bir kullanıcı olarak, web mağazamdan hesabımdan çıkış yapabilmeliyim. Böylece alışverişim daha güvenli olur.
//  2-  Kullanıcı hesaptan çıkış yapabilmelidir. Kullanıcı oturumu başarıyla kapattığı zaman giriş yapma sayfasına yönlendirilmelidir.
// 3-   Kullanıcı web sitesine giriş yapmış durumda olmalıdır.

public class OturumKapatma extends Data.BaseDriver {
    @Test
    public void test(){

        driver.get("https://demowebshop.tricentis.com/");

        WebElement LoginBtn = driver.findElement(By.cssSelector("[class='ico-login']"));
        LoginBtn.click();
        Data.MyFunc.Bekle(2);

        WebElement mail = driver.findElement(By.id("Email"));
        mail.sendKeys("technostudy13@gotmail.com");
        WebElement pswrd = driver.findElement(By.id("Password"));
        pswrd.sendKeys("technostudy13");

        WebElement girisYap = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Data.MyFunc.Bekle(2);
        girisYap.click();

        WebElement cikis = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        Data.MyFunc.Bekle(1);
        cikis.click();

        WebElement LoginGrs = driver.findElement(By.cssSelector("[class='ico-login']"));
        LoginGrs.click();
        Data.MyFunc.Bekle(2);

        WebElement LoginAnaSayfa = driver.findElement(By.cssSelector("[class='ico-login']"));
        Data.MyFunc.Bekle(2);
        LoginAnaSayfa.click();

        Data.MyFunc.Bekle(1);
        bekleVeKapat();



    }


}
