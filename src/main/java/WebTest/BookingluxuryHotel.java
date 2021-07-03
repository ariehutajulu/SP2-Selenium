package WebTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BookingluxuryHotel {

    @Test
    public void Bookingluxury() throws InterruptedException
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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='category_data_cont']//a[@data-id-product='4']")).click();
        Thread.sleep(4000);
        String messageText = driver.findElement(By.id("layer_cart_product_title")).getText();
        Assert.assertTrue("Text not found!", messageText.contains("luxury Rooms"));
        Thread.sleep(1000);
        driver.quit();
    }
}