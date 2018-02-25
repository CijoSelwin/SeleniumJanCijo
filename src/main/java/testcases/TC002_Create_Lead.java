package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_Create_Lead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateLead";
		testDescription="Create Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Cijo";
		browserName="chrome";
		dataSheetName="TC001";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName) throws InterruptedException {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmSfa()
		.clickCreateLead()
		.enterCompanyName("Payoda")
		.enterFirstName("Cijo")
		.enterLastName("selwin")
		.clickCreateLeadSubmitButton()
		.verifyViewLeadCompanyName("Payoda")
		.closeBrowser();
		
		
		
		
		
		
	}

}
