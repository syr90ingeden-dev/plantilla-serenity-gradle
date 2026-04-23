Feature: Login

  @valid_login
  Scenario: Login with valid credentials
    Given the user is on the login page
    When the user add valid credentials
    Then the user should see a succesful message