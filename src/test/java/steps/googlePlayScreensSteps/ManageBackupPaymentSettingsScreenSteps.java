package steps.googlePlayScreensSteps;

import aquality.appium.mobile.application.AqualityServices;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import screens.googlePlayScreens.ManageBackupPaymentSettingsScreen;

public class ManageBackupPaymentSettingsScreenSteps  {

    private ManageBackupPaymentSettingsScreen manageBackupPaymentSettingsScreen;

    public ManageBackupPaymentSettingsScreenSteps(){
        manageBackupPaymentSettingsScreen = new ManageBackupPaymentSettingsScreen();
    }

    @Then("Manage backup payment settings screen is opened")
    public void assertAddPaymentMethodScreenIsOpened(){
        Assert.assertTrue(AqualityServices.getConditionalWait().waitFor(() ->
                        manageBackupPaymentSettingsScreen.state().isDisplayed()),
                "Manage backup payment settings screen is not opened");
    }

    @When("I click No thanks")
    public void clickOnNoThanks(){
        manageBackupPaymentSettingsScreen.clickOnNoThanksBtn();
    }
}
