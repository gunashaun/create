package testcases;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		
		testCaseName="TC005_DeleteLead";
		testDescription="Deleting Lead";
		testNodes="delets";
		category="Smoke";
		authors="ram";
		browserName="chrome";
		dataSheetName="TC005";
		
	}	
		@Test(dataProvider="fetchData")
		public void loginAndLogout(String uName,String pwd,String vName, String num, String num1, String norecords) throws InterruptedException  {

			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.verifyLoggedName(vName)
			.ClickCrms()
			.ClickLeads()
			.clickFindLeads()
			.enterLeadID(num)
			.ClicksearchFindLeads()
			.clickFirstName()
			.clickDelete()
			.clickFindLeads()
			.enterLeadID(num1)
			.ClicksearchFindLeads()
			.verifyPartial(norecords);



	
	}
}