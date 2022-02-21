package steps;

import io.cucumber.java.Transpose;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.EmailAndPasswordModel;
import org.testng.Assert;
import screens.SignInScreen;

public class SignInScreenSteps {

    private final SignInScreen signInScreen;

    public  SignInScreenSteps(){
        signInScreen = new SignInScreen();

    }
    @Then("Sign in screen is opened")
    public void assertSubscribeScreenIsOpened(){
        Assert.assertTrue(signInScreen.state().waitForDisplayed(),
                "Sign in screen is not opened");
    }

    @When("I sign in with data:")
    public void enterData(@Transpose EmailAndPasswordModel emailAndPasswordModel)  {
        signInScreen.setEmail(emailAndPasswordModel.getEmail())
                .setPassword(emailAndPasswordModel.getPassword())
                .clickOnContinueBtn();
    }
}
