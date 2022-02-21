package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import screens.BeforeWeGetStartedScreen;

public class BeforeWeGetStartedScreenSteps {

    private final BeforeWeGetStartedScreen beforeWeGetStartedScreen;

    public BeforeWeGetStartedScreenSteps(){
        beforeWeGetStartedScreen = new BeforeWeGetStartedScreen();
    }

    @Then("Before we get started screen is opened")
    public void assertBeforeWeGetStartedScreenIsOpened(){
        Assert.assertTrue(beforeWeGetStartedScreen.state().waitForDisplayed(),
                "Before we get started screen is not opened");
    }

    @And("I accept terms and conditions of Privacy Policy")
    public void acceptTermsAndConditionsOfPrivacyPolicy(){
        beforeWeGetStartedScreen.acceptTermsAndConditionsOfPrivacyPolicy();
    }

    @And("I click I agree - let's go")
    public void clickAgree(){
        beforeWeGetStartedScreen.clickOnAgree();
    }

    @And("I agree - let's go button is not clickable")
    public void assertAgreeBtnIsNotClickable() {
        Assert.assertFalse(beforeWeGetStartedScreen.isAgreeBtnEnabled(),
                "Agree button is clickable");
    }

    @And("I agree - let's go button is clickable")
    public void assertAgreeBtnIsClickable() {
        Assert.assertTrue(beforeWeGetStartedScreen.isAgreeBtnEnabled(),
                "Agree button is not clickable");
    }


}
