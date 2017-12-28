package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLead_Positive extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "MergeLead_Positive";
		testCaseName = "TC005_MergeLead_Positive";
		testDescription = "To merge two existing leads";
		category= "Smoke";
		authors	="HVR";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void MergeLead(String userName, String passWord) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmsfaLinkBtn()
		.clickleadsTabBtn()
		.clickMergeLeadsLink()
		.clickFromLeadBtn()
		.clickFindLeadsBtn()
		.clickFirstRecord();
			
	}

}
