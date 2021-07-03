package WebTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class LoginTest {
@Test
    public void LoginID() throws InterruptedException
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
        driver.findElement(By.id("email")).sendKeys("ariehutaju@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("arie123");
        //
        Thread.sleep(1000);
        driver.findElement(By.id("SubmitLogin")).click();//add to chart
        driver.findElement(By.xpath("//*[@class=\"icon-chevron-left\"]")).click();
        driver.quit();
    }
}