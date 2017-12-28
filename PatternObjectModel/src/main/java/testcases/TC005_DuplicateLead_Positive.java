package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DuplicateLead_Positive extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "DuplicateLead_Positive";
		testCaseName = "TC004_DuplicateLead_Positive";
		testDescription = "To check existing lead is a duplicate";
		category= "Smoke";
		authors	="HVR";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void DuplicateLead(String userName, String passWord, String email) {
		
		FindLeadsPage flp=new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmsfaLinkBtn()
		.clickleadsTabBtn()
		.clickFindLeadsLink()
		.clickEmailTab()
		.enterEmailId(email)
		.clickFindLeadsBtn();
		flp.captureFirstLeadName();
		flp.clickFirstLeadName()
		.clickDuplicateLeadBtn()
		.verifyDupLeadTitle()
		.clickCreateDupLeadBtn();
		
			
	}

}
