package screens;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ITextBox;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public abstract class BaseForCreateAccountAndSignInScreen extends Screen {

    private final ITextBox txtEmail;
    private final ITextBox txtPassword;
    private final IButton btnContinue;
    private final String basePartOfTxtLoc = "//*[contains (@text, '%s')]//ancestor::*[@class = 'android.widget.EditText']";

    protected BaseForCreateAccountAndSignInScreen(By locator, String name) {
        super(locator, name);
        txtEmail = getElementFactory().getTextBox(getEmailTxbLoc(), "Email text box");
        txtPassword = getElementFactory().getTextBox(getPasswordTxbLoc(), "Password text box");
        btnContinue = getElementFactory().getButton(getContinueBtn(), "Let's go button");
    }


    protected By getEmailTxbLoc(){
        return By.xpath(String.format(basePartOfTxtLoc, "Your email"));
    }

    protected By getPasswordTxbLoc(){
        return By.xpath(String.format(basePartOfTxtLoc, "word"));
    }

    protected By getContinueBtn(){
        return By.xpath("//*[contains (@text, 'go')]");
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
