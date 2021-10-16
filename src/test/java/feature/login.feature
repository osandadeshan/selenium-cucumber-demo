Feature: User login

  Scenario: User login with valid credentials
    Given Navigate to the application
    When Login using the Username "osanda@mailinator.com" and Password "1qaz2wsx@"
    Then Logged in username is "Osanda Nimalarathna"

  Scenario: User login with invalid credentials
    Given Navigate to the application
    When Login using the Username "osanda@mailinator.com" and Password "1qaz2wsx"
    Then Page title is "Login - My Store"