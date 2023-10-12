package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryTestingPage {
	//Declaration
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fb;
	
	//Initialization
	public SkillraryTestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	public void facebook()
	{
		fb.click();
	}

	public WebElement getFb() {
		return fb;
	}

	
	
	

}
