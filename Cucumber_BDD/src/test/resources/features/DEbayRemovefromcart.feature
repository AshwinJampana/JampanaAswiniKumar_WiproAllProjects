Feature: Remove From cart
Scenario: Removing item from cart
Given ebay site should be opened in default browser
When click on sigin and complete signin process
And click on cart and remove item from cart
Then successful remove from cart