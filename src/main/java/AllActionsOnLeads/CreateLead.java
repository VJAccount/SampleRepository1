package AllActionsOnLeads;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends Annotations {
	@Test(groups= {"smoke"})
	public void createLead()	 {
		try {
			WebElement eleCreateLeadButton = locateElement("linktext","Create Lead");
			click(eleCreateLeadButton);
			WebElement eleCompanyName = locateElement("createLeadForm_companyName");
			type(eleCompanyName,"ABC");
			WebElement eleFirstName = locateElement("createLeadForm_firstName");
			type(eleFirstName,"DEF");
			WebElement eleLastName = locateElement("createLeadForm_lastName");
			type(eleLastName,"FGR");
			WebElement eleFirstNameLocal = locateElement("createLeadForm_firstNameLocal");
			type(eleFirstNameLocal,"V");
			WebElement eleLastNameLocal = locateElement("createLeadForm_firstNameLocal");
			type(eleLastNameLocal,"J");
			WebElement elePersTitle = locateElement("createLeadForm_personalTitle");
			type(elePersTitle,"Mr.");
			WebElement eleGenProfTitle = locateElement("createLeadForm_generalProfTitle");
			type(eleGenProfTitle,"Automation Lead");
			WebElement eleAnnualRevenue = locateElement("createLeadForm_annualRevenue");
			type(eleAnnualRevenue,"10000$");
			WebElement eleIndDd = locateElement("createLeadForm_industryEnumId");
			selectDropDownUsingText(eleIndDd,"IND_DISTRIBUTION");
			WebElement ownershipDd = locateElement("createLeadForm_ownershipEnumId");
			selectDropDownUsingIndex(ownershipDd,6);
			WebElement markcampDd = locateElement("createLeadForm_marketingCampaignId");
			selectDropDownUsingText(markcampDd,"CATRQ_CAMPAIGNS");
			WebElement prefCurrDd = locateElement("createLeadForm_currencyUomId");
			selectDropDownUsingVisibleText(prefCurrDd,"INR - Indian Rupee");
			WebElement eleNoOfEmp = locateElement("xpath","//input[@name='numberEmployees']");
			type(eleNoOfEmp,"1500");
			WebElement eleDesc = locateElement("createLeadForm_description");
			type(eleDesc,"This is a test id created for demo purpose");
			WebElement eleImpNote = locateElement("createLeadForm_importantNote");
			type(eleImpNote,"Do not share the username & password with anyone");
			Thread.sleep(3000);
			WebElement eleCountryCode = locateElement("createLeadForm_primaryPhoneCountryCode");
			clearField(eleCountryCode);
			type(eleCountryCode,"+91");
			WebElement eleAreaCode = locateElement("createLeadForm_primaryPhoneAreaCode");
			type(eleAreaCode,"044");
			WebElement elePhoneExt = locateElement("createLeadForm_primaryPhoneExtension");
			type(elePhoneExt,"12345");
			WebElement eleDeptName = locateElement("createLeadForm_departmentName");
			type(eleDeptName,"Customer Relations");
			WebElement elecurrencyDd = locateElement("createLeadForm_currencyUomId");
			selectDropDownUsingVisibleText(elecurrencyDd,"INR - Indian Rupee");

			WebElement eleTickerSymbol = locateElement("createLeadForm_tickerSymbol");
			type(eleTickerSymbol,"AGX");
			WebElement elePhoneToAskFor = locateElement("createLeadForm_primaryPhoneAskForName");
			type(elePhoneToAskFor,"Shyam");
			WebElement eleWebURL = locateElement("createLeadForm_primaryWebUrl");
			type(eleWebURL,"www.doorwaytofly.in");
			WebElement eleToName = locateElement("createLeadForm_generalToName");
			type(eleToName,"Gaurav");
			WebElement eleAddressLine1 = locateElement("createLeadForm_generalAddress1");
			type(eleAddressLine1,"N0.1, 2nd street");
			WebElement eleAddressLine2 = locateElement("createLeadForm_generalAddress2");
			type(eleAddressLine2,"Chromepet");
			WebElement eleCity = locateElement("createLeadForm_generalCity");
			type(eleCity,"Chennai");

			WebElement eleCountryDd = locateElement("createLeadForm_generalCountryGeoId");
			type(eleCountryDd,"India");
			pressTab(eleCountryDd);
			WebElement eleStateDd = locateElement("createLeadForm_generalStateProvinceGeoId");
			selectDropDownUsingVisibleText(eleStateDd, "TAMILNADU");
			WebElement eleZipCode = locateElement("createLeadForm_generalPostalCode");
			type(eleZipCode,"600125");
			WebElement elePostCodeExt = locateElement("createLeadForm_generalPostalCodeExt");
			type(elePostCodeExt,"001");
			WebElement elePhoneNumber = locateElement("createLeadForm_primaryPhoneNumber");
			type(elePhoneNumber, "9887776666");
			WebElement eleEmail = locateElement("createLeadForm_primaryEmail");
			type(eleEmail,"abc@def.com");
			WebElement eleCreateButton = locateElement("xpath","//input[@value='Create Lead']");
			click(eleCreateButton);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
