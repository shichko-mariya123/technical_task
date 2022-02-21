package screens;

import aquality.appium.mobile.elements.ElementType;
import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ICheckBox;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

import java.util.List;

public class BeforeWeGetStartedScreen extends Screen {

    private final List<ICheckBox> termAndPrivacyPolicyCheckBoxes = getElementFactory()
            .findElements(By.xpath("//*[@class = 'android.widget.CheckBox']"), ElementType.CHECKBOX);
    private final IButton btnAgree = getElementFactory()
            .getButton(By.xpath("//*[contains (@text, 'agree')]//ancestor::*[@clickable = 'true']"),
            "I agree button");

    public BeforeWeGetStartedScreen() {
        super(By.xpath("//*[@text = 'Before we get started']"), "Before we get started screen");
    }

    public void acceptTermsAndConditionsOfPrivacyPolicy(){
        termAndPrivacyPolicyCheckBoxes.stream().forEachOrdered((e) -> e.click());
    }

    public void clickOnAgree(){
        btnAgree.click();
    }

    public boolean isAgreeBtnEnabled(){
        return btnAgree.getAttribute("enabled").equals("true");
    }
}
