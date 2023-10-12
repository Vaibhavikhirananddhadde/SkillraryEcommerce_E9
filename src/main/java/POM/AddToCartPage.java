package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	//Declaration
	@FindBy(id="add")
	private WebElement plus;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement AddCart;
	
	//Initialization
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getPlus() {
		return plus;
	}
	
	public void addToCart()
	{
		AddCart.click();
	}

	
	

}
