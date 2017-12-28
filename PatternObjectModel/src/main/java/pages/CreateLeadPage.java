package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	public CreateLeadPage enterCompanyName(String comName) {
		type(eleCompanyName,comName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	public CreateLeadPage enterFirstName(String fName) {
		type(eleFirstName,fName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	public CreateLeadPage enterLastName(String lName) {
		type(eleLastName,lName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	private WebElement eleSource;
	public CreateLeadPage selectSource(String source) {
		selectDropDownUsingText(eleSource, source);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	private WebElement eleMarkCamp;
	public CreateLeadPage selectMarketCamp(String campaign) {
		selectDropDownUsingText(eleMarkCamp, campaign);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_currencyUomId")
	private WebElement eleCurrency;
	public CreateLeadPage selectCurrency(String prefCurrency) {
		selectDropDownUsingText(eleCurrency, prefCurrency);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_industryEnumId")
	private WebElement eleIndustry;
	public CreateLeadPage selectIndustry(String indEnum) {
		selectDropDownUsingText(eleIndustry, indEnum);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_ownershipEnumId")
	private WebElement eleOwnership;
	public CreateLeadPage selectOwnership(String ownEnum) {
		selectDropDownUsingText(eleOwnership, ownEnum);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalStateProvinceGeoId")
	private WebElement eleState;
	public CreateLeadPage selectStateProvince(String  stateProv) {
		int state=Integer.parseInt(stateProv);
		selectDropDownUsingIndex(eleState, state);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLead;
	public ViewLeadPage clickCreateLeadBtn() {
		click(eleCreateLead);
		return new ViewLeadPage(driver, test);
	}

}
