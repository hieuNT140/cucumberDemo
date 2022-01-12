package StepDefinitiones;

import PageObject.Element;
import PageObject.Step;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static Core.BaseTest.getDriver;
import static PageObject.Element.*;

public class TessCase {


    Step step = new Step(getDriver());


    @When("the user entered {string} at the search bar")
    public void the_user_entered_panda_at_the_search_bar(String text) {
        step.sendKeyToElement(input_google, text);
    }

    @Then("the results page shows links related to {string}")
    public void the_results_page_shows_links_related_to(String string) {
        System.out.println("pass");
    }

    @And("image links for {string}")
    public void imageLinksFor(String arg0) {
    }

    @And("video links for \"panda")
    public void videoLinksForPanda() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }
}
