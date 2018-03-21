package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {

		testCaseName="TC004_EditLead";
		testDescription="Editing Lead";
		testNodes="edits";
		category="Smoke";
		authors="ram";
		browserName="chrome";
		dataSheetName="TC004";

	}


	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName, String num, String newupdate, String update) throws InterruptedException {

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
		.clickEdit()
		.updateCompanyName(newupdate)
		.ClickUpdate()
		.conformverifyPartialText(update);

	}

}

