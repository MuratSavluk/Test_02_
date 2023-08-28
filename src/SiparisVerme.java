import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.xml.bind.annotation.XmlAnyAttribute;

public class SiparisVerme extends BaseDriver {
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

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        MyFunc.Bekle(2);
        WebElement bilgsyr = driver.findElement(By.xpath("(//input[@value='Add to cart'])[5]"));
        bilgsyr.click();
        MyFunc.Bekle(2);
        WebElement addToCart = driver.findElement(By.cssSelector("[class='button-1 add-to-cart-button']"));
        addToCart.click();
        MyFunc.Bekle(2);
        WebElement shoppingCart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppingCart.click();

        WebElement country = driver.findElement(By.xpath("//select[@id='CountryId']"));
        Select countryMenu = new Select(country);
        countryMenu.selectByIndex(1);
        MyFunc.Bekle(1);
        WebElement state = driver.findElement(By.xpath("//select[@id='StateProvinceId']"));
        Select stateMenu = new Select(state);
        stateMenu.selectByIndex(1);
        WebElement agree = driver.findElement(By.xpath("//input[@id='termsofservice']"));
        agree.click();
        WebElement checkout = driver.findElement(By.xpath("//*[@id='checkout']"));
        checkout.click();

        WebElement devam = driver.findElement(By.xpath("//input[@title='Continue']"));
        devam.click();

        WebElement pickup = driver.findElement(By.id("PickUpInStore"));
        pickup.click();
        WebElement devam2 = driver.findElement(By.xpath("//*[@onclick='Shipping.save()']"));
        devam2.click();
        MyFunc.Bekle(2);

        WebElement creditCard = driver.findElement(By.xpath("//*[@id='paymentmethod_2']"));
        creditCard.click();
        WebElement devam3 = driver.findElement(By.xpath("//*[@onclick='PaymentMethod.save()']"));
        devam3.click();
        MyFunc.Bekle(2);

        WebElement typeCard = driver.findElement(By.id("CreditCardType"));
        Select cardType = new Select(typeCard);
        cardType.selectByVisibleText("Visa");
        WebElement cardHolder = driver.findElement(By.id("CardholderName"));
        cardHolder.sendKeys("technoStudy");
        WebElement cardNum = driver.findElement(By.id("CardNumber"));
        cardNum.sendKeys("6501700194147183");
        WebElement cardMonth = driver.findElement(By.id("ExpireMonth"));
        Select cardMonthMenu = new Select(cardMonth);
        cardMonthMenu.selectByVisibleText("03");
        WebElement cardYear = driver.findElement(By.id("ExpireMonth"));
        Select cardYearMenu = new Select(cardYear);
        cardYearMenu.selectByIndex(1);
        MyFunc.Bekle(1);
        WebElement cardCode = driver.findElement(By.xpath("//input[@id='CardCode']"));
        cardCode.sendKeys("136");
        WebElement devam4 = driver.findElement(By.xpath("//*[@onclick='PaymentInfo.save()']"));
        devam4.click();
        MyFunc.Bekle(2);

        WebElement confirm =driver.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']"));
        confirm.click();

        /*
        WebElement countryBill = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
        Select countryBillMenu = new Select(countryBill);
        countryBillMenu.selectByVisibleText("Turkey");
        WebElement stateBill = driver.findElement(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']\n"));
        Select stateBillMenu = new Select(stateBill);
        stateBillMenu.selectByIndex(1);
        WebElement city = driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']"));
        city.sendKeys("Ankara");
        WebElement adres = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']"));
        adres.sendKeys("Ankara mahallesi ankara sokak");
        WebElement postCode = driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']\n"));
        postCode.sendKeys("6486484");
        WebElement phone = driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']\n"));
        phone.sendKeys("555555555");
        WebElement devam1 = driver.findElement(By.xpath("//input[@title='Continue']"));
        devam1.click();
        MyFunc.Bekle(2);
*/
BekleVeKapat();
    }
}
