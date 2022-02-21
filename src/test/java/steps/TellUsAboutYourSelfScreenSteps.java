package steps;

import io.cucumber.java.Transpose;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.AboutYourSelfModel;
import org.testng.Assert;
import screens.TellUsAboutYourSelfScreen;


public class TellUsAboutYourSelfScreenSteps {

    private final TellUsAboutYourSelfScreen tellUsAboutYourSelfScreen;

    public TellUsAboutYourSelfScreenSteps(){
        tellUsAboutYourSelfScreen = new TellUsAboutYourSelfScreen();
    }

    @Then("Tell us about your self screen is opened")
    public void assertTellUsAboutYourSelfScreenIsOpened(){
        Assert.assertTrue(tellUsAboutYourSelfScreen.state().waitForDisplayed(),
                "Tell us about your self screen is not opened");
    }

    @When("I register with data:")
    public void enterData(@Transpose AboutYourSelfModel aboutYourSelfModel)  {
        tellUsAboutYourSelfScreen.setUsername(aboutYourSelfModel.getUsername())
                .setYearOfBirth(aboutYourSelfModel.getYearOfBirth())
                .setAssignedSexAtBirth(aboutYourSelfModel.getAssignedSexAtBirth())
                .clickOnContinue();
    }
}
