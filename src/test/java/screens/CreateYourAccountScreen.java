package screens;

import org.openqa.selenium.By;

public class CreateYourAccountScreen extends BaseForCreateAccountAndSignInScreen {

    public CreateYourAccountScreen() {
        super(By.xpath("//*[contains (@text, 'create your account')]"),
                "Create your account screen");
    }
}
