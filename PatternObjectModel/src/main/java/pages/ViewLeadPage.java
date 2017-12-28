package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFirstName;
	public ViewLeadPage verifyFirstName(String expectedText) {
		verifyExactText(eleVerifyFirstName, expectedText);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//a[@class='subMenuButton'])[3]")
	private WebElement eleEditBtn;
	public EditLeadPage clickEditBtn() {
		click(eleEditBtn);
		return new EditLeadPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='subMenuButtonDangerous']")
	private WebElement eleDeleteBtn;
	public MyLeadsPage clickDeleteBtn() {
		click(eleDeleteBtn);
		return new MyLeadsPage(driver, test);
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleUpdatedFirstName;
	public ViewLeadPage verifyUpdatedFirstName(String expectedText) {
		verifyPartialText(eleUpdatedFirstName, expectedText);
		return this;
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleTitle;
	public String verifyViewLeadTitle() {
		verifyTitle(browserName);
		return browserName;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDupLead;
	public DuplicateLeadPage clickDuplicateLeadBtn() {
		click(eleDupLead);
		return new DuplicateLeadPage(driver, test);
	}
	
}
