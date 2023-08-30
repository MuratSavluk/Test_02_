package Data;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NegatifKuponVeHediyeKartiKullanma extends BaseDriver{


    /*
    Kullanıcı olarak, web mağazamızdan alışveriş yaparken kupon kodlarını
    kullanabilmeli ve hediye kartları ekleyebilmeliyim. Bu, alışverişim
    sırasında tasarruf etmeme ve ödüller kazanmama yardımcı olur.

    Anasayfada "Computers" kategorisinden bir ürünü seçebilmeliyim.

    Seçtiğim ürünü "Add to Cart" butonuna tıklayarak sepete ekleyebilmeliyim.

    Sepetime giderek seçtiğim ürünün görüntülendiğini doğrulayabilmeliyim.

   Sepetimdeki ürün için "Apply Coupon" butonuna tıklayarak bir kupon kodu ekleyebilmeliyim.

   Kupon kodu eklediğimde, kuponun başarılı bir şekilde uygulandığını doğrulayabilmeliyim.

   "Add Gift Card" butonuna tıklayarak bir hediye kartı ekleyebilmeliyim.

   Hediye kartı eklediğimde, kartın başarılı bir şekilde eklendiğini doğrulayabilmeliyim.

  "Checkout" butonuna tıklayarak ödeme işlemine başlayabilmeliyim.

   Ödeme bilgilerini girerek siparişi onaylayabilmeliyim.

  " Your order has been successfully processed!"
    mesajını görüntüleyerek siparişin başarıyla tamamlandığını doğrulayabilmeliyim.
     */

    @Test
    public void Test1(){


        driver.get("https://demowebshop.tricentis.com/");

        WebElement LoginBtn = driver.findElement(By.cssSelector("[class='ico-login']"));
        LoginBtn.click();
        MyFunc.Bekle(2);

        WebElement mail = driver.findElement(By.id("Email"));
        mail.sendKeys("technostudy13@gotmail.com");
        WebElement pswrd = driver.findElement(By.id("Password"));
        pswrd.sendKeys("technostudy13");


        WebElement sub = driver.findElement(By.xpath("//input[@value='Log in']"));
        sub.click();
        MyFunc.Bekle(5);

        WebElement computer = driver.findElement(By.cssSelector("[class='inactive']>a[href='/computers']"));
        MyFunc.Bekle(2);
        computer.click();


        WebElement desktops = driver.findElement(By.xpath("//a[@title='Show products in category Desktops']"));
        MyFunc.Bekle(2);
        desktops.click();


        WebElement add = driver.findElement(By.cssSelector("[value='Add to cart']"));
        MyFunc.Bekle(2);
        add.click();

        WebElement toCart = driver.findElement(By.id("add-to-cart-button-72"));
        MyFunc.Bekle(2);
        toCart.click();

        WebElement sepet = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        MyFunc.Bekle(2);
        sepet.click();

        WebElement coupon = driver.findElement(By.name("applydiscountcouponcode"));
        MyFunc.Bekle(2);
        coupon.click();

        WebElement msj1 = driver.findElement(By.xpath("//div[@class='message']"));
        Assert.assertTrue("Aranalan mesaj bulunamadı", msj1.getText().contains("The coupon code you entered"));


        WebElement gift = driver.findElement(By.name("applygiftcardcouponcode"));
        MyFunc.Bekle(2);
        gift.click();


        WebElement msj2 = driver.findElement(By.xpath("//div[@class='message']"));
        Assert.assertTrue("Aranalan mesaj bulunamadı", msj2.getText().contains("The coupon code you entered"));

        WebElement agree = driver.findElement(By.id("termsofservice"));
        MyFunc.Bekle(2);
        agree.click();

        WebElement checkout = driver.findElement(By.id("checkout"));
        MyFunc.Bekle(2);
        checkout.click();

        MyFunc.Bekle(2);
        bekleVeKapat();

    }
}
