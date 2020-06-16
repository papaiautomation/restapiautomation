Feature: Application login

Scenario: Home page dafault login
Given User is on Netbanking landing page
When Enter username "Papai" and password "1234"
Then Home page is displayed
And Balance text is present "True"

Scenario: Home page dafault login
Given User is on Netbanking landing page
When Enter username "Tupai" and password "5678"
Then Home page is displayed
And Balance text is present "False"
