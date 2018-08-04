package AllActionsOnLeads;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeMethods implements WdMethods {
	public static RemoteWebDriver driver = null;
	int i = 1;
	public static Actions builder;
	public static WebDriverWait wait;

	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser " + browser + " is Launched Successfully");
		takeSnap();

	}
	
	public void mouseHover(WebElement ele) {
		builder = new Actions(driver);
		builder.moveToElement(ele).perform();
		//return ele;
	}
	
	public void waitForElementToBeVisible(WebElement ele) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	

	public WebElement locateElement(String locator, String locValue) {
		WebElement element = null;
		try {
			switch (locator) {
			case "id":
				element = driver.findElementById(locValue);
				break;
			case "class":
				element =  driver.findElementByClassName(locValue);
				break;
			case "xpath":
				element = driver.findElementByXPath(locValue);
				break;
			case "linktext":
				element = driver.findElementByLinkText(locValue);
				break;
			case "tagname":
				element = driver.findElementByTagName(locValue);
				break;
			case "css":
				element = driver.findElementByCssSelector(locValue);
				break;
			case "partiallinktext":
				element = driver.findElementByPartialLinkText(locValue);
				break;
			case "name":
				element = driver.findElementByName(locValue);
				break;
			}

		}

		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception has occurred");
			//e.printStackTrace();
			throw new RuntimeException();
			
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception has occurred");
			//e.printStackTrace();
			throw new RuntimeException();
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("General exception has occurred");
			//e.printStackTrace();
			throw new RuntimeException();
		}
		return element;

	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The Data " + data + " is Entered Successfully");
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element " + ele + " is clicked Successfully");
		takeSnap();
	}

	public String getText(WebElement ele) {
		String text = ele.getText();
		System.out.println("The text of the current element is = " + text);
		return text;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dd = new Select(ele);
		dd.selectByValue(value);
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select dd = new Select(ele);
		dd.selectByIndex(index);

	}

	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);

	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		boolean result;
		if (driver.getTitle().equalsIgnoreCase("")) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	public void verifyExactText(WebElement ele, String expectedText) {

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String expectedText1 = ele.getText();
		if(expectedText1.contains(expectedText)) {
			System.out.println("verifyPartialText - Partial text matches");
		}
		else {
			System.out.println("verifyPartialText - No matches");
		}

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		String expectedVal = ele.getAttribute("value");
		if(value.contains(expectedVal)) {
			System.out.println("verifyPartialAttribute - Partial value matches");
		}
		else {
			System.out.println("verifyPartialAttribute - No matches");
		}

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		boolean confirm = ele.isSelected();
		if (confirm == true) {
			System.out.println("The option " + ele + " is selected");
		} else {
			System.out.println("The option " + ele + " is not selected");
		}
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}
	

	public void switchToWindow(int index) {
		driver.switchTo().frame(index);
		System.out.println("Now you have switched to " + index + " frame in the webpage");

	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(ele);
		System.out.println("Now you have switched to another frame in the webpage");

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img" + i + ".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void clearField(WebElement ele) {
		ele.clear();
	}

	public void pressTab(WebElement ele) throws InterruptedException {
		ele.sendKeys(Keys.TAB);
		Thread.sleep(5000);
	}
	

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
		System.out.println("The current browser tab is closed");

	}

	public void closeAllBrowsers() {
		driver.quit();
		System.out.println("All the browser tabs corresponding to current instance are closed");

	}
	
	

}
