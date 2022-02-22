package steps;

import aquality.appium.mobile.application.AqualityServices;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import screens.WhatBringsYouToHealthilyScreen;

import java.time.Duration;

public class WhatBringsYouToHealthilyScreenSteps {

    private static final int WAIT_FOR_CHANGES_APPEAR = 20;
    private final WhatBringsYouToHealthilyScreen whatBringsYouToHealthilyScreen;

    public WhatBringsYouToHealthilyScreenSteps(){
        whatBringsYouToHealthilyScreen = new WhatBringsYouToHealthilyScreen();
    }

    @Given("What brings you to Healthily screen is opened")
    public void assertWhatBringsYouToHealthilyScreenIsOpened(){
        Assert.assertTrue(AqualityServices.getConditionalWait()
                .waitFor(() -> whatBringsYouToHealthilyScreen.state().isDisplayed(),
                        Duration.ofSeconds(WAIT_FOR_CHANGES_APPEAR)),
                "What brings you to healthily screen is not opened");
    }

    @And("Get started button is not clickable")
    public void assertGetStartedBtnIsNotClickable(){
        Assert.assertFalse(whatBringsYouToHealthilyScreen.isGetStartedButtonEnabled(),
                "Get started button is clickable");
    }

    @Then("Get started button is clickable")
    public void assertGetStartedBtnIsClickable(){
        Assert.assertTrue(whatBringsYouToHealthilyScreen.isGetStartedButtonEnabled(),
                "Get started button is not clickable");
    }

    @When("I choose {string} option")
    public void chooseOption(String option){
        whatBringsYouToHealthilyScreen.chooseOption(option);
    }

    @And("I click Get Started")
    public void clickOnGetStarted(){
        whatBringsYouToHealthilyScreen.clickOnGetStarted();
    }

    @Then("Sign in button is displayed")
    public void assertSignInBtnIsDisplayed(){
        Assert.assertTrue(whatBringsYouToHealthilyScreen.isSignInBtnDisplayed(),
                "Sign in button is not displayed");
    }

    @When("I click Sign in button")
    public void clickOnSignIn(){
        whatBringsYouToHealthilyScreen.clickOnSignIn();
    }
}
