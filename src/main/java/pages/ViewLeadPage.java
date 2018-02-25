package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {
	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleViewLeadCompanyName;
	
public ViewLeadPage verifyViewLeadCompanyName(String data) {
	verifyPartialText(eleViewLeadCompanyName, data);
	return this;
}
@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
private WebElement eleDuplicateLead;

public DuplicateLead clickDuplicateButton() {
	//WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(eleDuplicateLead);
	return new DuplicateLead();		
}
@FindBy(how=How.LINK_TEXT,using="Edit")
private WebElement eleEditLead;

public EditLeadPage clickEditButton() {
	//WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(eleEditLead);
	return new EditLeadPage();		
}
@FindBy(how=How.LINK_TEXT,using="Delete")
private WebElement eleDeleteLead;

public MyLeadsPage clickDeleteButton() {
	//WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(eleDeleteLead);
	return new MyLeadsPage();		
}


}
