package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	
	public MergeLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	private WebElement eleFromLead;
	public FindLeadsPage clickFromLeadBtn() {
		click(eleFromLead);
		switchToWindow(0);
		return new FindLeadsPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleToLead;
	public FindLeadsPage clickToLeadBtn() {
		click(eleToLead);
		switchToWindow(0);
		return new FindLeadsPage(driver, test);
	}
	
}
