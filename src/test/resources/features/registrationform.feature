Feature: Registration Form

  Scenario: Registration with valid data

    Given the user navigates to the registration page
    When the user enters personal information:
      | name   | email       |
      | Sayury | sb@test.com |
    And selects gender "Female"
    And enters mobileNumber
    And selects DateofBirth "21 Apr 2022"
    And enters Subjects "test"
    And check "Sports"
    And uploads file in "C:/files/test.pdf"
    And submits the form
    Then the user should see successful message

