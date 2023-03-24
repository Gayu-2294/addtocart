Feature: 
      To validate the add to cart functionality of filpkart application

  Scenario: 
    To check the user add the product to the cart and remove the product from the cart

    Given user launch the url of amazon page and do a product search
    When user select any product and add that to the cart
    And user place order and login the application using correct credential
    And user select address and select payment option
    Then user remove the product from the cart
