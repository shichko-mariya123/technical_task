package screens;

import org.openqa.selenium.By;

public class SignInScreen extends BaseForCreateAccountAndSignInScreen {

    public SignInScreen() {
        super(By.xpath("//*[@text = 'Reset password']"), "Sign in screen");
    }
}
