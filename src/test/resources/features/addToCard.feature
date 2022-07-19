Feature: Add to the cart

  @smoke_test
  Scenario: Add to cart and remove


    Given Go to the test website
    And Click on T-Shirt Tab
    And Click the Faded Short Sleeve T-shirts
    And Navigate over the Size click M
    And Chose Color as a Blue
    And Click on Add to cart button
    And Click on Continue shopping button
    And Click on Dresses Tab
    And Click on Evening Dresses Tab
    And Click on Printed Dress
    And Navigate over the Printed Dress Size click S
    And Chose Color as a Beige
    And Click on Add to cart button
    And Click on Continue shopping button
    And Click on Dresses Tab
    And Click on Printed Summer Dress
    And Navigate over the Printed Summer Dress Size click M
    And Chose Color as a Orange
    And Click on Add to cart button
    And click to Proceed to checkout
    And click to remove button to the Evening Dress from the cart
    And Click on add button for second Faded Short Sleeve T Shirt
    When Click to View Cart
    Then the cart first line total is should '$28.98'
    Then the cart second line total is should '$33.02'
    Then the cart total is should '$64.00'

