package framework.objectfactory;


import com.google.inject.AbstractModule;
import framework.screenshots.IScreenshotProvider;
import framework.screenshots.ScreenshotProvider;


public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        this.bind(IScreenshotProvider.class).toInstance(new ScreenshotProvider());
    }
}
