package framework.screenshots;

import aquality.appium.mobile.application.AqualityServices;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreenshotProvider implements IScreenshotProvider{

    public byte[] takeScreenshot() throws IOException {
        File scrFile = ((TakesScreenshot) AqualityServices.getApplication().getDriver())
                .getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./image.png"));
        return new byte[]{};
    }
}
