package transformations;

import io.cucumber.java.DataTableType;
import models.AboutYourSelfModel;
import models.EmailAndPasswordModel;

import java.util.Map;

public class DataTableTypeTransformations {

    @DataTableType
    public AboutYourSelfModel getAboutYourSelfModel(Map<String, String> entry) {
        AboutYourSelfModel model = new AboutYourSelfModel();
        model.setUsername(entry.get("Username"));
        model.setYearOfBirth(Integer.parseInt(entry.get("YearOfBirth")));
        model.setAssignedSexAtBirth(entry.get("AssignedSexAtBirth"));
        return model;
    }

    @DataTableType
    public EmailAndPasswordModel getEmailAndPasswordModel(Map<String, String> entry) {
        EmailAndPasswordModel model = new EmailAndPasswordModel();
        model.setEmail(entry.get("Email"));
        model.setPassword(entry.get("Password"));
        return model;
    }
}
