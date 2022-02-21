package steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import screens.SubscribeScreen;

public class SubscribeScreenSteps {

    private final SubscribeScreen subscribeScreen;

    public SubscribeScreenSteps(){
        subscribeScreen = new SubscribeScreen();
    }

    @Then("Subscribe screen is opened")
    public void assertSubscribeScreenIsOpened(){
        Assert.assertTrue(subscribeScreen.state().waitForDisplayed(),
                "Subscribe screen is not opened");
    }

}
