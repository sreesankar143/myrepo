Feature: Amazon Login, Search, Add to Cart, and Logout

  Scenario: User performs login, searches for an item, adds to cart, and logs out
    Given User is on Amazon login page
    When User logs in with valid credentials
    Then User should be logged in successfully
    When User searches for an item
    Then User should see search results
    When User adds the item to the cart
    Then User should see the item in the cart
    When User logs out
    Then User should be logged out successfully
