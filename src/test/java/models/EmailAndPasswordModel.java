package models;

import framework.utils.GenerateCredsUtil;
import lombok.Data;

@Data
public class EmailAndPasswordModel {
    private String email;
    private String password;

    public EmailAndPasswordModel(){
        email = GenerateCredsUtil.generateValidEmail();
        password = GenerateCredsUtil.generateValidPassword();
    }
}
