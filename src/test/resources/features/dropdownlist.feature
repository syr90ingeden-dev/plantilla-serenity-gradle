Feature: Select the one option from a dropdown list

  Scenario: User selects the first option from the list
    Given the user navigates to the dropdown list
    When the user selects the first option
    Then the user should see the first selected item


  Scenario: User selects the second option from the list
    Given the user navigates to the dropdown list
    When the user selects the second option
    Then the user should see the second selected item