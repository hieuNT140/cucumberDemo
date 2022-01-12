package StepDefinitiones;

import PageObject.Step;
import io.cucumber.java.en.Given;

import static Core.BaseTest.getDriver;

public class Demo {

    Step step;

    @Given("the user navigates to the Google home page")
    public void the_user_navigates_to_the_google_home_page() {
        step = new Step(getDriver());
        step.navigate("https://www.google.com/");

    }

}
