package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	public FindLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.LINK_TEXT,using="Phone")
	private WebElement elePhone;

	public FindLeadsPage clickPhone() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(elePhone);
		return new FindLeadsPage();		
	}
	//phoneNumber//button[text()='Find Leads']
	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement elePhoneNumberTextField;

	public FindLeadsPage enterPhoneNumberTextField(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(elePhoneNumberTextField, data);
		return new FindLeadsPage();		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;

	public FindLeadsPage clickFindLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleFindLeads);
		return new FindLeadsPage();		
	}
	
	//(//div[@class='x-grid3-cell-inner x-grid3-col-formatedPrimaryPhone'])[3]
	//(//a[@class='linktext'])[4]
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement eleFirstResult;

	public ViewLeadPage clickFirstResult() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleFirstResult);
		return new ViewLeadPage();		
	}
}
