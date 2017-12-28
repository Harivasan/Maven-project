package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead_Positive extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "CreateLead_Positive";
		testCaseName = "TC003_CreateLead_Positive";
		testDescription = "To create a new lead with mandatory fields";
		category= "Smoke";
		authors	="HVR";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord, String cName,String fName,String lName,
			String source,String campaign,String currency,String industry,String owner,String state) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmsfaLinkBtn()
		.clickleadsTabBtn()
		.clickCreateLeadLink()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.selectSource(source)
		.selectMarketCamp(campaign)
		.selectCurrency(currency)
		.selectIndustry(industry)
		.selectOwnership(owner)
		.selectStateProvince(state)
		.clickCreateLeadBtn();
		//.verifyFirstName(expText);
			
	}

}
