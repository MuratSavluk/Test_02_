import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SiparisGecmisiniBilgisayaraindirme extends BaseDriver {
    @Test
    public void test(){
        driver.get("https://demowebshop.tricentis.com/");

        WebElement LoginBtn = driver.findElement(By.cssSelector("[class='ico-login']"));
        LoginBtn.click();
        MyFunc.Bekle(2);
        WebElement mail = driver.findElement(By.id("Email"));
        mail.sendKeys("technostudy13@gotmail.com");
        WebElement pswrd = driver.findElement(By.id("Password"));
        pswrd.sendKeys("technostudy13");
        WebElement girs = driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        girs.click();
        MyFunc.Bekle(2);

        WebElement hesabim = driver.findElement(By.xpath("//a[text()='technostudy13@gotmail.com']"));
        hesabim.click();
        MyFunc.Bekle(1);
        WebElement orders = driver.findElement(By.xpath("//a[text()='Orders' and @class]"));
        orders.click();
        MyFunc.Bekle(1);
        WebElement details = driver.findElement(By.xpath("(//input[@value='Details'])[1]"));
        details.click();
        MyFunc.Bekle(1);
        WebElement pdf = driver.findElement(By.xpath("//a[@class='button-2 pdf-order-button']"));
        pdf.click();


        BekleVeKapat();
    }
}
