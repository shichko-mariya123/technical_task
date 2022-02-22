package screens.googlePlayScreens;

import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public class HealthilySubscriptionScreen extends Screen {

    private final ILabel lblCard = getElementFactory().getLabel(By
                    .xpath("//*[contains (@content-desc, 'payment method')]"), "Card label");

    public HealthilySubscriptionScreen() {
        super(By.xpath("//*[@text = 'Healthily Subscription']"),
                "Healthily Subscription screen");
    }

    public boolean isPayMethodAdded(){
        return lblCard.state().isDisplayed();
    }
}
