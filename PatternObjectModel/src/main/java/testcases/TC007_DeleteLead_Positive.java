package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DeleteLead_Positive extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "DeleteLead_Positive";
		testCaseName = "TC007_DeleteLead_Positive";
		testDescription = "To delete the existing lead";
		category= "Smoke";
		authors	="HVR";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void DeleteLeads(String userName, String passWord ,String phonenum)
	{

		FindLeadsPage flp =  new LoginPage(driver, test)

				.enterUserName(userName)
				.enterPassword(passWord)
				.clickLogin()
				.clickcrmsfaLinkBtn()
				.clickleadsTabBtn()
				.clickFindLeadsLink()
				.clickPhoneTab()
				.enterPhoneNumber(phonenum)
				.clickFindLeadsBtn();
		String firstreslead = flp.captureFirstLeadId();
		flp.clickFirstRecord()
		.clickDeleteBtn()
		.clickFindLeadsLink()
		.enterLeadId(firstreslead)
		.clickFindLeadsBtn()
		.captureErrorMess();

	}

}
