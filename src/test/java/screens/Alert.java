package screens;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;


public class Alert extends Screen {

    private static final By btnAcceptLoc = By.xpath("//*[@text = 'Ok']");
    private final String lblMessageLocTemplate = "//*[@text = '%s']";
    private final IButton btnOk = getElementFactory()
            .getButton(btnAcceptLoc, "Accept button");

    public Alert() {
        super(btnAcceptLoc, "Alert");
    }

    public boolean isAlertMessageDisplayed(String message) {
      return getElementFactory().getLabel(By.xpath(String.format(lblMessageLocTemplate, message)),
              "Alert message: " + message).state().isDisplayed();
    }

    public void tapOk() {
        btnOk.click();
    }
}
