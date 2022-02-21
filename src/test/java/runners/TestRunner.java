package runners;

import framework.objectfactory.CustomObjectFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"hooks", "transformations", "steps"},
        strict = true,
        plugin = {
                "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"
        },
        objectFactory = CustomObjectFactory.class
)

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider()
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
