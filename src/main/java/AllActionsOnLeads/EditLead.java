package AllActionsOnLeads;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditLead extends Annotations{
	@Test(groups= {"regression"})
	public void editLead() {
		try {
			WebElement eleCreateLeadButton = locateElement("linktext","Create Lead");
			click(eleCreateLeadButton);
			WebElement eleFindLeadsOption = locateElement("linktext","Find Leads");
			click(eleFindLeadsOption);
			WebElement eleLeadIdField = locateElement("xpath","(//input[@class=' x-form-text x-form-field'])[24]");
			waitForElementToBeVisible(eleLeadIdField);
			type(eleLeadIdField, "1");
			Thread.sleep(3000);
			WebElement eleFindLeadsButton = locateElement("xpath","(//button[@class='x-btn-text'])[7]");
			click(eleFindLeadsButton);
			//WebElement eleClickSearchResult = locateElement("linktext","10041");
			WebElement eleClickSearchResult = locateElement("xpath","(//div[@class='x-grid3-row   ']//div/a)[1]");
			click(eleClickSearchResult);
			WebElement eleEditButton = locateElement("linktext","Edit");
			click(eleEditButton);
			WebElement eleCompanyName = locateElement("updateLeadForm_companyName");
			clearField(eleCompanyName);
			type(eleCompanyName, "Amazon");
			pressTab(eleCompanyName);
			System.out.println("The new company name before update = "+driver.findElementById("updateLeadForm_companyName").getAttribute("value"));
			WebElement eleUpdateButton = locateElement("xpath","//input[@value='Update']");
			click(eleUpdateButton);
			//WebElement eleUpdatedCompanyName = locateElement("linktext","Company Name");
			System.out.println("The new company name after update = "+driver.findElementById("viewLead_companyName_sp").getText());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
