@UC_ADD_REMOVE_CART
Feature: Use case for Adding/Removing Items from the Cart

  Background:
    Given The user is on the Product catalog page of Angelfish

  @TM_UC_ADD_REMOVE_CART-01
  @UC_ADD_REMOVE_CART-Add_product_to_cart
  Scenario: Add selected products to the cart
    When The user add the Small Angelfish to cart
    Then Verify that Shopping Cart is contain the entry for Small Angelfish

  @TM_UC_ADD_REMOVE_CART-01
  @UC_ADD_REMOVE_CART-Verify_product_in_cart
  Scenario: Validate the cart total and item list
    When Select on cart button
    Then Verify that the Description is "Small Angelfish"
    * The Sub Total is 16.50
    * The Item ID is "EST-2"

  @TM_UC_ADD_REMOVE_CART-01
  @UC_ADD_REMOVE_CART-Remove_product_from_cart
    Scenario: Remove items from the cart
      When Select on cart button
      * Remove the entry for small Angelfish
      Then Verify that the Cart is empty






