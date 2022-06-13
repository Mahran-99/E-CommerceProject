@smoke
Feature: logged users could search for any product

  Scenario Outline: user could search using product name
    Given user enters product name as "<product name>"
    When user clicks on search button
    Then user is shown search results
    Examples:
      | product name |
      | book         |
      | laptop       |
      | nike         |


    # user can search for product using serial number
  Scenario Outline: user could search using sku
    Given user enters product serial number as "<serial number>"
    When user clicks on search button
    Then user is shown search results
    Examples:
      | serial number |
      | AP_MBP_13     |
      | SCI_FAITH     |
      | SF_PRO_11     |