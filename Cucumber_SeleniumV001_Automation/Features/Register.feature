Feature: Register

Scenario: User is new to Register the Application
	Given User Launch the Firefox Browser
	When User opens the URL "https://demowebshop.tricentis.com/"
	And User click on the Register Link
	And User enter the gender as "male",first Name as "sivaji",last name as "kumar"
	And User enter the Email id as "sivaji@gk.com" and Password as "123456"
	And click on Register
	And click on Continue btn
	Then Page Title should be display "Demo Web Shop"
	When User click on log out link
	And closed browser

