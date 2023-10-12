package Scripts;

import org.testng.annotations.Test;

import POM.SkillraryDemoPage;
import POM.SkillraryHomePage;
import POM.SkillraryTestingPage;
import genericLibrary.BaseClass;


public class TestScript1 extends BaseClass{
	@Test
	public void tc1() throws Throwable
	{
		SkillraryHomePage sH=new SkillraryHomePage(driver);
		sH.gearsButton();
		sH.skillraryDemoApp();
		utilities.childBrowser(driver);
		SkillraryDemoPage sD=new SkillraryDemoPage(driver);
		utilities.dropDown(sD.getSearchDd(), pdata.getPropertyData("coursedd"));
		SkillraryTestingPage sT=new SkillraryTestingPage(driver);
		utilities.scrolling(driver, sT.getFb());
	}

}
