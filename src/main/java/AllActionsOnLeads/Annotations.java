package AllActionsOnLeads;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Annotations extends SeMethods {
	
	@BeforeMethod(groups= {"smoke"})
	public void beforeMethod() {
		startApp("chrome","http://leaftaps.com/opentaps/control/login");
		WebElement eleUserName = locateElement("id","username");
		type(eleUserName,"demosalesmanager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword,"crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement eleCrmSfaOption = locateElement("linktext","CRM/SFA");
		click(eleCrmSfaOption);
	}

	@AfterMethod(groups= {"smoke"})
	public void afterMethod() {
		closeAllBrowsers();
	}

}
