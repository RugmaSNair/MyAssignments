Feature: Create lead functionality

Scenario Outline: Create lead for mandatory fields

#Given Launch the browser
#And Load the Url
And Enter the Username as 'DemoSalesManager'
And Enter the password as 'crmsfa'

When click on the Login page
Then Welcome page is displayed
When click on 'CRM/SFA' link
When click on 'Leads' link
When click on 'Create Lead' link
When Enter the company name as <companyName>
When Enter the first name as <firstName>
When Enter the last name as <lastName>
When click on submit button

Then viewpage is displayed.

Examples: 
          |companyName|firstName|lastName|
          |'Testleaf'|'Rugma'|'S'|
          |'TCS'|'Padma'|'S'|
         