package WebTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class AddAddress {
    @Test
    public void address() throws InterruptedException
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
        driver.findElement(By.id("email")).sendKeys("arieh@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("arie2929");
        //
        Thread.sleep(1000);
        driver.findElement(By.id("SubmitLogin")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("icon-building")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("company")).sendKeys("MoneyfyClub");

        driver.findElement(By.id("address1")).sendKeys("Jalan.Kalimalang no 2");
        Thread.sleep(1000);
        driver.findElement(By.id("postcode")).sendKeys("12018");
        Thread.sleep(1000);
        driver.findElement(By.id("city")).sendKeys("Jakarta");
        Thread.sleep(1000);
        Select idstate = new Select(driver.findElement(By.id("id_state")));
        idstate.selectByValue("318");
        Select idcountry = new Select(driver.findElement(By.id("id_country")));
        idcountry.selectByValue("111");
        Thread.sleep(1000);
        driver.findElement(By.id("phone")).sendKeys("021892882");
        Thread.sleep(1000);
        driver.findElement(By.id("phone_mobile")).sendKeys("0821829102");
        driver.findElement(By.id("alias")).click();
        driver.findElement(By.id("submitAddress")).click();
        Thread.sleep(1000);
        //driver.quit();
    }
}
//  Click Element    class=icon-building
//    Input Text    company    PT.INDONESIA
//        Input Text    address1    Jalan.Kalimalang No.2
//        Input Text    postcode    12018
//        Input Text    city    Jakarta
//        Sleep    1
//        Select From List by Value    //*[@id="id_state"]    318
//        Select From List by Value    //*[@id="id_country"]    111
//        Input Text    phone    021912938
//        Input Text    phone_mobile    08128332888
//        Click Element    alias
//        Click Button    submitAddress