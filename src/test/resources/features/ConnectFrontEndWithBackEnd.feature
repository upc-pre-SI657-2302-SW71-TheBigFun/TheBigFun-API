Feature: Connect BigFunFrontEnd with BigFunBackEnd
  As a visitor
  I want to be able to log in to the application
  So I will enjoy all the benefits of it

  Background:
    Given that the TheBigFun-API backend is up and running
    And the frontend thebigfun-frontend is running

  Scenario: Visitor logs in to the application
    Given the visitor enters his username "raulV" and password "password"
    When the user clicks the login button
    Then the visitor has entered their profile in the application
    And a valid user session is established

  Scenario: The visitor tries to log in with incorrect credentials
    Given the visitor enters his username "raulV" and password "ipassword"
    When the user clicks the login button
    Then an error message is displayed on the frontend
    And the user session is not established
