package Scripts;

import org.testng.annotations.Test;

import POM.SkillraryDemoPage;
import POM.SkillraryFeedbackPage;
import POM.SkillraryHomePage;
import genericLibrary.BaseClass;

public class TestScript2 extends BaseClass{
	@Test
	public void tc2()
	{
		SkillraryHomePage sH=new SkillraryHomePage(driver);
		sH.gearsButton();
		sH.skillraryDemoApp();
		utilities.childBrowser(driver);
		SkillraryDemoPage sD=new SkillraryDemoPage(driver);
		sD.feedbackButton();
		SkillraryFeedbackPage sF=new SkillraryFeedbackPage(driver);
		sF.downloadInvoiceWebElement();
	}

}
