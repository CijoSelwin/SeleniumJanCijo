package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	public MyHomePage() {
		PageFactory.initElements(driver,this);
	}	
@FindBy(how= How.LINK_TEXT,using="Create Lead")
private WebElement eleCreateLead;
public CreateLeadPage clickCreateLead() {
	click(eleCreateLead);
	return new  CreateLeadPage();
	
}

@FindBy(how=How.LINK_TEXT,using="Leads")
private WebElement eleLeads;

public MyLeadsPage clickLeads() {
	//WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(eleLeads);
	return new MyLeadsPage();		
}
}
