package framework.objectfactory;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.application.MobileModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.ScenarioScope;

public class CustomObjectFactory implements ObjectFactory {

    private final Injector injector;

    public CustomObjectFactory() {
        this.injector = Guice.createInjector(Stage.PRODUCTION, CucumberModules.createScenarioModule(),
                 new MobileModule(AqualityServices::getApplication));
    }

    @Override
    public void start() {
        this.injector.getInstance(ScenarioScope.class).enterScope();
    }

    @Override
    public void stop() {
        this.injector.getInstance(ScenarioScope.class).exitScope();
    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return true;
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return this.injector.getInstance(aClass);
    }
}
