Feature: Login to swag labs
  Scenario: Login with valid credentials
    Given User is on the login page

    When User enters username "standard_user" and password as "secret_sauce"
    Then User should be logged in successfuly