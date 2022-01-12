package CucumberStart;

import io.cucumber.testng.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//@RunWith(Cucumber.class)

@CucumberOptions(
         features = "src/test/resources/CucumberDemo.feature"
        , glue = "StepDefinitiones"

)

public class RunCucumberTest extends AbstractTestNGCucumberTests {
//    private TestNGCucumberRunner testNGCucumberRunner;
//
//    @BeforeClass(alwaysRun = true)
//    public void setUpClass(){
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }
//
//    @Test(groups = "cucumber",description = "Run Cucumber Scenarios", dataProvider = "scenarios")
//    public void  scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature){
//        testNGCucumberRunner.runScenario(pickle.getPickle());
//    }
//
//    @DataProvider
//    public Object[][] scenarios(){
//        return testNGCucumberRunner.provideScenarios();
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void teardownClass(){
//        testNGCucumberRunner.finish();
//    }

}
