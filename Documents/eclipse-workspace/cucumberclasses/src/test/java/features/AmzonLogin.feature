Feature: Amazon Login Test

Scenario: Login with valid Credentials

Given  User Open Chrome Browser 
And  Launch the Application 
When  User enter valid Username and Password
Then  Click Login 
Then  See the Amazon Home page
