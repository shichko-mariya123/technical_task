package screens;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ITextBox;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public class TellUsAboutYourSelfScreen extends Screen {

     private final String basePartOfTxtLoc = "//*[@text ='%s']//ancestor::*[@class = 'android.widget.EditText']";
     private final ITextBox txtName = getElementFactory().getTextBox(By
             .xpath(String.format(basePartOfTxtLoc, "Your name")), "User name text box");;
     private final ITextBox txtYearOfBirth = getElementFactory().getTextBox(By
             .xpath(String.format(basePartOfTxtLoc, "Your year of birth")), "Year of birth text box");;
     private final IButton btnExpandDropdown = getElementFactory().getButton(By
             .xpath("//*[@content-desc = 'OPEN']"), "Expand dropdown button");;
     private final IButton btnContinue = getElementFactory().getButton(By
             .xpath("//*[@text = 'Continue']"), "Continue button");;
     private final String lblAssignedSexAtBirthLoc = "//*[@text = '%s']";


    public TellUsAboutYourSelfScreen() {
        super(By.xpath("//*[contains(@text, 'about yourself')]"),
                "Tell us about your self screen");
    }

    public TellUsAboutYourSelfScreen setUsername(final String username) {
        txtName.sendKeys(username);
        return this;
    }

    public TellUsAboutYourSelfScreen setYearOfBirth(final int yearOfBirth){
        txtYearOfBirth.sendKeys(String.valueOf(yearOfBirth));
        return this;
    }

    public TellUsAboutYourSelfScreen setAssignedSexAtBirth(final String assignedSexAtBirth){
        btnExpandDropdown.click();
        getElementFactory().getLabel(By.xpath(String.format(lblAssignedSexAtBirthLoc, assignedSexAtBirth)),
                "Assigned sex at birth label").click();
        return this;
    }

    public void clickOnContinue(){
        btnContinue.click();
    }
}
