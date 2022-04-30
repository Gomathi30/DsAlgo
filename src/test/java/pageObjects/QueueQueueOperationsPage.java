package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueueQueueOperationsPage extends BaseClass{
	
	public QueueQueueOperationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/queue/implementation-lists/']")
	WebElement qimpllistlnk;
	
	@FindBy(xpath="//a[@href='/queue/implementation-collections/']")
	WebElement qimplcollectionlnk;
	
	@FindBy(xpath="//a[@href='/queue/Implementation-array/']")
	WebElement qimplementationarraylnk;
	
	@FindBy(xpath="//a[@href='/queue/QueueOp/']")
	WebElement qqueueoplnk;
	
	
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement tryEditor;
	
	@FindBy(xpath="//a[@href='/queue/practice']")
	WebElement practiceques;
	
	//Actions on WebElements in Queue implementation using list page
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
		qimplementationarraylnk.click();
	}
	public void clickOnQImplQueueOpLink()
	{
		qqueueoplnk.click();
	}
	public void clickOnTryEditorLink()
	{
		tryEditor.click();
	}
	
	public void clickOnPracticeQuesLink()
	{
		practiceques.click();
	}
	
}
