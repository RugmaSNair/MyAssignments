Feature: LeafTaps Login functionality

Scenario: Login with positive credentials

#Given Launch the browser
#And Load the Url
And Enter the Username as 'DemoSalesManager'
And Enter the password as 'crmsfa'

When click on the Login page
Then Welcome page is displayed


Scenario: Login with invalid credentials

#Given Launch the browser
 And Enter the Username as 'demo'
And Enter the password as 'crm'

When click on the Login page
But Error message is displayed
