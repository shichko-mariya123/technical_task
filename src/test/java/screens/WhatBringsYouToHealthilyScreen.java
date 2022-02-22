package screens;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public class WhatBringsYouToHealthilyScreen extends Screen {

    private final IButton btnGetStarted = getElementFactory().getButton(By
            .xpath("//*[@text = 'Get started']//ancestor::*[@clickable ='true']"), "Get started button");
    private final IButton btnSignIn = getElementFactory().getButton(By.xpath("//*[@text = 'Sign in']"),
            "Sign in button");
    private final String optionLocator = "//*[@text = '%s']";
    private static final String EXPECTED_VALUE = "true";

    public WhatBringsYouToHealthilyScreen() {
        super(By.xpath("//*[@text = 'Get started']"), "What Brings You To Healthily Screen");
    }

    public void clickOnGetStarted() {
        btnGetStarted.click();
    }

    public void clickOnSignIn(){
        btnSignIn.click();
    }

    public void chooseOption(String option){
        getElementFactory().getLabel(By.xpath(String.format(optionLocator, option)), option + " option").click();
    }

    public boolean isGetStartedButtonEnabled() {
         return btnGetStarted.getAttribute("enabled").equals(EXPECTED_VALUE);
    }

    public boolean isSignInBtnDisplayed(){
        return btnSignIn.state().isDisplayed();
    }
}
