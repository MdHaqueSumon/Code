Feature: Sing In




Scenario: Possitive

Given user be able to open a browser
And go to home page

When i click on singin
And i enter valid user name
And i enter valid password
And i click Sing In button

Then I successfully Sing in