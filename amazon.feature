Feature: Amazon console report

Scenario: Amazon console report

Given user navigates the application
When user clicks on All option
Then user navigates to TV, appliances, Electronics tab and click on it
And user click on Television
Then scroll the page 
And filter it by Samsung
Then sort it by price high to low
And click on the 2nd highest price 
Then switch to the child window
And assert about the item in the page