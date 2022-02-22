package framework.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import static org.passay.DigestDictionaryRule.ERROR_CODE;

public class GenerateCredsUtil {

    private static final int LENGTH_OF_RANDOM_STRING = 10;
    private static final int NUMBER_OF_CHARACTERS_PER_VIEW = 2;

    public static String generateValidPassword() {
        PasswordGenerator gen = new PasswordGenerator();
        CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
        CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars);
        lowerCaseRule.setNumberOfCharacters(NUMBER_OF_CHARACTERS_PER_VIEW);

        CharacterData upperCaseChars = EnglishCharacterData.UpperCase;
        CharacterRule upperCaseRule = new CharacterRule(upperCaseChars);
        upperCaseRule.setNumberOfCharacters(NUMBER_OF_CHARACTERS_PER_VIEW);

        CharacterData digitChars = EnglishCharacterData.Digit;
        CharacterRule digitRule = new CharacterRule(digitChars);
        digitRule.setNumberOfCharacters(NUMBER_OF_CHARACTERS_PER_VIEW);

        CharacterData specialChars = new CharacterData() {
            public String getErrorCode() {
                return ERROR_CODE;
            }

            public String getCharacters() {
                return "!@#$%^&*()_+";
            }
        };
        CharacterRule splCharRule = new CharacterRule(specialChars);
        splCharRule.setNumberOfCharacters(NUMBER_OF_CHARACTERS_PER_VIEW);

        String password = gen.generatePassword(LENGTH_OF_RANDOM_STRING, splCharRule, lowerCaseRule,
                upperCaseRule, digitRule);
        return password;
    }

    public static String generateValidEmail() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz1234567890_-.";
        String email = "";
        String temp = RandomStringUtils.random(LENGTH_OF_RANDOM_STRING, allowedChars);
        email = temp.substring(0, temp.length() - NUMBER_OF_CHARACTERS_PER_VIEW) + "@testdata.com";
        return email;
    }
}
