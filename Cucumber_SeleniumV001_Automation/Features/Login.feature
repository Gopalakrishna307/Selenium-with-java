Feature: Login

Scenario: Successful login with valid Credentials
	Given User Launch Chrome Browser
	When User opens URL "https://github.com/login"
	And User enters Email as "Gopalakrishna307" and Password as "Krishna@9502978263"
	And Click on Login
	Then Page Title should be "GitHub"
#	When User click on Log out link
	And close browser
	
