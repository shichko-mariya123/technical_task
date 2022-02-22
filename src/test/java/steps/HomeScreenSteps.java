package steps;

import aquality.appium.mobile.application.AqualityServices;
import framework.utils.ScenarioContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import screens.HomeScreen;

import javax.inject.Inject;

public class HomeScreenSteps {

    private final HomeScreen homeScreen;
    private final ScenarioContext scenarioContext;

    @Inject
    public HomeScreenSteps(ScenarioContext scenarioContext){
        homeScreen = new HomeScreen();
        this.scenarioContext = scenarioContext;
    }

    @Then("Home screen is opened")
    public void assertHomeScreenIsOpened(){
        Assert.assertTrue(AqualityServices.getConditionalWait()
                        .waitFor(() -> homeScreen.state().isDisplayed()),
                "Home screen is not opened");
    }

    @And("Username present correctly")
    public void assertUsernamePresentCorrectly(){
        Assert.assertTrue(homeScreen.isUsernamePresentCorrectly(scenarioContext.get("username")),
                "Username is not present correctly");
    }
}
