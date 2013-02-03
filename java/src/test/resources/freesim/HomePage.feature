Feature: Home Page

Scenario: Open Home Page
Given I am on home page
Then I should see the page title as "O2 | Free Sim | Order your free sims"

Scenario: Open Signup form
Given I am on home page
When I click on "simplicity"
Then I should see Signup form

Scenario: Fill Signup form
Given I am on home page
When I click on "simplicity"
And I fill in the Signup form
| title | firstName | lastName | email | houseNumber | town | postcode |
| Mr | Foo | Bar | foo@bar.com | 70 | London | TW31QB |
Then I should see the confirmation page for user "Foo"