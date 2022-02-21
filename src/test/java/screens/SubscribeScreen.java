package screens;

import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public class SubscribeScreen extends Screen {

    public SubscribeScreen() {
        super(By.xpath("//*[@text = 'Subscribe']"), "Subscribe screen");
    }
}
