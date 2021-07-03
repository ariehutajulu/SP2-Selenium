package WebTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PaymentCheck {

    @Test
    public void paymentcheck() throws InterruptedException
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "chromedriver2.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        driver.findElement(By.xpath("//*[@class=\"hide_xs\"]")).click();
        driver.findElement(By.id("email")).sendKeys("arieh@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("arie2929");
        //
        Thread.sleep(1000);
        driver.findElement(By.id("SubmitLogin")).click();//add to chart
        driver.findElement(By.xpath("//*[@class=\"icon-chevron-left\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("hotel_location")).sendKeys("Aceh");
        Thread.sleep(1000);
        driver.findElement(By.id("id_hotel_button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"search_hotel_block_form\"]/div[2]/div/ul/li")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("check_in_time")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]//*[text()=29]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("check_out_time")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]//*[text()=30]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("search_room_submit")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='category_data_cont']//a[@data-id-product='3']")).click();

        Thread.sleep(3000);
        String messageText = driver.findElement(By.id("layer_cart_product_title")).getText();
        Assert.assertTrue("Text not found!", messageText.contains("Executive Rooms"));
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]//*[@title=\"Proceed to checkout\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='http://103.226.139.66:8080/en/quick-order?proceed_to_payment=1']")).click();

        driver.findElement(By.id("tc_txt")).click();
        Thread.sleep(16000);
        driver.findElement(By.className("cheque")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();

        String paymentMsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p[1]")).getText();
        Assert.assertTrue("Text not found!", paymentMsg.contains("Your order on Sekolah QA is complete."));
        Thread.sleep(1000);
        driver.quit();
    }
}