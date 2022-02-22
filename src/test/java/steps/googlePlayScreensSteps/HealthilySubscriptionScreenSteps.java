package steps.googlePlayScreensSteps;

import aquality.appium.mobile.application.AqualityServices;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import screens.googlePlayScreens.HealthilySubscriptionScreen;

public class HealthilySubscriptionScreenSteps {

     private HealthilySubscriptionScreen healthilySubscriptionScreen;

     public HealthilySubscriptionScreenSteps(){
         healthilySubscriptionScreen = new HealthilySubscriptionScreen();
     }

     @Then("Healthily Subscription screen is opened")
     public void assertAddPaymentMethodScreenIsOpened(){
         Assert.assertTrue(AqualityServices.getConditionalWait().waitFor(() ->
                         healthilySubscriptionScreen.state().isDisplayed()),
                 "Healthily Subscription screen is not opened");
     }

     @And("Payment method is added")
     public void assertPaymentMethodIsAdded(){
         Assert.assertTrue(healthilySubscriptionScreen.isPayMethodAdded(),
                 "Payment method is not added" );
     }
}
