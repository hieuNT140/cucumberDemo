package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Step {

    WebDriver driver;
    WebDriverWait wait;

    public Step(WebDriver driver) {
        this.driver = driver;
         wait = new WebDriverWait(driver,5);
    }

    public void click(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
    }
    public void navigate(String url){
        driver.navigate().to(url);
    }

    public void sendKeyToElement(By element,String key){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).sendKeys(key);
    }

}
