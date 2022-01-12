package StepDefinitiones;

import Core.BaseTest;
import PageObject.Element;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {

    BaseTest baseTest = new BaseTest();

    @Before
    public void setUp() {
       baseTest.intit();
    }
    @After
    public void tearDown(){
        baseTest.tearDown();
    }

}
