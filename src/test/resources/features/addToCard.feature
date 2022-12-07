Feature: Sample AutomationStore

  @smoke_test
  Scenario: AutomationStore Add to Cart and Check


    Given Go to the automation_test_store website
    When Click on Men Tab
    And Click the Fragrance Set
    And Click Armani Code after shave balm
    And Click on Add to Card Button
    Then the cart first line total is should '$42.00'
    Then the cart second line total is should '$2.00'
    Then the cart total is should '$44.00'


  @smoke_test
  Scenario: AutomationStore Add to Cart and Check 2


    Given Go to the automation_test_store website
    When Click on Men Tab
    And Click the Fragrance Set
    And Click Armani Code after shave balm
    And Click on Add to Card Button
    Then the cart first line total is should '$42.00'
    Then the cart second line total is should '$2.00'
    Then the cart total is should '$44.00'


