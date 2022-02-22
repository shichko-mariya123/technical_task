package screens;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public class SubscribeScreen extends Screen {

    private static final By btnSubscribeLoc = By.xpath("//*[@text = 'Subscribe']");
    private final String lblTypeOfSubscriptionLocTemplate = "//*[@text = '%s']";
    private final IButton btnSubscribe = getElementFactory().getButton(btnSubscribeLoc, "Subscribe button");

    public SubscribeScreen() {
        super(btnSubscribeLoc, "Subscribe screen");
    }

    public void chooseTypeOfSubscription(String typeOfSubscription){
        getElementFactory().getLabel(By.xpath(String
                        .format(lblTypeOfSubscriptionLocTemplate, typeOfSubscription)),
                "Type of subscription label").click();
    }

    public void clickOnSubscribe(){
        btnSubscribe.click();
    }
}
