package AllActionsOnLeads;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DuplicateLead extends Annotations {
@Test
	public void duplicateLead() {
		WebElement eleCreateLeadButton = locateElement("linktext","Create Lead");
		click(eleCreateLeadButton);
		WebElement eleFindLeadsOption = locateElement("linktext","Find Leads");
		click(eleFindLeadsOption);
		WebElement eleEmailTab = locateElement("xpath","(//span[@class='x-tab-strip-inner'])[3]");
		click(eleEmailTab);
		WebElement eleEmailIdField = locateElement("name","emailAddress");
		type(eleEmailIdField, "abc@def.com");
		WebElement eleFindLeadsButton = locateElement("xpath","//button[text()='Find Leads']");
		click(eleFindLeadsButton);
		WebElement eleFirstSearchResult = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		click(eleFirstSearchResult);
		String FirstName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println("The First Name is = "+FirstName);
		WebElement eleDuplicateLeadButtonn = locateElement("linktext","Duplicate Lead");
		click(eleDuplicateLeadButtonn);
		WebElement eleParentPartyId = locateElement("createLeadForm_parentPartyId");
		type(eleParentPartyId, "1234");
		
	}
	
}
