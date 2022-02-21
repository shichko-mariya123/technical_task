package screens;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ITextBox;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public class TellUsAboutYourSelfScreen extends Screen {

     private final ITextBox txtName;
     private final ITextBox txtYearOfBirth;
     private final IButton btnExpandDropdown;
     private final IButton btnContinue;
     private final String lblAssignedSexAtBirthLoc = "//*[@text = '%s']";
     private final String basePartOfTxtLoc = "//*[@text ='%s']//ancestor::*[@class = 'android.widget.EditText']";

    public TellUsAboutYourSelfScreen() {
        super(By.xpath("//*[contains(@text, 'about yourself')]"), "Tell us about your self screen");
        txtName = getElementFactory().getTextBox(getUsernameTxbLoc(), "User name text box");
        txtYearOfBirth = getElementFactory().getTextBox(getYearOfBirthTxbLoc(), "Year of birth text box");
        btnExpandDropdown = getElementFactory().getButton(getExpandDropdownBtnLoc(), "Expand dropdown button");
        btnContinue = getElementFactory().getButton(getContinueBtnLoc(), "Continue button");
    }

    private By getUsernameTxbLoc(){
        return By.xpath(String.format(basePartOfTxtLoc, "Your name"));
    }

    private By getYearOfBirthTxbLoc(){
        return By.xpath(String.format(basePartOfTxtLoc, "Your year of birth"));
    }

    private By getExpandDropdownBtnLoc(){
        return By.xpath("//*[@content-desc = 'OPEN']");
    }

    private By getContinueBtnLoc(){
        return By.xpath("//*[@text = 'Continue']");
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
                "Assigned se at birth label").click();
        return this;
    }

    public void clickOnContinue(){
        btnContinue.click();
    }
}
