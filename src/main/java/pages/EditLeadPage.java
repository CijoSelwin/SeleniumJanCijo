package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {
	public EditLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public EditLeadPage enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;		
	}
	//submitButton
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleEditLeadSubmitButton;
	
	public ViewLeadPage clickEditLeadSubmitButton() {
		click(eleEditLeadSubmitButton);
		return new ViewLeadPage();		
	}
	
	}
