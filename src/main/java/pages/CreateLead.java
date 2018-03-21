package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
	
	static String txt ="";

	public CreateLead() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	  public CreateLead enterCompanyName(String data) {
		  type(eleCompanyName, data);
		  txt=eleCompanyName.getText();
		return this;
	  }
	  
	  @FindBy(how=How.ID,using="createLeadForm_firstName")
	  private WebElement eleFirstName;
	  
	  public CreateLead enterFirstName(String data) {
		  //txt=  eleFirstName.getText();
		  type(eleFirstName, data);
		return this;
	  }
	
	  @FindBy(how=How.ID,using="createLeadForm_lastName")
	  private WebElement eleLastName;
	  
	  public CreateLead enterLastName(String data ) {
		  type(eleLastName,data);
		  return this;
	  }
	  
	  
	  @FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	  private WebElement eleSource;
	  public CreateLead selectFromSource(String data) {
		  selectDropDownUsingText(eleSource, data);
		return this;
	  }
     
	  @FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	  private WebElement eleMarketCampain;
	  public CreateLead selectFromMarketCampain(int data) {
		  selectDropDownUsingIndex(eleMarketCampain, data);
		return this;
	  }
	  
	  @FindBy(how=How.CLASS_NAME, using="smallSubmit")
	  private WebElement eleUpadate;
	  
	  public ViewLeads clickUpdate() {
		  click(eleUpadate);
		return new ViewLeads();
	  }

}


