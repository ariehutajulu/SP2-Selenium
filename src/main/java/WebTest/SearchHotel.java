package WebTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class SearchHotel {

@Test
    public void SearchHotel() throws InterruptedException
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "chromedriver2.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        driver.findElement(By.xpath("//*[@class=\"hide_xs\"]")).click();
        driver.findElement(By.id("email")).sendKeys("ariehutaju@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("arie123");
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
        driver.quit();
    }
}