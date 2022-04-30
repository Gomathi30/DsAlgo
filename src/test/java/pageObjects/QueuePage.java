package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage extends BaseClass {
	
	public QueuePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[@href='implementation-lists']")
	WebElement qimpllistlnk;
	
	@FindBy (xpath = "//a[@href='implementation-collections']")
	WebElement qimplcollectionlnk;
	
	@FindBy (xpath = "//a[@href='Implementation-array']")
	WebElement qimplarraylnk;
	
	@FindBy (xpath = "//a[@href='QueueOp']")
	WebElement qimplqueueoplnk;
	
	public void clickOnQImplUsingListLink()
	{
		qimpllistlnk.click();
	}
	public void clickOnQImplCollectionListLink()
	{
		qimplcollectionlnk.click();
	}
	public void clickOnQImplArrayLink()
	{
		qimplarraylnk.click();
	}
	public void clickOnQImplQueueOpLink()
	{
		qimplqueueoplnk.click();
	}
	
		
}
