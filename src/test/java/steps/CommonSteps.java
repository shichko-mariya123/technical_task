package steps;


import io.cucumber.java.en.Then;
import org.testng.Assert;
import screens.Alert;

public class CommonSteps {

    private final Alert alert;

    public CommonSteps(){
        alert =  new Alert();
    }

    @Then("'{}' alert appears")
    public void alertAppears(String alertMessage) {
        Assert.assertTrue(alert.state().waitForDisplayed(), "Alert appeared");
        Assert.assertTrue(alert.isAlertMessageDisplayed(alertMessage));
    }
}
