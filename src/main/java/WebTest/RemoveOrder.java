
package WebTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class RemoveOrder {
    @Test
    public void removeorder() throws InterruptedException
    {

        WebDriver driver;
        WebDriverWait wait;

        System.setProperty("webdriver.chrome.driver", "chromedriver2.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        driver.findElement(By.xpath("//*[@class=\"hide_xs\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("ariehutaju@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("arie123");

        driver.findElement(By.id("SubmitLogin")).click();//add to chart
        Thread.sleep(1000);
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
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='category_data_cont']//a[@data-id-product='4']")).click();
        Thread.sleep(2000);

        String bodyText = driver.findElement(By.id("layer_cart_product_title")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains("luxury Rooms"));
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[@class='cross']")).click();
        Thread.sleep(1000);

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='header']//a[@rel='nofollow']"));
        builder.moveToElement(element).build().perform();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"booking_dates_container_4\"]//a[@rm_price=\"2750\"]")).click();
        driver.findElement(By.xpath("//*[@id='header']//a[@rel='nofollow']")).click();

        String msgZero = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
        Assert.assertTrue("Text not found!", msgZero.contains("Till now you did not added any room in your cart."));
    }
}