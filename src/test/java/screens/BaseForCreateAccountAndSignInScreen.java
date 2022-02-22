package screens;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ITextBox;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public abstract class BaseForCreateAccountAndSignInScreen extends Screen {

    private final String basePartOfTxtLoc = "//*[contains (@text, '%s')]//ancestor::*[@class = 'android.widget.EditText']";
    private final ITextBox txtEmail = getElementFactory().getTextBox(By
            .xpath(String.format(basePartOfTxtLoc, "Your email")), "Email text box");;
    private final ITextBox txtPassword = getElementFactory().getTextBox(By
            .xpath(String.format(basePartOfTxtLoc, "word")), "Password text box");;
    private final IButton btnContinue = getElementFactory().getButton(By
            .xpath("//*[contains (@text, 'go')]"), "Let's go button");;

    protected BaseForCreateAccountAndSignInScreen(By locator, String name) {
        super(locator, name);
    }

    public BaseForCreateAccountAndSignInScreen setEmail(final String email){
        txtEmail.typeSecret(email);
        return this;
    }

    public BaseForCreateAccountAndSignInScreen setPassword(final String password){
        txtPassword.typeSecret(password);
        return this;
    }

    public void clickOnContinueBtn(){
        btnContinue.click();
    }
}
