package framework.screenshots;

import java.io.IOException;

public interface IScreenshotProvider {

    byte[] takeScreenshot() throws IOException;
}
