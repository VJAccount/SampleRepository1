package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage extends Annotations {
	
	private static final String String = null;

	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "createLeadForm_companyName")
    WebElement eleCompanyName;
	@FindBy(id = "createLeadForm_firstName")
    WebElement eleFirstName;
	@FindBy(id = "createLeadForm_lastName")
    WebElement eleLastName;
	@FindBy(id = "createLeadForm_primaryEmail")
    WebElement eleEmail;
	@FindBy(id = "createLeadForm_primaryPhoneNumber")
    WebElement elePhoneNum;
	@FindBy(className = "smallSubmit")
    WebElement eleCreateLeadButton;
	@FindBy(className = "errorList")
    WebElement eleErrorMessage;
	
	public CreateLeadPage enterCompanyName(String cName) {
		type(eleCompanyName,cName);
		return this;
	}
	public CreateLeadPage enterFirstName(String fName) {
		type(eleFirstName,fName);
		return this;
	}
	public CreateLeadPage enterLastName(String lName) {
		type(eleLastName,lName);
		return this;
	}
	/*public CreateLeadPage getFirstNameText() {
		getValueOfField(eleFirstNameValue);
		return this;
	}*/
	public CreateLeadPage enterEmail(String email) {
		type(eleEmail,email);
		return this;
	}
	public CreateLeadPage enterPhone(String phone) {
		type(elePhoneNum,""+phone);
		return this;
	}
	
	public CreateLeadPage clickCreateLeadButtonForError() {
		click(eleCreateLeadButton);
		return this;
	}
	
	public CreateLeadPage verifyError(String errMsg) {
		verifyPartialText(eleErrorMessage,errMsg);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		click(eleCreateLeadButton);
		return new ViewLeadPage();
	}
}
