package steps;

import framework.utils.ScenarioContext;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.AboutYourSelfModel;
import org.testng.Assert;
import screens.TellUsAboutYourSelfScreen;

import javax.inject.Inject;


public class TellUsAboutYourSelfScreenSteps {

    private final TellUsAboutYourSelfScreen tellUsAboutYourSelfScreen;
    private final ScenarioContext scenarioContext;

    @Inject
    public TellUsAboutYourSelfScreenSteps(ScenarioContext scenarioContext){
        tellUsAboutYourSelfScreen = new TellUsAboutYourSelfScreen();
        this.scenarioContext = scenarioContext;
    }

    @Then("Tell us about your self screen is opened")
    public void assertTellUsAboutYourSelfScreenIsOpened(){
        Assert.assertTrue(tellUsAboutYourSelfScreen.state().waitForDisplayed(),
                "Tell us about your self screen is not opened");
    }

    @When("I register with data:")
    public void enterData(@Transpose AboutYourSelfModel aboutYourSelfModel)  {
        scenarioContext.add("username", aboutYourSelfModel.getUsername());
        tellUsAboutYourSelfScreen.setUsername(aboutYourSelfModel.getUsername())
                .setYearOfBirth(aboutYourSelfModel.getYearOfBirth())
                .setAssignedSexAtBirth(aboutYourSelfModel.getAssignedSexAtBirth())
                .clickOnContinue();
    }
}
