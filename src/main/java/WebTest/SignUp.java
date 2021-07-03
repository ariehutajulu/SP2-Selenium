
package WebTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class SignUp {
    @Test
    public void signup() throws InterruptedException
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
        driver.findElement(By.id("email_create")).sendKeys("arieh@gmail.com");

        //
        Thread.sleep(1000);
        driver.findElement(By.id("SubmitCreate")).click();//add to chart
        Thread.sleep(1000);
        driver.findElement(By.id("id_gender1")).click();

        driver.findElement(By.id("customer_firstname")).sendKeys("ari");
        driver.findElement(By.id("customer_lastname")).sendKeys("ebet");
        driver.findElement(By.id("passwd")).sendKeys("arie2929");
        //driver.findElement(By.id("uniform-days")).click();
        Thread.sleep(1000);
        Select drpName = new Select(driver.findElement(By.id("days")));
        drpName.selectByValue("20");
        Select drpMonths = new Select(driver.findElement(By.id("months")));
        drpMonths.selectByValue("1");
        Select drpYears = new Select(driver.findElement(By.id("years")));
        drpYears.selectByValue("1996");
        Thread.sleep(1000);
        driver.findElement(By.id("newsletter")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("uniform-optin")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("submitAccount")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}

//TC_SignUP
//        [Documentation]    Test case ini untuk sign up
//        Sleep    1
//        Input Text    ${Email}    ariehutaju@gmail.com
//    Click Button    ${SubmitCreateBtn}
//            Sleep    1
//
//            TC_InputNewUser
//            [Documentation]    TC untuk menginput isi data diri
//            Click Element    id_gender1
//            Input Text    customer_firstname    Arie
//            Input Text    customer_lastname    Hutajulu
//            Input Text    passwd    arie123
//            Select From List by Value    name:days    20
//            Select From List by Value    name:months    1
//            Select From List by Value    name:years    1996
//            Click Element    newsletter
//            Click Element    uniform-optin
//            Click Button    submitAccount
//            Close Browser