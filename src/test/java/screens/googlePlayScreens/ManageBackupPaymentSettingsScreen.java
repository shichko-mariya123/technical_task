package screens.googlePlayScreens;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public class ManageBackupPaymentSettingsScreen extends Screen {

    private final IButton btnNoThanks = getElementFactory().getButton(By.xpath("//*[contains (@text, 'No')]"),
            "No thanks button");

    public ManageBackupPaymentSettingsScreen() {
        super(By.xpath("//*[@text = 'Manage settings']"), "Manage backup payment settings screen");
    }

    public void clickOnNoThanksBtn(){
        btnNoThanks.click();
    }
}
