package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {
	String text1="";
	
	 public EditLead() {
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(how=How.ID,using="updateLeadForm_companyName")
	 private WebElement eleUpdateCompany;
	 
	 public EditLead updateCompanyName(String data) {
		  text1 = eleUpdateCompany.getText();
		 type(eleUpdateCompany, data);
		 
		return this;
		 
		 }
@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
private WebElement eleUpdate;
       public ViewLeads ClickUpdate() {
    	   
    	   click(eleUpdate);
    	   return new ViewLeads();
       }
    


}
