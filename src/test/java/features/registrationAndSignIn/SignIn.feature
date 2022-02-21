Feature: Sign in

  Background: I go to sign in screen
    Given What brings you to Healthily screen is opened
    Then Sign in button is displayed
    When I click Sign in button
    Then Before we get started screen is opened
    And I agree - let's go button is not clickable
    When I accept terms and conditions of Privacy Policy
    Then I agree - let's go button is clickable
    When I click I agree - let's go
    Then Sign in screen is opened

  Scenario: I sign in with valid credentials
    When I sign in with data:
      | Email    | example@test.com |
      | Password | Val1dPa$$w0rd    |
    Then Subscribe screen is opened

  Scenario: I try to login with invalid password
    When I sign in with data:
      | Email    | example@test.com |
      | Password | InVal1dPa$$w0rd    |
    Then 'The password is invalid or the user does not have a password.' alert appears