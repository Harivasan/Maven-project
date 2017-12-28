package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	public FindLeadsPage clickFindLeadsBtn() {
		click(eleFindLeads);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@class=' x-form-text x-form-field']")
	private WebElement eleLeadId;
	public FindLeadsPage enterLeadId(String leadId) {
		type(eleLeadId,leadId);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	public FindLeadsPage enterFirstName(String fName) {
		type(eleFirstName,fName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmailTab;
	public FindLeadsPage clickEmailTab() {
		click(eleEmailTab);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement eleEmailId;
	public FindLeadsPage enterEmailId(String email) {
		type(eleEmailId,email);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//span[@class='x-tab-strip-text '])[2]")
	private WebElement elePhoneTab;
	public FindLeadsPage clickPhoneTab() {
		click(elePhoneTab);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elePhoneNumber;
	public FindLeadsPage enterPhoneNumber(String phone) {
		type(elePhoneNumber,phone);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement eleFirstRecord;
	public ViewLeadPage clickFirstRecord() {
		click(eleFirstRecord);
		return new ViewLeadPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")
	private WebElement elecaptureFirstLeadId;
	public String captureFirstLeadId() {
		String leadId=getText(elecaptureFirstLeadId);
		return leadId;
	}
	
	@FindBy(how=How.XPATH,using="(//*[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']/div/a)")
	private WebElement elecaptureFirstLeadName;
	public String captureFirstLeadName() {
		String leadName=getText(elecaptureFirstLeadName);
		return leadName;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement elecaptureErrorMess;
	public String captureErrorMess() {
		String errorMess=getText(elecaptureErrorMess);
		return errorMess;
	}
	
	@FindBy(how=How.XPATH,using="(//*[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']/div/a)")
	private WebElement firstLeadName;
	public ViewLeadPage clickFirstLeadName() {
		click(firstLeadName);
		return new ViewLeadPage(driver, test);
	}
	
}
