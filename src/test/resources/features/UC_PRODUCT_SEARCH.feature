@UC_PRODUCT_SEARCH
Feature: Use case for Product Search

  Background:
    Given The user is on the homepage

  @TM_UC_PRODUCT_SEARCH-01
  @UC_PRODUCT_SEARCH-Navigate_to_Catalog_Page
  Scenario: Navigate to the catalog page
  When Select <Animal> catalog
  Then Verify that the catalog page for <Animal> is displayed
      Example:
        |Animal   |
        |Fish     |
        |Dog      |
        |Cat      |
        |Reptiles |
        |Bird     |

  @TM_UC_PRODUCT_SEARCH-02
  @UC_PRODUCT_SEARCH-Validate-search_result
  Scenario: Search for products using various keywords and validate search results
    When Search the <Animal name> via search field
    Then Verify that the <Animal name> is displyed
      Example:
        |Animal name        |
        |Angelfish          |
        |Tiger Shark        |
        |Koi                |
        |Goldfish           |
        |Bulldog            |
        |Poodle             |
        |Dalmation          |
        |Golden Retriever   |
        |Labrador Retriever |
        |Chihuahua          |
        |Manx               |
        |Persian            |
        |Rattlesnake        |
        |Iguana             |
        |Amazon Parrot      |
        |Finch              |

  @TM_UC_PRODUCT_SEARCH-03
  @UC_PRODUCT_SEARCH-Navigate_to_Catalog_Page
  Scenario: Search for products using various keywords and validate product availability
    When Search the <Animal name> via search field
    * Open the detail of <Animal name>
    Then Verify that the <Animal name> is in stock
      Example:
        |Animal name        |
        |Angelfish          |
        |Tiger Shark        |
        |Koi                |
        |Goldfish           |
        |Bulldog            |
        |Poodle             |
        |Dalmation          |
        |Golden Retriever   |
        |Labrador Retriever |
        |Chihuahua          |
        |Manx               |
        |Persian            |
        |Rattlesnake        |
        |Iguana             |
        |Amazon Parrot      |
        |Finch              |