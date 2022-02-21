package steps;

import framework.utils.ScenarioContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import screens.WhatBringsYouToHealthilyScreen;

import javax.inject.Inject;

public class WhatBringsYouToHealthilyScreenSteps {
    private final WhatBringsYouToHealthilyScreen whatBringsYouToHealthilyScreen;
    private final ScenarioContext scenarioContext;

    @Inject
    public WhatBringsYouToHealthilyScreenSteps(ScenarioContext scenarioContext){
        whatBringsYouToHealthilyScreen = new WhatBringsYouToHealthilyScreen();
        this.scenarioContext = scenarioContext;
    }

    @Given("What brings you to Healthily screen is opened")
    public void assertWhatBringsYouToHealthilyScreenIsOpened(){
        Assert.assertTrue(whatBringsYouToHealthilyScreen.state().waitForDisplayed(),
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
    public void chooseOption(String option) throws InterruptedException {
        whatBringsYouToHealthilyScreen.chooseOption(option);
    }

    @And("I click Get Started")
    public void clickOnGetStarted() {
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
