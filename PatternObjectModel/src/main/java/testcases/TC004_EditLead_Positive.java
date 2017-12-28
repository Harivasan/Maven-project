package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead_Positive extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "EditLead_Positive";
		testCaseName = "TC004_EditLead_Positive";
		testDescription = "To edit the existing lead";
		category= "Smoke";
		authors	="HVR";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord, String fName, String ucName) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmsfaLinkBtn()
		.clickleadsTabBtn()
		.clickFindLeadsLink()
		.enterFirstName(fName)
		.clickFindLeadsBtn()
		.clickFirstRecord()
		//.verifyViewLeadTitle()
		.clickEditBtn()
		.updateCompanyName(ucName)
		.clickUpdateBtn();
		//.verifyUpdatedFirstName();
			
	}

}
