Feature: Event Adding
  As a Developer
  I want to add Event through API
  So that It can be available to applications.

  Background:
    Given The Endpoint "http://localhost:%d/api/v1/events" is available

  @event-adding
  Scenario: Add event with unique name
    When A Post Request is sent with values "Event1", "Direccion1",50, "imagen1","2023/05/16",25,"Distrito1"
    Then A Response is received with Status 201
    And An Event Resource is included in Response Body, with values "Event1", "Direccion1",50, "imagen1","2023/05/16",25,"Distrito1"

  @organizer-duplicated
  Scenario: Add event with existing name
    Given An Event Resource with values "Event2", "Direccion2",100, "imagen2","2023/09/28",18,"Distrito2" is already stored
    When A Post Request is sent with values "Event2", "Direccion2",100, "imagen2","2023/09/28",18,"Distrito2"
    Then A Response is received with Status 400
    And A Message is included in Response Body, with value "Not all constraints satisfied for Events: An event with the same name already exists."
