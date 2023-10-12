package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoPage {
	//Declaration
	//address of course 
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement course;
	
	//address of search dropdown
	@FindBy(name="addresstype")
	private WebElement searchDd;
	
	//address of feedback
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedbackBtn;
	
	//Initialization
	public SkillraryDemoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getCourse() {
		return course;
	}


	public WebElement getSearchDd() {
		return searchDd;
	}
	
	public void feedbackButton()
	{
		feedbackBtn.click();
	}


	
	

}
