package Core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public void intit() {
       //System.setProperty("webdriver.chrome.driver", "G:\\ChromeDriver\\Chrome97\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void tearDown(){
        driver.close();
    }

}
