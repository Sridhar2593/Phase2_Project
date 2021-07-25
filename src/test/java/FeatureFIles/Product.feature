Feature: Product Feature
  
  Description: This feature will be used to add products to cart in SwagLabs Application

  Background: 
    Given - User has opened the SwagLabs application
    When - User enters correct username "<UserName>"
    And - User enters correct password "<Password>"
    And - User click on Login button

  Scenario Outline: Verify that User able to add the single product to the cart
    Given User should be landed on the Product page
    And User selects Product and clicks on Add to Cart button "<Product>"
    Then User should able to see the product in My Cart

    Examples: 
      | Product                 |
      | Sauce Labs Bolt T-Shirt |

  
  @DataTable
  Scenario: Verify that User able to add the multiple product to the cart
    Given User should be landed on the Product page
    And - User selects Product and clicks on Add to Cart button
    
      | Sauce Labs Bolt T-Shirt |
      | Sauce Labs Backpack     |
      | Sauce Labs Bike Light   |
      | Sauce Labs Fleece Jacket|
    Then User should able to see the product in My Cart
