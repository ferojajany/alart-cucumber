Feature: Alart popup solved
  Scenario: Alart open valid credential
    Given User is on the alartbox
    When User open Alert with OK & Cancel
    Then click the button to display a confirm box
    And User accept alartbox