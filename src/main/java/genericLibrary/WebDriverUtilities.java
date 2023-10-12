package genericLibrary;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	//1.Handling dropdown
	public void dropDown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	//2.Handling mouse over
	public void mouseOvering(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();;
	}
	//3.Handling rightClick
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	//4.Handling double click
	public void doubleClicking(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();;
	}
	//5.Handling drag and drop
	public void dragAndDroping(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}
	//6.Handling frames
	public void frames(WebDriver driver,String value)
	{
		driver.switchTo().frame(value);
	}
	//7.Handling default content
	public void defaultContent(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	//8.Scrolling with coordinates
	public void scrolling(WebDriver driver,int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	//9.Scrolling
	public void scrolling(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",ele);
		
	}
	//10.Handling Popup
	public void popUp(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	//11.Child Browser
	public void childBrowser(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
		   driver.switchTo().window(b);
		}
	}

}
