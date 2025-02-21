@UC_CHECKOUT
Feature: Use case for Adding/Removing Items from the Cart

  Background:
    Given Cart contain entry of Small Angelfish
    * Cart contain entry of Male Puppy Poodle
    * The user "k_chaijiroj" is a logged in user
    * The user is on Shopping cart page


  @TM_UC_CHECKOUT-01
  @UC_CHECKOUT-Checkout_with_item_in_cart
  Scenario: Proceed to checkout with items in the cart
    When Select Proceed to Checkout
    Then Verify that the user is on the shipping detail page

  @TM_UC_CHECKOUT-02
  @UC_CHECKOUT-Change_shipping_detail
  Scenario: Enter shipping details with a different address
    Given The Address1 of user is "TH"
    When Select Proceed to Checkout
    * Select on Ship to different address checkbox
    * Continue to change shipping address page
    * Change the Address1 to "BKK"
    * Continue to order confirmation page
    Then Verify that the Address1 of shipping address is "BKK"

  @TM_UC_CHECKOUT-03
  @UC_CHECKOUT-Confirm_order_with_changed_shipping_address
    Scenario: Confirm the order and validate the successful order placement with changed shipping address
    Given The Address1 of user is "TH"
    When Select Proceed to Checkout
    * Select on Ship to different address checkbox
    * Continue to change shipping address page
    * Change the Address1 to "BKK"
    * Continue to order confirmation page
    * Confirm the order
    Then Verify that the order has been submitted

