Feature: Attendee Adding
  As a Developer
  I want to add Attendee through API
  So that It can be available to applications.

  Background:
    Given The Endpoint "http://localhost:%d/api/v1/attendees" is available

  @attendee-adding
  Scenario: Add attendee with unique userName
    When A Post Request is sent with values "Francisco Rojas", "FranciscoRK", "franciscorojas@gmail.com"
    Then A Response is received with Status 201
    And An Attendee Resource is included in Response Body, with values  "Francisco Rojas", "FranciscoRK", "franciscorojas@gmail.com"

  @attendee-duplicated
  Scenario: Add attendee with existing userName
    Given An Attendee Resource with values "Martha del Aguila", "MarthaDA", "marthadelaguila@gmail.com" is already stored
    When A Post Request is sent with values "Martha del Aguila", "MarthaDA", "marthadelaguila@gmail.com"
    Then A Response is received with Status 400
    And A Message is included in Response Body, with value "Not all constraints satisfied for Attendees: An attendee with the same email and userName already exists."




