Feature: To validate the makemytrip application

  Scenario: To book a travel ticket on makemytrip application
    Given the user ha launch the application
    When the user click the buses icon
    Then it should be ticket booking page
    When the user click the from location
    And the user enter the from location name
    And the user should click and enter the To location
    And the user should select the travel date
    And the user should click the search button
    Then it should show the bus details and timing
