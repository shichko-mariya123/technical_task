package screens;

import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public class HomeScreen extends Screen {

    private final String lblUsernameLocTemplate = "//*[contains (@text, '%s')]";

    public HomeScreen() {
        super(By.xpath("//*[@text = 'Today']"), "Home screen");
    }

    public boolean isUsernamePresentCorrectly(String username){
        return getElementFactory().getLabel(By.xpath(String.format(lblUsernameLocTemplate, username)),
                "Username label").state().isDisplayed();
    }
}
