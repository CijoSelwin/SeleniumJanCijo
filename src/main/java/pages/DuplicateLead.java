package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods {
	public DuplicateLead() {
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public DuplicateLead enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;		
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadSubmitButton;
	
	public ViewLeadPage clickCreateLeadSubmitButton() {
		click(eleCreateLeadSubmitButton);
		return new ViewLeadPage();		
	}
	
}
