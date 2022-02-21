package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.EmailAndPasswordModel;
import org.testng.Assert;
import screens.CreateYourAccountScreen;

public class CreateYourAccountScreenSteps {

    private final CreateYourAccountScreen createYourAccountScreen;
    private final EmailAndPasswordModel emailAndPasswordModel;

    public CreateYourAccountScreenSteps(){
        createYourAccountScreen = new CreateYourAccountScreen();
        emailAndPasswordModel = new EmailAndPasswordModel();
    }

    @Then("Create your account screen is opened")
    public void assertCreateYourAccountScreenIsOpened(){
        Assert.assertTrue(createYourAccountScreen.state().waitForDisplayed(),
                "Create your account screen is not opened");
    }

    @When("I create my account with email and password")
    public void enterData()  {
        createYourAccountScreen.setEmail(emailAndPasswordModel.getEmail())
                .setPassword(emailAndPasswordModel.getPassword())
                .clickOnContinueBtn();
    }
}
