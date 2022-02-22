package steps;

import aquality.appium.mobile.application.AqualityServices;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import screens.SubscribeScreen;

import java.time.Duration;

public class SubscribeScreenSteps {

    private static final int WAIT_FOR_CHANGES_APPEAR = 20;
    private final SubscribeScreen subscribeScreen;

    public SubscribeScreenSteps(){
        subscribeScreen = new SubscribeScreen();
    }

    @Then("Subscribe screen is opened")
    public void assertSubscribeScreenIsOpened(){
        Assert.assertTrue(AqualityServices.getConditionalWait()
                .waitFor(() -> subscribeScreen.state().isDisplayed(), Duration.ofSeconds(WAIT_FOR_CHANGES_APPEAR)),
                "Subscribe screen is not opened");
    }

    @When("I chose {string} type of subscription")
    public void chooseTypeOfSubscription(String typeOfSubscription){
        subscribeScreen.chooseTypeOfSubscription(typeOfSubscription);
    }

    @And("I click Subscribe button")
    public void clickOnSubscribeBtn(){
        subscribeScreen.clickOnSubscribe();;
    }
}
