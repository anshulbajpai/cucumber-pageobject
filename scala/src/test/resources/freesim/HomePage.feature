Feature: Home Page

Scenario: Open Home Page
Given I am on home page
Then I should see the page title as "O2 | Free Sim | Order your free sims"

Scenario: Open Signup form
Given I am on home page
When I click on "simplicity"
Then I should see Signup form

#  Scenario: Fill Signup form
#  Given I am on home page
#  When I click on "simplicity"
#  And I fill in the Signup form
#  | title | firstName |
#  | Mr | Foo |
#  | lastName | Bar |
#  | email | foo@bar.com |
#  | mobile | 07466838123 |
#  | houseNumber | 70 |
#  | postcode | TW31QA |
