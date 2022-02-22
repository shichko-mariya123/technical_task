Feature: Registration

  Scenario: I register with valid credentials
    Given What brings you to Healthily screen is opened
    And Get started button is not clickable
    When I choose 'Get active' option
    Then Get started button is clickable
    When I click Get Started
    Then Before we get started screen is opened
    And I agree - let's go button is not clickable
    When I accept terms and conditions of Privacy Policy
    Then I agree - let's go button is clickable
    When I click I agree - let's go
    Then Tell us about your self screen is opened
    When I register with data:
      | Username           | MyUsername |
      | YearOfBirth        | 1999       |
      | AssignedSexAtBirth | Male       |
    Then Create your account screen is opened
    When I create my account with email and password
    Then Subscribe screen is opened
    When I chose 'Monthly' type of subscription
    And I click Subscribe button
    Then Healthily Subscription screen is opened
    And Payment method is added
    When I click Subscribe button
    Then Manage backup payment settings screen is opened
    When I click No thanks
    Then Home screen is opened
    And Username present correctly


