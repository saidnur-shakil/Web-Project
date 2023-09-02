Feature: Add Customer

  Scenario Outline: Customer Details
    Given Add customer Page
    When sends customer '<firstname>' and '<lastname>' and '<postcode>'
    And clicks on add customer button
    Then go to the next page

    Examples:
    |firstname|lastname|postcode|
    |saidnur  |shakil  |1230    |