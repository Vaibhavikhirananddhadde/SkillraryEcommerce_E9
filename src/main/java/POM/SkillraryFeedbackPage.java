package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryFeedbackPage {
	//Declaration
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement downloadInvoice;

	
	//Initialization
	public SkillraryFeedbackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void downloadInvoiceWebElement()
	{
		downloadInvoice.click();
	}
	

}
