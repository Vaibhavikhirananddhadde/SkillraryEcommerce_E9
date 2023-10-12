package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
	//Declaration
	//address of gears button
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//address of skillrary demo app
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemo;
	
	//address of search textfiled
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchTf;
	
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement search;
	
	//address of cookies
	@FindBy(xpath="//a[text()='X']")
	private WebElement cookies;
	
	//initialization
	public SkillraryHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void gearsButton()
	{
		gearsbtn.click();
	}
	public void skillraryDemoApp()
	{
		skillraryDemo.click();
	}
	public void searchTextField(String data)
	{
		searchTf.sendKeys(data);
	}
	public void searchIcon()
	{
		search.click();
	}
	public void cookiesCancel()
	{
		cookies.click();
	}
	
	
	

}
