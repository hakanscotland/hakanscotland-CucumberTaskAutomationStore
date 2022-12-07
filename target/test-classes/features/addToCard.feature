Feature: Add to the cart

  @smoke_test
  Scenario: Add to cart and remove


    Given Go to the test website
    And Click on Fragrance Tab
    And Click Men Categories Tab
    And Click Armani Code Sport Product
    And Add Quantity
    And Click on Add to cart button
    And click to Proceed to checkout
    And select check box as  Guest Checkout
    And Click Continue Button
    And Fill the (GUEST CHECKOUT STEP1 form)
    When Click Continue Button for CHECKOUT CONFIRMATION
    Then the cart Sub-Total should	'$75.00'
    Then the cart Flat Shipping Rate should	'$2.00'
    Then the cart total is should '$77.00'
    When Click Confirm Order Button
    Then The text message should appear 'YOUR ORDER HAS BEEN PROCESSED!'


