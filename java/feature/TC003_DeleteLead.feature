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
When click on 'Find Leads' link
When click on Phone tab
When Enter the phone number as <phoneNumber>
When click on Find Leads button
When Click on the first LeadID
When click on 'Delete' link
When click on 'Find Leads' link
When Enter LeadId
When click on Find Leads button
Then Lead is deleted



Examples: 
  |phoneNumber|
  |'9'|
          